package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.Comment;
import com.qingzaoreading.pojo.po.CommentExample;
import com.qingzaoreading.pojo.vo.CommentCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
	
	 List<CommentCustom> getcommentbyid(String video_id);
	
	
	
	
	
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    void addANewVideoComment(CommentCustom comment);
}