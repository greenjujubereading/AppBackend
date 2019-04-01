package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.UserHistory;
import com.qingzaoreading.pojo.po.UserHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHistoryMapper {
	
	UserHistory getUserHistoryByvideoiduserid(UserHistory userhistory);
	
	 void  addUserHistory(UserHistory userhistory);
	 void updataUserHistory(UserHistory userhistory);
	 List<UserHistory> gethistory(String user_id);
	
	
	
	
	
    int countByExample(UserHistoryExample example);

    int deleteByExample(UserHistoryExample example);

    int deleteByPrimaryKey(Long userHistoryId);

    int insert(UserHistory record);

    int insertSelective(UserHistory record);

    List<UserHistory> selectByExample(UserHistoryExample example);

    UserHistory selectByPrimaryKey(Long userHistoryId);

    int updateByExampleSelective(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);

    int updateByExample(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);

    int updateByPrimaryKeySelective(UserHistory record);

    int updateByPrimaryKey(UserHistory record);
}