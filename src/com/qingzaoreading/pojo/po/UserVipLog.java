package com.qingzaoreading.pojo.po;

import java.util.Date;

public class UserVipLog {
    private Long userVipLogId;

    private Long userId;

    private Integer increasedVipDuration;

    private Date time;

    private String operationType;

    public Long getUserVipLogId() {
        return userVipLogId;
    }

    public void setUserVipLogId(Long userVipLogId) {
        this.userVipLogId = userVipLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIncreasedVipDuration() {
        return increasedVipDuration;
    }

    public void setIncreasedVipDuration(Integer increasedVipDuration) {
        this.increasedVipDuration = increasedVipDuration;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }
}