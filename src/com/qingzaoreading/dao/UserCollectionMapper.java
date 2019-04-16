package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.UserCollection;
import com.qingzaoreading.pojo.po.UserCollectionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserCollectionMapper {

    void deleteByUserAndVideo(UserCollection uc);

    void addCollection(UserCollection uc);

    UserCollection getUserCollectionByid(UserCollection uc);

    List<UserCollection> getcollection(String user_id);

    UserCollection getUserCollectionByvideoiduserid(UserCollection usercollection);

    void updataUserCollection(UserCollection usercollection);


    int countByExample(UserCollectionExample example);

    int deleteByExample(UserCollectionExample example);

    int deleteByPrimaryKey(Long userCollectionId);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    List<UserCollection> selectByExample(UserCollectionExample example);

    UserCollection selectByPrimaryKey(Long userCollectionId);

    int updateByExampleSelective(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);

    int updateByExample(@Param("record") UserCollection record, @Param("example") UserCollectionExample example);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);
}