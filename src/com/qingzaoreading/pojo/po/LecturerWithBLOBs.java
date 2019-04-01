package com.qingzaoreading.pojo.po;

public class LecturerWithBLOBs extends Lecturer {
    private String lecturerHeadPortraitUrl;

    private String lecturerIntroduction;

    public String getLecturerHeadPortraitUrl() {
        return lecturerHeadPortraitUrl;
    }

    public void setLecturerHeadPortraitUrl(String lecturerHeadPortraitUrl) {
        this.lecturerHeadPortraitUrl = lecturerHeadPortraitUrl == null ? null : lecturerHeadPortraitUrl.trim();
    }

    public String getLecturerIntroduction() {
        return lecturerIntroduction;
    }

    public void setLecturerIntroduction(String lecturerIntroduction) {
        this.lecturerIntroduction = lecturerIntroduction == null ? null : lecturerIntroduction.trim();
    }
}