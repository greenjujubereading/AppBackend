package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.UserLoginLog;
import com.qingzaoreading.pojo.po.UserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginLogMapper {
    int countByExample(UserLoginLogExample example);

    int deleteByExample(UserLoginLogExample example);

    int deleteByPrimaryKey(Long userLoginLogId);

    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    List<UserLoginLog> selectByExample(UserLoginLogExample example);

    UserLoginLog selectByPrimaryKey(Long userLoginLogId);

    int updateByExampleSelective(@Param("record") UserLoginLog record, @Param("example") UserLoginLogExample example);

    int updateByExample(@Param("record") UserLoginLog record, @Param("example") UserLoginLogExample example);

    int updateByPrimaryKeySelective(UserLoginLog record);

    int updateByPrimaryKey(UserLoginLog record);
}