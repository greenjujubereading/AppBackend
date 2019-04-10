package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.Video;
import com.qingzaoreading.pojo.po.VideoExample;
import com.qingzaoreading.pojo.po.VideoWithBLOBs;
import com.qingzaoreading.pojo.vo.BookList;
import com.qingzaoreading.pojo.vo.BookRecommend;
import com.qingzaoreading.pojo.vo.LikeBookList;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
	List<BookList> getBooklist();
	List<BookRecommend> getBookrecommend();
	List<BookList> getBookListByType(String video_type);
	Video getBookById(String video_id);
	List<BookList> search(String video_name);
	String getparentguidancebyid(String video_id);
	List<BookList> getbooklistbyid(String lecturer_id);
	List<LikeBookList> likebooklist(String video_id) ;
	
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Long videoId);

    int insert(VideoWithBLOBs record);

    int insertSelective(VideoWithBLOBs record);

    List<VideoWithBLOBs> selectByExampleWithBLOBs(VideoExample example);

    List<Video> selectByExample(VideoExample example);

    VideoWithBLOBs selectByPrimaryKey(Long videoId);

    int updateByExampleSelective(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExampleWithBLOBs(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(VideoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VideoWithBLOBs record);

    int updateByPrimaryKey(Video record);

    List<BookList> getRecommendBooklist();

    List<BookList> getRecentBooklist();

    List<BookList> getBookListByYear(String video_year);
}