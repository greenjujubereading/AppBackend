package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.VerifyCode;
import com.qingzaoreading.pojo.po.VerifyCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerifyCodeMapper {
	
	void addVerifyCode(VerifyCode vc);
	
	VerifyCode getVerifyCodeByphone(String user_phone);
	
	 void deleteVerifyCode(VerifyCode vc);
	
	
    int countByExample(VerifyCodeExample example);

    int deleteByExample(VerifyCodeExample example);

    int deleteByPrimaryKey(String userPhone);

    int insert(VerifyCode record);

    int insertSelective(VerifyCode record);

    List<VerifyCode> selectByExample(VerifyCodeExample example);

    VerifyCode selectByPrimaryKey(String userPhone);

    int updateByExampleSelective(@Param("record") VerifyCode record, @Param("example") VerifyCodeExample example);

    int updateByExample(@Param("record") VerifyCode record, @Param("example") VerifyCodeExample example);

    int updateByPrimaryKeySelective(VerifyCode record);

    int updateByPrimaryKey(VerifyCode record);
}