package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.Playing;
import com.qingzaoreading.pojo.po.PlayingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayingMapper {
	
	List<Playing> getCarousel();
	
	
	
    int countByExample(PlayingExample example);

    int deleteByExample(PlayingExample example);

    int deleteByPrimaryKey(Long playingId);

    int insert(Playing record);

    int insertSelective(Playing record);

    List<Playing> selectByExampleWithBLOBs(PlayingExample example);

    List<Playing> selectByExample(PlayingExample example);

    Playing selectByPrimaryKey(Long playingId);

    int updateByExampleSelective(@Param("record") Playing record, @Param("example") PlayingExample example);

    int updateByExampleWithBLOBs(@Param("record") Playing record, @Param("example") PlayingExample example);

    int updateByExample(@Param("record") Playing record, @Param("example") PlayingExample example);

    int updateByPrimaryKeySelective(Playing record);

    int updateByPrimaryKeyWithBLOBs(Playing record);

    int updateByPrimaryKey(Playing record);
}