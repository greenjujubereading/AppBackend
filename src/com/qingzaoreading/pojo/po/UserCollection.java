package com.qingzaoreading.pojo.po;

import java.util.Date;

public class UserCollection {
    private Long user_collection_id;

    private Long user_id;

    private Long video_id;

    private Date time;

    private Integer number;

	public Long getUser_collection_id() {
		return user_collection_id;
	}

	public void setUser_collection_id(Long user_collection_id) {
		this.user_collection_id = user_collection_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getVideo_id() {
		return video_id;
	}

	public void setVideo_id(Long video_id) {
		this.video_id = video_id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

 

     
}