package com.qingzaoreading.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
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

        public Criteria andQuestionContentIsNull() {
            addCriterion("\"question _content\" is null");
            return (Criteria) this;
        }

        public Criteria andQuestionContentIsNotNull() {
            addCriterion("\"question _content\" is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionContentEqualTo(String value) {
            addCriterion("\"question _content\" =", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotEqualTo(String value) {
            addCriterion("\"question _content\" <>", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentGreaterThan(String value) {
            addCriterion("\"question _content\" >", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentGreaterThanOrEqualTo(String value) {
            addCriterion("\"question _content\" >=", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLessThan(String value) {
            addCriterion("\"question _content\" <", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLessThanOrEqualTo(String value) {
            addCriterion("\"question _content\" <=", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentLike(String value) {
            addCriterion("\"question _content\" like", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotLike(String value) {
            addCriterion("\"question _content\" not like", value, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentIn(List<String> values) {
            addCriterion("\"question _content\" in", values, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotIn(List<String> values) {
            addCriterion("\"question _content\" not in", values, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentBetween(String value1, String value2) {
            addCriterion("\"question _content\" between", value1, value2, "questionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionContentNotBetween(String value1, String value2) {
            addCriterion("\"question _content\" not between", value1, value2, "questionContent");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNull() {
            addCriterion("option_a is null");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNotNull() {
            addCriterion("option_a is not null");
            return (Criteria) this;
        }

        public Criteria andOptionAEqualTo(String value) {
            addCriterion("option_a =", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotEqualTo(String value) {
            addCriterion("option_a <>", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThan(String value) {
            addCriterion("option_a >", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThanOrEqualTo(String value) {
            addCriterion("option_a >=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThan(String value) {
            addCriterion("option_a <", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThanOrEqualTo(String value) {
            addCriterion("option_a <=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALike(String value) {
            addCriterion("option_a like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotLike(String value) {
            addCriterion("option_a not like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAIn(List<String> values) {
            addCriterion("option_a in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotIn(List<String> values) {
            addCriterion("option_a not in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionABetween(String value1, String value2) {
            addCriterion("option_a between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotBetween(String value1, String value2) {
            addCriterion("option_a not between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNull() {
            addCriterion("option_b is null");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNotNull() {
            addCriterion("option_b is not null");
            return (Criteria) this;
        }

        public Criteria andOptionBEqualTo(String value) {
            addCriterion("option_b =", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotEqualTo(String value) {
            addCriterion("option_b <>", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThan(String value) {
            addCriterion("option_b >", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThanOrEqualTo(String value) {
            addCriterion("option_b >=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThan(String value) {
            addCriterion("option_b <", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThanOrEqualTo(String value) {
            addCriterion("option_b <=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLike(String value) {
            addCriterion("option_b like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotLike(String value) {
            addCriterion("option_b not like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBIn(List<String> values) {
            addCriterion("option_b in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotIn(List<String> values) {
            addCriterion("option_b not in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBBetween(String value1, String value2) {
            addCriterion("option_b between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotBetween(String value1, String value2) {
            addCriterion("option_b not between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNull() {
            addCriterion("option_c is null");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNotNull() {
            addCriterion("option_c is not null");
            return (Criteria) this;
        }

        public Criteria andOptionCEqualTo(String value) {
            addCriterion("option_c =", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotEqualTo(String value) {
            addCriterion("option_c <>", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThan(String value) {
            addCriterion("option_c >", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThanOrEqualTo(String value) {
            addCriterion("option_c >=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThan(String value) {
            addCriterion("option_c <", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThanOrEqualTo(String value) {
            addCriterion("option_c <=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLike(String value) {
            addCriterion("option_c like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotLike(String value) {
            addCriterion("option_c not like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCIn(List<String> values) {
            addCriterion("option_c in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotIn(List<String> values) {
            addCriterion("option_c not in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCBetween(String value1, String value2) {
            addCriterion("option_c between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotBetween(String value1, String value2) {
            addCriterion("option_c not between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNull() {
            addCriterion("option_d is null");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNotNull() {
            addCriterion("option_d is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDEqualTo(String value) {
            addCriterion("option_d =", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotEqualTo(String value) {
            addCriterion("option_d <>", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThan(String value) {
            addCriterion("option_d >", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThanOrEqualTo(String value) {
            addCriterion("option_d >=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThan(String value) {
            addCriterion("option_d <", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThanOrEqualTo(String value) {
            addCriterion("option_d <=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLike(String value) {
            addCriterion("option_d like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotLike(String value) {
            addCriterion("option_d not like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDIn(List<String> values) {
            addCriterion("option_d in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotIn(List<String> values) {
            addCriterion("option_d not in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDBetween(String value1, String value2) {
            addCriterion("option_d between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotBetween(String value1, String value2) {
            addCriterion("option_d not between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisIsNull() {
            addCriterion("answer_analysis is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisIsNotNull() {
            addCriterion("answer_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisEqualTo(String value) {
            addCriterion("answer_analysis =", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisNotEqualTo(String value) {
            addCriterion("answer_analysis <>", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisGreaterThan(String value) {
            addCriterion("answer_analysis >", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("answer_analysis >=", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisLessThan(String value) {
            addCriterion("answer_analysis <", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisLessThanOrEqualTo(String value) {
            addCriterion("answer_analysis <=", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisLike(String value) {
            addCriterion("answer_analysis like", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisNotLike(String value) {
            addCriterion("answer_analysis not like", value, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisIn(List<String> values) {
            addCriterion("answer_analysis in", values, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisNotIn(List<String> values) {
            addCriterion("answer_analysis not in", values, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisBetween(String value1, String value2) {
            addCriterion("answer_analysis between", value1, value2, "answerAnalysis");
            return (Criteria) this;
        }

        public Criteria andAnswerAnalysisNotBetween(String value1, String value2) {
            addCriterion("answer_analysis not between", value1, value2, "answerAnalysis");
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