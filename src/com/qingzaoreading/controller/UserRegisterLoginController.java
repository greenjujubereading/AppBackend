package com.qingzaoreading.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.qingzaoreading.pojo.po.User;
import com.qingzaoreading.pojo.po.VerifyCode;
import com.qingzaoreading.service.UserRegisterLoginService;

import Md5.Md5;
import OSS.FilePath;




@Controller
@CrossOrigin
public class UserRegisterLoginController {

	@Autowired
	private UserRegisterLoginService  userRegisterLoginService;

	public static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	
	
	@RequestMapping(value = {"/sendSms"}, method={RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> sendSms(String user_phone) {
		Map map=new HashMap<String,Object>();
		 
		if(!Pattern.matches(REGEX_MOBILE, user_phone)) {
			map.put("result", false);
			map.put("information", "手机号不错");
			return map;
		}
		String testUsername = "qingzao"; //在短信宝注册的用户名
		String testPassword = "qingzao2018"; //在短信宝注册的密码
		String testPhone = user_phone;
		String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
		String testContent = "【青枣读书】您的验证码为"+verifyCode+"，在5分钟内有效。"; // 注意测试时，也请带上公司简称或网站签名，发送正规内容短信。千万不要发送无意义的内容：例如 测一下、您好。否则可能会收不到

		String httpUrl = "http://api.smsbao.com/sms";

		StringBuffer httpArg = new StringBuffer();
		httpArg.append("u=").append(testUsername).append("&");
		httpArg.append("p=").append(md5(testPassword)).append("&");
		httpArg.append("m=").append(testPhone).append("&");
		httpArg.append("c=").append(encodeUrlString(testContent, "UTF-8"));

		String result = request(httpUrl, httpArg.toString());
		System.out.println(result);
		 
			 VerifyCode vc=new VerifyCode();
			 vc.setUser_phone(user_phone);
			 vc.setVerify_code(verifyCode);
			 userRegisterLoginService.deleteVerifyCode(vc);
			 userRegisterLoginService.addVerifyCode(vc);
			 map.put("result", true);
				map.put("information", "发送成功");
		return map;
	}
	
	
	//register
	/**
	 * 
	 * @param request
	 * @param user_phone
	 * @param user_password
	 * @param verifyCode
	 * @return
	 */
	
	@RequestMapping(value = {"/register"}, method={RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> register(
			String user_phone,
			String user_password,
			String verifyCode) {
//		System.out.println("user_phone"+user_phone);
//		System.out.println("user_password"+user_password);
//		System.out.println("verifyCode"+verifyCode);
		
		 VerifyCode vc=userRegisterLoginService.getVerifyCodeByphone(user_phone);
		 
		Map map=new HashMap<String,Object>();
		
		if(vc==null||(vc!=null&&!vc.getVerify_code().equals(verifyCode))){
			
			map.put("result", false);
			map.put("date", "验证码错误");
			return map;
		}
        if(vc!=null) {
        	long dis=new Date().getTime()-vc.getData().getTime();
        	if(dis>1000*60) {
        		map.put("result", false);
    			map.put("date", "验证码超时");
    			userRegisterLoginService.deleteVerifyCode(vc);
    			return map;
        	}
        }
		User u=new User();

		u.setUser_phone(user_phone);
		User user=userRegisterLoginService.getUserByPhoneNumber(u);
		int user_total=userRegisterLoginService.getUserTotal();
		
		 
		if(user==null) {
			
			User newuser=new User();
			newuser.setUser_name("用户"+(user_total+1));
			newuser.setUser_head_portrait_url("szp.jpg");
			
			newuser.setUser_integral(0L);
			newuser.setUser_password(Md5.GetMD5Code(user_password));
			newuser.setUser_invited_user_id(null);
			newuser.setUser_is_it_vip("0");
			newuser.setUser_money(new BigDecimal("0.0"));
			newuser.setUser_phone(user_phone);
			newuser.setUser_student_id(user_total+100000L);
			newuser.setUser_type("1");
			newuser.setUser_vip_expiration_time(null);
			newuser.setUser_wechat_number(null);
			userRegisterLoginService.addUser(newuser);
			map.put("result", true);
			map.put("information", "注册成功");
			
			map.put("user_name", newuser.getUser_name());
			map.put("user_student_id", newuser.getUser_student_id());
			map.put("user_head_portrait_url", newuser.getUser_head_portrait_url());
			map.put("user_is_it_vip", newuser.getUser_is_it_vip());
			map.put("user_vip_expiration_time", newuser.getUser_vip_expiration_time());
			map.put("user_sex", newuser.getUser_sex());
			map.put("user_birthday", newuser.getUser_birthday());
			map.put("user_grade", newuser.getUser_grade());
			userRegisterLoginService.deleteVerifyCode(vc);
			return map;
		}
		else if(user.getUser_id()!=null&&user.getUser_type().equals("1")) //真用户
		{
			
			map.put("result", false);
			map.put("information", "手机号已经存在");
			userRegisterLoginService.deleteVerifyCode(vc);
			  return map;
		}
		else //假用户
		{
			//给假用户设置密码
			System.out.println("给假用户设置密码"+user_password);
			System.out.println("用户名为"+user.getUser_name());
			user.setUser_password(Md5.GetMD5Code(user_password));
			userRegisterLoginService.setPassword(user);

			//记入邀请人id

			//假用户，修改用户类型为1
			userRegisterLoginService.changeUserTypeToTrue(user);
			map.put("result", true);
			map.put("user_name", user.getUser_name());
			
			map.put("user_name", user.getUser_name());
			map.put("user_student_id", user.getUser_student_id());
			map.put("user_head_portrait_url", user.getUser_head_portrait_url());
			map.put("user_is_it_vip", user.getUser_is_it_vip());
			map.put("user_vip_expiration_time", user.getUser_vip_expiration_time());
			map.put("user_sex", user.getUser_sex());
			map.put("user_birthday", user.getUser_birthday());
			map.put("user_grade", user.getUser_grade());
			userRegisterLoginService.deleteVerifyCode(vc);
			 return map;
		}
	    
		
	}
	
	
	
	@RequestMapping(value = {"/loginbypassword"}, method={RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> loginbypassword(
			HttpServletRequest request, 
			String user_phone,
			String user_password) {
		
		Map map=new HashMap<String,Object>();
		
		User u=new User();

		u.setUser_phone(user_phone);
		u.setUser_password(Md5.GetMD5Code(user_password));
		User user=userRegisterLoginService.getUserByPhoneNumberAndPassword(u);
		if(user==null)
				map.put("result", false);
		else
		{
			map.put("result", true);
			map.put("user_name", user.getUser_name());
			map.put("user_student_id", user.getUser_student_id());
			String url=FilePath.getUrl(user.getUser_head_portrait_url());
			map.put("user_head_portrait_url", url);
			map.put("user_is_it_vip", user.getUser_is_it_vip());
			map.put("user_vip_expiration_time", user.getUser_vip_expiration_time());
			map.put("user_sex", user.getUser_sex());
			map.put("user_birthday", user.getUser_birthday());
			map.put("user_grade", user.getUser_grade());
		}
			
		return map;
	
		
	}

	
	
	
	
	
	
	@RequestMapping(value = {"/loginbyverifycode"}, method={RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> login(
			String user_phone,
			String verifyCode) {
		 VerifyCode vc=userRegisterLoginService.getVerifyCodeByphone(user_phone);
		 vc.setUser_phone(user_phone);
		Map map=new HashMap<String,Object>();
		
		if(vc!=null&&!vc.getVerify_code().equals(verifyCode)){
			map.put("result", false);
			map.put("date", "验证码错误");
			return map;
		}
		  if(vc!=null) {
				long dis=new Date().getTime()-vc.getData().getTime();
	        	 
	        	if(dis>1000*60) {
	        		
	        		map.put("result", false);
	    			map.put("date", "验证码超时");
	    			userRegisterLoginService.deleteVerifyCode(vc);
	    			return map;
	        	}
	        }
		User u=new User();

		u.setUser_phone(user_phone);
		User user=userRegisterLoginService.getUserByPhoneNumber(u);
		if(user==null) {
			map.put("result", false);
		}
		else {
			map.put("result", true);
			map.put("user_name", user.getUser_name());
			map.put("user_student_id", user.getUser_student_id());
			map.put("user_head_portrait_url", user.getUser_head_portrait_url());
			map.put("user_is_it_vip", user.getUser_is_it_vip());
			map.put("user_vip_expiration_time", user.getUser_vip_expiration_time());
			map.put("user_sex", user.getUser_sex());
			map.put("user_birthday", user.getUser_birthday());
			map.put("user_grade", user.getUser_grade());
		}
		userRegisterLoginService.deleteVerifyCode(vc);
		return map;
	
	 
	}

	
	public static String request(String httpUrl, String httpArg) {
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		httpUrl = httpUrl + "?" + httpArg;

		try {
			URL url = new URL(httpUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String strRead = reader.readLine();
			if (strRead != null) {
				sbf.append(strRead);
				while ((strRead = reader.readLine()) != null) {
					sbf.append("\n");
					sbf.append(strRead);
				}
			}
			reader.close();
			result = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String md5(String plainText) {
		StringBuffer buf = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return buf.toString();
	}

	public static String encodeUrlString(String str, String charset) {
		String strret = null;
		if (str == null)
			return str;
		try {
			strret = java.net.URLEncoder.encode(str, charset);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return strret;
	}
	
	
	
}
