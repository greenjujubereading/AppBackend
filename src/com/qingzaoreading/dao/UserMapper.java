package com.qingzaoreading.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.qingzaoreading.pojo.po.User;
import com.qingzaoreading.pojo.po.UserExample;
import com.qingzaoreading.pojo.vo.BookList;

public interface UserMapper {

	User getUserByPhoneNumber(String user_phone);
	
	User getUserByPhoneNumberAndPassword(User user);
	
	
	
	
	
	

	int getUserTotal();

	void addUser(User newuser);

	void changeUserTypeToTrue(User user);

	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Long userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExampleWithBLOBs(UserExample example);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long userId);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKeyWithBLOBs(User record);

	int updateByPrimaryKey(User record);
}