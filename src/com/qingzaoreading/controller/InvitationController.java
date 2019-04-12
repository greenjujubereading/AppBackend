package com.qingzaoreading.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.qingzaoreading.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.qingzaoreading.pojo.po.Playing;
import com.qingzaoreading.pojo.po.User;
import com.qingzaoreading.service.InvitationService;
import com.qingzaoreading.service.UserRegisterLoginService;

@Controller
public class InvitationController {

	@Autowired
	private InvitationService invitationPageService;
	
	@Autowired
	private UserRegisterLoginService  userRegisterLoginService;
	/**
	 * 二维码邀请
	 * @return  
	 */
	@RequestMapping("/invite")
//	public String invitation(HttpServletRequest request,  String id) {
//		System.out.println("id="+id);
//		HttpSession session = request.getSession();
//		JSONObject json = null;
//		json = new JSONObject();
//		json.put("user_id", id);
//		request.getSession().setAttribute("user_id", json);
//		return "invite";
//	}

	public String invitation(HttpServletRequest request, String id, ModelMap model) {
		System.out.println("id="+id);
		String user_name = userRegisterLoginService.getUserById(id).getUser_name();
		HttpSession session = request.getSession();
		JSONObject json = null;
		json = new JSONObject();
		json.put("user_id", id);
		request.getSession().setAttribute("user_id", json);
		model.addAttribute("user_name", user_name);
		return "invite";
	}
	
	
	//invitee
	@RequestMapping("/invitee")
	@ResponseBody
	public Map<String,Object> invitee(HttpServletRequest request,  String user_phone) {
		
		JSONObject json = (JSONObject)request.getSession().getAttribute("user_id");
		String  user_id =json.getString("user_id");
		System.out.println("user_id:"+user_id);
		System.out.println("user_phone:"+user_phone);
		int user_total=userRegisterLoginService.getUserTotal();
		User user=new User();
		user.setUser_name("用户"+(user_total+1));
		user.setUser_head_portrait_url("http://szpstore.oss-cn-beijing.aliyuncs.com/szp.jpg?Expires=1553225583&OSSAccessKeyId=TMP.AQFn4HqrNBApNPBuSegPxfRrEB2qF_u_rQmq7HY4P7YMNHFzc8VJr4xwSD28ADAtAhUApeZe32AMAfWs8rEJZ3qmcNxiaK8CFAVJkZE0agBL9V8omxFSr0c7nlhV&Signature=ZWpT2KLUQhFDZQKcLdlsb9osK4E%3D");
		
		user.setUser_integral(0L);
		user.setUser_password(null);
		user.setUser_invited_user_id(Long.parseLong(user_id));
		user.setUser_is_it_vip("0");
		user.setUser_money(new BigDecimal("0.0"));
		user.setUser_phone(user_phone);
		user.setUser_student_id(user_total+100000L);
		user.setUser_type("0");
		user.setUser_vip_expiration_time(null);
		user.setUser_wechat_number(null);

		User u = userRegisterLoginService.getUserByPhoneNumber(user);
		if(u==null){
			userRegisterLoginService.addUser(user);
		}
		Map map=new HashMap<String,Object>();
		map.put("result",true);
		return map;
	}
	
}
