package com.deal.mrzhang.deal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionTypeAggrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public QuestionTypeAggrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNull() {
            addCriterion("question_type_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNotNull() {
            addCriterion("question_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdEqualTo(Integer value) {
            addCriterion("question_type_id =", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotEqualTo(Integer value) {
            addCriterion("question_type_id <>", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThan(Integer value) {
            addCriterion("question_type_id >", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type_id >=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThan(Integer value) {
            addCriterion("question_type_id <", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_type_id <=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIn(List<Integer> values) {
            addCriterion("question_type_id in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotIn(List<Integer> values) {
            addCriterion("question_type_id not in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("question_type_id between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type_id not between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIsNull() {
            addCriterion("question_type_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIsNotNull() {
            addCriterion("question_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameEqualTo(String value) {
            addCriterion("question_type_name =", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotEqualTo(String value) {
            addCriterion("question_type_name <>", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameGreaterThan(String value) {
            addCriterion("question_type_name >", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_type_name >=", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLessThan(String value) {
            addCriterion("question_type_name <", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("question_type_name <=", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLike(String value) {
            addCriterion("question_type_name like", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotLike(String value) {
            addCriterion("question_type_name not like", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIn(List<String> values) {
            addCriterion("question_type_name in", values, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotIn(List<String> values) {
            addCriterion("question_type_name not in", values, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameBetween(String value1, String value2) {
            addCriterion("question_type_name between", value1, value2, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotBetween(String value1, String value2) {
            addCriterion("question_type_name not between", value1, value2, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_type_aggr
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table question_type_aggr
     *
     * @mbg.generated
     */
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