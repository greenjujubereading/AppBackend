package com.qingzaoreading.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserVipLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserVipLogExample() {
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

        public Criteria andUserVipLogIdIsNull() {
            addCriterion("user_vip_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdIsNotNull() {
            addCriterion("user_vip_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdEqualTo(Long value) {
            addCriterion("user_vip_log_id =", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdNotEqualTo(Long value) {
            addCriterion("user_vip_log_id <>", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdGreaterThan(Long value) {
            addCriterion("user_vip_log_id >", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_vip_log_id >=", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdLessThan(Long value) {
            addCriterion("user_vip_log_id <", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdLessThanOrEqualTo(Long value) {
            addCriterion("user_vip_log_id <=", value, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdIn(List<Long> values) {
            addCriterion("user_vip_log_id in", values, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdNotIn(List<Long> values) {
            addCriterion("user_vip_log_id not in", values, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdBetween(Long value1, Long value2) {
            addCriterion("user_vip_log_id between", value1, value2, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserVipLogIdNotBetween(Long value1, Long value2) {
            addCriterion("user_vip_log_id not between", value1, value2, "userVipLogId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationIsNull() {
            addCriterion("increased_vip_duration is null");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationIsNotNull() {
            addCriterion("increased_vip_duration is not null");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationEqualTo(Integer value) {
            addCriterion("increased_vip_duration =", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationNotEqualTo(Integer value) {
            addCriterion("increased_vip_duration <>", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationGreaterThan(Integer value) {
            addCriterion("increased_vip_duration >", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("increased_vip_duration >=", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationLessThan(Integer value) {
            addCriterion("increased_vip_duration <", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationLessThanOrEqualTo(Integer value) {
            addCriterion("increased_vip_duration <=", value, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationIn(List<Integer> values) {
            addCriterion("increased_vip_duration in", values, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationNotIn(List<Integer> values) {
            addCriterion("increased_vip_duration not in", values, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationBetween(Integer value1, Integer value2) {
            addCriterion("increased_vip_duration between", value1, value2, "increasedVipDuration");
            return (Criteria) this;
        }

        public Criteria andIncreasedVipDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("increased_vip_duration not between", value1, value2, "increasedVipDuration");
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

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
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