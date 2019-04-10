package com.qingzaoreading.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingzaoreading.dao.CommentMapper;
import com.qingzaoreading.dao.LecturerMapper;
import com.qingzaoreading.dao.PlayingMapper;
import com.qingzaoreading.dao.UserCollectionMapper;
import com.qingzaoreading.dao.UserHistoryMapper;
import com.qingzaoreading.dao.VideoMapper;
import com.qingzaoreading.pojo.po.Comment;
import com.qingzaoreading.pojo.po.Lecturer;
import com.qingzaoreading.pojo.po.Playing;
import com.qingzaoreading.pojo.po.UserCollection;
import com.qingzaoreading.pojo.po.UserHistory;
import com.qingzaoreading.pojo.po.Video;
import com.qingzaoreading.pojo.vo.BookList;
import com.qingzaoreading.pojo.vo.BookRecommend;
import com.qingzaoreading.pojo.vo.CommentCustom;
import com.qingzaoreading.pojo.vo.LikeBookList;
import com.qingzaoreading.service.HomePageService;




@Service
public class HomePageServiceImpl implements HomePageService {

	@Autowired
	private PlayingMapper playingMapper;
	
	@Autowired
	private VideoMapper videoMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private LecturerMapper lecturerMapper;
	
	@Autowired
	private UserHistoryMapper userHistoryMapper;
	
	@Autowired
	private UserCollectionMapper userCollectionMapper;
	
	@Override
	public List<Playing> getCarousel() {
		// TODO Auto-generated method stub
		return playingMapper.getCarousel();
	}



	@Override
	public List<BookList> getBooklist() {
		// TODO Auto-generated method stub
		return videoMapper.getBooklist();
	}



	@Override
	public List<BookRecommend> getBookrecommend() {
		// TODO Auto-generated method stub
		return videoMapper.getBookrecommend();
	}



	@Override
	public List<BookList> getBookListByType(String video_type) {
		// TODO Auto-generated method stub
		return videoMapper.getBookListByType(video_type);
	}



	@Override
	public Video getBookById(String video_id) {
		// TODO Auto-generated method stub
		return videoMapper.getBookById(video_id);
	}



	@Override
	public List<BookList> search(String video_name) {
		// TODO Auto-generated method stub
		return  videoMapper.search(video_name);
	}



	@Override
	public List<CommentCustom> getcommentbyid(String video_id) {
		// TODO Auto-generated method stub
		return commentMapper.getcommentbyid(video_id);
	}



	@Override
	public String getparentguidancebyid(String video_id) {
		// TODO Auto-generated method stub
		return videoMapper.getparentguidancebyid(video_id);
	}



	@Override
	public Lecturer getlecturerbyid(String lecturer_id) {
		// TODO Auto-generated method stub
		return lecturerMapper.getlecturerbyid(lecturer_id);
	}



	@Override
	public List<BookList> getbooklistbyid(String lecturer_id) {
		// TODO Auto-generated method stub
		return videoMapper.getbooklistbyid(lecturer_id);
	}



	@Override
	public List<Lecturer> getalllecturer() {
		// TODO Auto-generated method stub
		return  lecturerMapper.getalllecturer();
	}



	@Override
	public UserHistory getUserHistoryByvideoiduserid(UserHistory userhistory) {
		// TODO Auto-generated method stub
		return userHistoryMapper.getUserHistoryByvideoiduserid( userhistory);
	}



	@Override
	public void addUserHistory(UserHistory userhistory) {
		// TODO Auto-generated method stub
		userHistoryMapper.addUserHistory( userhistory);
	}



	@Override
	public void updataUserHistory(UserHistory userhistory) {
		// TODO Auto-generated method stub
		userHistoryMapper.updataUserHistory(userhistory);
	}



	@Override
	public void collecte(UserCollection uc) {
		// TODO Auto-generated method stub
		userCollectionMapper.addCollection(uc);
	}



	@Override
	public UserCollection getUserCollectionByid(UserCollection uc) {
		// TODO Auto-generated method stub
		return userCollectionMapper.getUserCollectionByid(uc);
	}



	@Override
	public List<UserCollection> getcollection(String user_id) {
		// TODO Auto-generated method stub
		return userCollectionMapper.getcollection(user_id);
	}



	@Override
	public List<UserHistory> gethistory(String user_id) {
		// TODO Auto-generated method stub
		return userHistoryMapper.gethistory(user_id);
	}



	@Override
	public UserCollection getUserCollectionByvideoiduserid(UserCollection usercollection) {
		// TODO Auto-generated method stub
		return userCollectionMapper.getUserCollectionByvideoiduserid(usercollection);
	}



	@Override
	public void updataUserCollection(UserCollection usercollection) {
		// TODO Auto-generated method stub
		userCollectionMapper.updataUserCollection(usercollection);
	}



	@Override
	public List<LikeBookList> likebooklist(String video_id) {
		// TODO Auto-generated method stub
		return videoMapper.likebooklist(video_id);
	}



	@Override
	public List<BookList> getRecommendBooklist() {
		// TODO Auto-generated method stub
		return videoMapper.getRecommendBooklist();
	}


	@Override
	public List<BookList> getRecentBooklist() {
		// TODO Auto-generated method stub
		return videoMapper.getRecentBooklist();
	}


	@Override
	public void deleteCollect(UserCollection uc) {
		// TODO Auto-generated method stub
		userCollectionMapper.deleteByUserAndVideo(uc);
	}

	@Override
	public void addANewComment(CommentCustom comment) {
		// TODO Auto-generated method stub
		commentMapper.addANewVideoComment(comment);
	}

	@Override
	public List<BookList> getBookListByYear(String s) {
		return videoMapper.getBookListByYear(s);
	}
}
