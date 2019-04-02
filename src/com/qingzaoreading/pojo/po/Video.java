package com.qingzaoreading.pojo.po;

import java.util.Date;

public class Video {
    private Long video_id;

    private String name;

    private String short_introduction;

    private String introduction;

    private Long lecturer_id;

    private String video_type;

    private String video_year;

    private Long number_of_readers;

    private Date time;

    private Date publish_time;

    private String parental_guidance;

    private String video_url;

    private String video_cover_url;

    private String sound_url;

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getVideo_cover_url() {
		return video_cover_url;
	}

	public void setVideo_cover_url(String video_cover_url) {
		this.video_cover_url = video_cover_url;
	}

	public String getSound_url() {
		return sound_url;
	}

	public void setSound_url(String sound_url) {
		this.sound_url = sound_url;
	}
    
    
	public Long getVideo_id() {
		return video_id;
	}

	public void setVideo_id(Long video_id) {
		this.video_id = video_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_introduction() {
		return short_introduction;
	}

	public void setShort_introduction(String short_introduction) {
		this.short_introduction = short_introduction;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Long getLecturer_id() {
		return lecturer_id;
	}

	public void setLecturer_id(Long lecturer_id) {
		this.lecturer_id = lecturer_id;
	}

	public String getVideo_type() {
		return video_type;
	}

	public void setVideo_type(String video_type) {
		this.video_type = video_type;
	}

	public String getVideo_year() {
		return video_year;
	}

	public void setVideo_year(String video_year) {
		this.video_year = video_year;
	}

	public Long getNumber_of_readers() {
		return number_of_readers;
	}

	public void setNumber_of_readers(Long number_of_readers) {
		this.number_of_readers = number_of_readers;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getParental_guidance() {
		return parental_guidance;
	}

	public void setParental_guidance(String parental_guidance) {
		this.parental_guidance = parental_guidance;
	}

	public Date getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(Date publish_time) {
		this.publish_time = publish_time;
	}
}