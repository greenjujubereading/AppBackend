package com.qingzaoreading.pojo.po;

import java.util.Date;

public class AnswerRecord {
    private Long answerRecordId;

    private Long questionId;

    private Long userId;

    private Date time;

    private String result;

    public Long getAnswerRecordId() {
        return answerRecordId;
    }

    public void setAnswerRecordId(Long answerRecordId) {
        this.answerRecordId = answerRecordId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}