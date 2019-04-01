package com.qingzaoreading.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
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
import MessageHttpClient.HttpClientUtil;
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
		
		try {
			JSONObject json = null;
			
			String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
		
			String Uid = "陨天落日";
		
			String Key = "d41d8cd98f00b204e980";
			String smsMob = user_phone;
		
			String smsText = "你好！本消息用户系统测试，验证码："+verifyCode;
			 
			HttpClientUtil client = HttpClientUtil.getInstance();
				
	
				int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);

				if(result>0){
					System.out.println("UTF8发送=="+result);
					map.put("result", true);
				}else{
					//System.out.println(client.getErrorMsg(result));
					map.put("result", false);
				}
			 VerifyCode vc=new VerifyCode();
			 vc.setUser_phone(user_phone);
			 vc.setVerify_code(verifyCode);
			 userRegisterLoginService.deleteVerifyCode(vc);
			 userRegisterLoginService.addVerifyCode(vc);
		} catch (Exception e) {
			e.printStackTrace();
	 
	
		}
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
			u.setUser_password(Md5.GetMD5Code(user_password));
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

}
