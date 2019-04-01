package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.UserVipLog;
import com.qingzaoreading.pojo.po.UserVipLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVipLogMapper {
    int countByExample(UserVipLogExample example);

    int deleteByExample(UserVipLogExample example);

    int deleteByPrimaryKey(Long userVipLogId);

    int insert(UserVipLog record);

    int insertSelective(UserVipLog record);

    List<UserVipLog> selectByExample(UserVipLogExample example);

    UserVipLog selectByPrimaryKey(Long userVipLogId);

    int updateByExampleSelective(@Param("record") UserVipLog record, @Param("example") UserVipLogExample example);

    int updateByExample(@Param("record") UserVipLog record, @Param("example") UserVipLogExample example);

    int updateByPrimaryKeySelective(UserVipLog record);

    int updateByPrimaryKey(UserVipLog record);
}