package com.qingzaoreading.pojo.po;

import java.util.Date;

public class UserLoginLog {
    private Long userLoginLogId;

    private Long userId;

    private Date loginTime;

    private String operationType;

    private String phoneModel;

    public Long getUserLoginLogId() {
        return userLoginLogId;
    }

    public void setUserLoginLogId(Long userLoginLogId) {
        this.userLoginLogId = userLoginLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel == null ? null : phoneModel.trim();
    }
}