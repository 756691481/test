package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class WorksUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksUserExample() {
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNull() {
            addCriterion("secondid is null");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNotNull() {
            addCriterion("secondid is not null");
            return (Criteria) this;
        }

        public Criteria andSecondidEqualTo(Integer value) {
            addCriterion("secondid =", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotEqualTo(Integer value) {
            addCriterion("secondid <>", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThan(Integer value) {
            addCriterion("secondid >", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondid >=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThan(Integer value) {
            addCriterion("secondid <", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThanOrEqualTo(Integer value) {
            addCriterion("secondid <=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidIn(List<Integer> values) {
            addCriterion("secondid in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotIn(List<Integer> values) {
            addCriterion("secondid not in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidBetween(Integer value1, Integer value2) {
            addCriterion("secondid between", value1, value2, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondid not between", value1, value2, "secondid");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNull() {
            addCriterion("creatat is null");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNotNull() {
            addCriterion("creatat is not null");
            return (Criteria) this;
        }

        public Criteria andCreatatEqualTo(Long value) {
            addCriterion("creatat =", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotEqualTo(Long value) {
            addCriterion("creatat <>", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThan(Long value) {
            addCriterion("creatat >", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThanOrEqualTo(Long value) {
            addCriterion("creatat >=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThan(Long value) {
            addCriterion("creatat <", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThanOrEqualTo(Long value) {
            addCriterion("creatat <=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatIn(List<Long> values) {
            addCriterion("creatat in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotIn(List<Long> values) {
            addCriterion("creatat not in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatBetween(Long value1, Long value2) {
            addCriterion("creatat between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotBetween(Long value1, Long value2) {
            addCriterion("creatat not between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatbyIsNull() {
            addCriterion("creatby is null");
            return (Criteria) this;
        }

        public Criteria andCreatbyIsNotNull() {
            addCriterion("creatby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatbyEqualTo(String value) {
            addCriterion("creatby =", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyNotEqualTo(String value) {
            addCriterion("creatby <>", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyGreaterThan(String value) {
            addCriterion("creatby >", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyGreaterThanOrEqualTo(String value) {
            addCriterion("creatby >=", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyLessThan(String value) {
            addCriterion("creatby <", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyLessThanOrEqualTo(String value) {
            addCriterion("creatby <=", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyLike(String value) {
            addCriterion("creatby like", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyNotLike(String value) {
            addCriterion("creatby not like", value, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyIn(List<String> values) {
            addCriterion("creatby in", values, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyNotIn(List<String> values) {
            addCriterion("creatby not in", values, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyBetween(String value1, String value2) {
            addCriterion("creatby between", value1, value2, "creatby");
            return (Criteria) this;
        }

        public Criteria andCreatbyNotBetween(String value1, String value2) {
            addCriterion("creatby not between", value1, value2, "creatby");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("updateat is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("updateat is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(Long value) {
            addCriterion("updateat =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(Long value) {
            addCriterion("updateat <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(Long value) {
            addCriterion("updateat >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(Long value) {
            addCriterion("updateat >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(Long value) {
            addCriterion("updateat <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(Long value) {
            addCriterion("updateat <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<Long> values) {
            addCriterion("updateat in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<Long> values) {
            addCriterion("updateat not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(Long value1, Long value2) {
            addCriterion("updateat between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(Long value1, Long value2) {
            addCriterion("updateat not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateby is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateby is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateby =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateby <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateby >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateby >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateby <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateby <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateby like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateby not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateby in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateby not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateby between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateby not between", value1, value2, "updateby");
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