package com.qingzaoreading.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingzaoreading.dao.UserMapper;
import com.qingzaoreading.dao.VerifyCodeMapper;
import com.qingzaoreading.pojo.po.User;
import com.qingzaoreading.pojo.po.VerifyCode;
import com.qingzaoreading.service.UserRegisterLoginService;

 


@Service
public class UserRegisterLoginServiceImpl implements UserRegisterLoginService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private VerifyCodeMapper verifyCodeMapper;
	
	@Override
	public User getUserByPhoneNumber(User user) {
		// TODO Auto-generated method stub
	      System.out.println("service:"+user.getUser_phone());
		return userMapper.getUserByPhoneNumber(user.getUser_phone());
	}

	@Override
	public int getUserTotal() {
		// TODO Auto-generated method stub
		return userMapper.getUserTotal();
	}

	@Override
	public void addUser(User newuser) {
		// TODO Auto-generated method stub
		userMapper.addUser(newuser);
	}

	@Override
	public void changeUserTypeToTrue(User user) {
		// TODO Auto-generated method stub
		userMapper.changeUserTypeToTrue(user);
	}

	@Override
	public User getUserByPhoneNumberAndPassword(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUserByPhoneNumberAndPassword(user);
	
	}

	@Override
	public void addVerifyCode(VerifyCode vc) {
		// TODO Auto-generated method stub
		verifyCodeMapper.addVerifyCode( vc);
	}

	@Override
	public VerifyCode getVerifyCodeByphone(String user_phone) {
		// TODO Auto-generated method stub
		return verifyCodeMapper.getVerifyCodeByphone(user_phone);
	}

	@Override
	public void deleteVerifyCode(VerifyCode vc) {
		// TODO Auto-generated method stub
		verifyCodeMapper.deleteVerifyCode(vc);
	}

}
