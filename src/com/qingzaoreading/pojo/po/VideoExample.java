package com.qingzaoreading.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionIsNull() {
            addCriterion("short_introduction is null");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionIsNotNull() {
            addCriterion("short_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionEqualTo(String value) {
            addCriterion("short_introduction =", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionNotEqualTo(String value) {
            addCriterion("short_introduction <>", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionGreaterThan(String value) {
            addCriterion("short_introduction >", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("short_introduction >=", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionLessThan(String value) {
            addCriterion("short_introduction <", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionLessThanOrEqualTo(String value) {
            addCriterion("short_introduction <=", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionLike(String value) {
            addCriterion("short_introduction like", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionNotLike(String value) {
            addCriterion("short_introduction not like", value, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionIn(List<String> values) {
            addCriterion("short_introduction in", values, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionNotIn(List<String> values) {
            addCriterion("short_introduction not in", values, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionBetween(String value1, String value2) {
            addCriterion("short_introduction between", value1, value2, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andShortIntroductionNotBetween(String value1, String value2) {
            addCriterion("short_introduction not between", value1, value2, "shortIntroduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andLecturerIdIsNull() {
            addCriterion("lecturer_id is null");
            return (Criteria) this;
        }

        public Criteria andLecturerIdIsNotNull() {
            addCriterion("lecturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLecturerIdEqualTo(Long value) {
            addCriterion("lecturer_id =", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotEqualTo(Long value) {
            addCriterion("lecturer_id <>", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdGreaterThan(Long value) {
            addCriterion("lecturer_id >", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lecturer_id >=", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdLessThan(Long value) {
            addCriterion("lecturer_id <", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdLessThanOrEqualTo(Long value) {
            addCriterion("lecturer_id <=", value, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdIn(List<Long> values) {
            addCriterion("lecturer_id in", values, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotIn(List<Long> values) {
            addCriterion("lecturer_id not in", values, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdBetween(Long value1, Long value2) {
            addCriterion("lecturer_id between", value1, value2, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andLecturerIdNotBetween(Long value1, Long value2) {
            addCriterion("lecturer_id not between", value1, value2, "lecturerId");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoYearIsNull() {
            addCriterion("video_year is null");
            return (Criteria) this;
        }

        public Criteria andVideoYearIsNotNull() {
            addCriterion("video_year is not null");
            return (Criteria) this;
        }

        public Criteria andVideoYearEqualTo(String value) {
            addCriterion("video_year =", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearNotEqualTo(String value) {
            addCriterion("video_year <>", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearGreaterThan(String value) {
            addCriterion("video_year >", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearGreaterThanOrEqualTo(String value) {
            addCriterion("video_year >=", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearLessThan(String value) {
            addCriterion("video_year <", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearLessThanOrEqualTo(String value) {
            addCriterion("video_year <=", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearLike(String value) {
            addCriterion("video_year like", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearNotLike(String value) {
            addCriterion("video_year not like", value, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearIn(List<String> values) {
            addCriterion("video_year in", values, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearNotIn(List<String> values) {
            addCriterion("video_year not in", values, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearBetween(String value1, String value2) {
            addCriterion("video_year between", value1, value2, "videoYear");
            return (Criteria) this;
        }

        public Criteria andVideoYearNotBetween(String value1, String value2) {
            addCriterion("video_year not between", value1, value2, "videoYear");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersIsNull() {
            addCriterion("number_of_readers is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersIsNotNull() {
            addCriterion("number_of_readers is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersEqualTo(Long value) {
            addCriterion("number_of_readers =", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersNotEqualTo(Long value) {
            addCriterion("number_of_readers <>", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersGreaterThan(Long value) {
            addCriterion("number_of_readers >", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersGreaterThanOrEqualTo(Long value) {
            addCriterion("number_of_readers >=", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersLessThan(Long value) {
            addCriterion("number_of_readers <", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersLessThanOrEqualTo(Long value) {
            addCriterion("number_of_readers <=", value, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersIn(List<Long> values) {
            addCriterion("number_of_readers in", values, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersNotIn(List<Long> values) {
            addCriterion("number_of_readers not in", values, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersBetween(Long value1, Long value2) {
            addCriterion("number_of_readers between", value1, value2, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andNumberOfReadersNotBetween(Long value1, Long value2) {
            addCriterion("number_of_readers not between", value1, value2, "numberOfReaders");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceIsNull() {
            addCriterion("parental_guidance is null");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceIsNotNull() {
            addCriterion("parental_guidance is not null");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceEqualTo(String value) {
            addCriterion("parental_guidance =", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceNotEqualTo(String value) {
            addCriterion("parental_guidance <>", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceGreaterThan(String value) {
            addCriterion("parental_guidance >", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceGreaterThanOrEqualTo(String value) {
            addCriterion("parental_guidance >=", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceLessThan(String value) {
            addCriterion("parental_guidance <", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceLessThanOrEqualTo(String value) {
            addCriterion("parental_guidance <=", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceLike(String value) {
            addCriterion("parental_guidance like", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceNotLike(String value) {
            addCriterion("parental_guidance not like", value, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceIn(List<String> values) {
            addCriterion("parental_guidance in", values, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceNotIn(List<String> values) {
            addCriterion("parental_guidance not in", values, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceBetween(String value1, String value2) {
            addCriterion("parental_guidance between", value1, value2, "parentalGuidance");
            return (Criteria) this;
        }

        public Criteria andParentalGuidanceNotBetween(String value1, String value2) {
            addCriterion("parental_guidance not between", value1, value2, "parentalGuidance");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}