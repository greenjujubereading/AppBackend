package com.qingzaoreading.service;

import java.util.List;

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

public interface HomePageService {
    List<Playing> getCarousel();

    List<BookList> getBooklist();

    List<BookRecommend> getBookrecommend();

    List<BookList> getBookListByType(String video_type);

    Video getBookById(String video_id);

    List<BookList> search(String video_name);

    List<CommentCustom> getcommentbyid(String video_id);

    String getparentguidancebyid(String video_id);

    Lecturer getlecturerbyid(String lecturer_id);

    List<BookList> getbooklistbyid(String lecturer_id);

    List<Lecturer> getalllecturer();

    UserHistory getUserHistoryByvideoiduserid(UserHistory userhistory);

    void addUserHistory(UserHistory userhistory);

    void updataUserHistory(UserHistory userhistory);

    void collecte(UserCollection uc);

    UserCollection getUserCollectionByid(UserCollection uc);

    List<UserCollection> getcollection(String user_id);

    List<UserHistory> gethistory(String user_id);

    UserCollection getUserCollectionByvideoiduserid(UserCollection usercollection);

    void updataUserCollection(UserCollection usercollection);

    List<LikeBookList> likebooklist(String video_id);

    List<BookList> getRecommendBooklist();

    List<BookList> getRecentBooklist();
}
