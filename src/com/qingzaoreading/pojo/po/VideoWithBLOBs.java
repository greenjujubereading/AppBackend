package com.qingzaoreading.pojo.po;

public class VideoWithBLOBs extends Video {
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

     
}