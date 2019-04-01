package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.Lecturer;
import com.qingzaoreading.pojo.po.LecturerExample;
import com.qingzaoreading.pojo.po.LecturerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LecturerMapper {
	Lecturer getlecturerbyid(String lecturer_id);
	List<Lecturer> getalllecturer();
	
	
	
	
	
    int countByExample(LecturerExample example);

    int deleteByExample(LecturerExample example);

    int deleteByPrimaryKey(Long lecturerId);

    int insert(LecturerWithBLOBs record);

    int insertSelective(LecturerWithBLOBs record);

    List<LecturerWithBLOBs> selectByExampleWithBLOBs(LecturerExample example);

    List<Lecturer> selectByExample(LecturerExample example);

    LecturerWithBLOBs selectByPrimaryKey(Long lecturerId);

    int updateByExampleSelective(@Param("record") LecturerWithBLOBs record, @Param("example") LecturerExample example);

    int updateByExampleWithBLOBs(@Param("record") LecturerWithBLOBs record, @Param("example") LecturerExample example);

    int updateByExample(@Param("record") Lecturer record, @Param("example") LecturerExample example);

    int updateByPrimaryKeySelective(LecturerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LecturerWithBLOBs record);

    int updateByPrimaryKey(Lecturer record);
}