package com.qingzaoreading.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
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

import OSS.FilePath;

@Controller
@CrossOrigin
public class HomePageController {

	@Autowired
	private HomePageService homePageService;
	
	
	/**
	 * 返回首页的轮播图
	 * @return  playing
	 */
	@RequestMapping("/carousel")
	@ResponseBody
	public List<Playing> getCarousel() {
		System.out.println("xixi");
		List<Playing> list=homePageService.getCarousel();
		for(int i=0;i<list.size();i++) {
			list.get(i).setPicture_url(FilePath.getUrl(list.get(i).getPicture_url()));
		}
		return list;
	}
	
	
	/**
	 * 返回首页的图书列表
	 * @return  
	 */
	@RequestMapping("/booklist")
	@CrossOrigin
	@ResponseBody
	public List<BookList> getBooklist() {
		List<BookList> list= homePageService.getBooklist();
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;
		 
	}
	
	/**
	 * 返回首页的图书推荐列表 只返回4个
	 * @return  
	 */
	@RequestMapping("/bookrecommend")
	@CrossOrigin
	@ResponseBody
	public List<BookRecommend> getBookrecommend() {
		List<BookRecommend> list= homePageService.getBookrecommend();
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;
		 
	}

	/**
	 * 返回首页更多的图书推荐列表 默认返回全部推荐的书籍
	 * @return
	 */
	@RequestMapping("/bookrecommendmore")
	@CrossOrigin
	@ResponseBody
	public List<BookList> getMoreBookRecommend() {
		List<BookList> list= homePageService.getRecommendBooklist();
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;

	}

	/**
	 * 返回首页更多的最新图书 默认返回全部推荐的书籍
	 * @return
	 */
	@RequestMapping("/bookrecentmore")
	@CrossOrigin
	@ResponseBody
	public List<BookList> getMoreBookRecent() {
		List<BookList> list= homePageService.getRecentBooklist();
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;

	}
	
	
	/**
	 * 返回对应图书类型的列表
	 * 参数video_type
	 * 0标识亲近文学；1益智科普
	 * @return  
	 */
	@RequestMapping("/booklistbytype")
	@CrossOrigin
	@ResponseBody
	public List<BookList> getBookListByType(String video_type) {
		List<BookList> list= homePageService.getBookListByType(video_type);
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;
	 
	}
	
	/**
	 * 返回对应id图书的详细列表
	 * 参数video_id,user_id
	 * 
	 * @return  
	 */
	@RequestMapping(value = {"/bookbyid"}, method={RequestMethod.POST, RequestMethod.GET})
	@CrossOrigin
	@ResponseBody
	public Video getBookById(String video_id , String user_id) {
		System.out.println("video_id"+video_id);
		UserHistory userhistory =new UserHistory();
		
		userhistory.setUser_id(Long.parseLong(user_id));
		userhistory.setVideo_id(Long.parseLong(video_id));
		UserHistory us=homePageService.getUserHistoryByvideoiduserid(userhistory);
		if(us==null) {
			homePageService.addUserHistory(userhistory);
		}
		else {
			homePageService.updataUserHistory(userhistory);
		}
		
		
		UserCollection usercollection =new UserCollection();
		usercollection.setUser_id(Long.parseLong(user_id));
		usercollection.setVideo_id(Long.parseLong(video_id));
		UserCollection uc=homePageService.getUserCollectionByvideoiduserid(usercollection);
		if(uc==null) {
			 
		}
		else {
			homePageService.updataUserCollection(usercollection);
		}
		
		Video video=homePageService.getBookById(video_id);
	   video.setSound_url(FilePath.getUrl(video.getSound_url()));
	   video.setVideo_cover_url(FilePath.getUrl(video.getVideo_cover_url()));
//	   video.setVideo_url(FilePath.getUrl(video.getVideo_url()));
		return video;
	}
	
	
	/**
	 * 搜索返回对应的图书列表
	 * 参数video_name
	 * @return  
	 */
	@RequestMapping(value = {"/search"}, method={RequestMethod.POST, RequestMethod.GET})
	@CrossOrigin
	@ResponseBody
	public List<BookList> search(String video_name) {
		List<BookList> list= homePageService.search(video_name);
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;
		 
	}
	
	
	
	/**
	 * 根据video_id得到对应的评论
	 * 
	 */
	@RequestMapping(value = {"/getcommentbyid"}, method={RequestMethod.POST, RequestMethod.GET})
	@CrossOrigin
	@ResponseBody
	public List<CommentCustom> getcommentbyid(String video_id) {
		List<CommentCustom> list = homePageService.getcommentbyid(video_id);
//		System.out.println(video_id);
		for(int i=0;i<list.size();i++) {
			list.get(i).setUser_head_portrait_url(FilePath.getUrl(list.get(i).getUser_head_portrait_url()));
		}
		return list;
	}
	
	/**
	 * 根据video_id得到对应的家长导读
	 * 
	 */
	@RequestMapping("/getparentguidancebyid")
	@CrossOrigin
	@ResponseBody
	public Map<String,Object>  getparentguidancebyid(String video_id) {
		Map map=new HashMap<String,Object>();
		String result=homePageService.getparentguidancebyid(video_id);
		map.put("parent_guidance",result );
		return map;
	}
	
	/**
	 * 根据lecturer_id得到对应的讲师介绍
	 * 
	 */
	@RequestMapping("/getlecturerbyid")
	@CrossOrigin
	@ResponseBody
	public Lecturer  getlecturerbyid(String lecturer_id) {
		Lecturer lecturer=homePageService.getlecturerbyid(lecturer_id);
		lecturer.setLecturer_head_portrait_url(FilePath.getUrl(lecturer.getLecturer_head_portrait_url()));
		return lecturer;
	}
	
	/**
	 * 根据lecturer_id得到此讲师讲的图书列表
	 * 
	 */
	@RequestMapping("/getbooklistbyid")
	@CrossOrigin
	@ResponseBody
	public List<BookList>  getbooklistbyid(String lecturer_id) {
		List<BookList> list= homePageService.getbooklistbyid(lecturer_id);
		for(int i=0;i<list.size();i++) {
			list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
		}
		return list;
	 
	}
	
	//getalllecturer
	
	/**
	 * 根据讲师列表
	 * 
	 */
	@RequestMapping("/getalllecturer")
	@ResponseBody
	public List<Lecturer>  getalllecturer() {
		List<Lecturer> list= homePageService.getalllecturer();
		for(int i=0;i<list.size();i++) {
			list.get(i).setLecturer_head_portrait_url(FilePath.getUrl(list.get(i).getLecturer_head_portrait_url()));
		}
		return list;
		 
	}
	
	/**
	 * 收藏
	 * 
	 */
	@RequestMapping("/collecte")
	@CrossOrigin
	@ResponseBody
	public Map<String,Object>  collecte(UserCollection uc) {
		UserCollection usercollection=homePageService.getUserCollectionByid(uc);
		Map map=new HashMap<String,Object>();
		if(usercollection==null){
			homePageService.collecte(uc);
			map.put("result", true);
		}
		else {
			map.put("result", false);
		}
		 
		return map;
	}
	
	
	
	/**
	 * 得到收藏列表
	 * 
	 */
	@RequestMapping("/getcollection")
	@CrossOrigin
	@ResponseBody
	public List<UserCollection>  getcollection(String user_id) {
		
		 
		return homePageService.getcollection(user_id);
	}
	
	/**
	 * 得到历史列表
	 * 
	 */
	@RequestMapping("/gethistory")
	@CrossOrigin
	@ResponseBody
	public List<UserHistory>  gethistory(String user_id) {
		
		return homePageService.gethistory(user_id);
	}
	
	/**
	 * 根据video_id得到类似的viedo
	 * 
	 */
	@RequestMapping("/likebooklist")
	@CrossOrigin
	@ResponseBody
	public List<LikeBookList>  likebooklist(String video_id) {
		 List<LikeBookList> list=homePageService.likebooklist(video_id);
		 for(int i=0;i<list.size();i++) {
				list.get(i).setVideo_cover_url(FilePath.getUrl(list.get(i).getVideo_cover_url()));
			}
		return list;
	}
	
	
	
}
