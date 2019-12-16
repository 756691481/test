package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class BannerUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerUserExample() {
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

        public Criteria andBannerIdIsNull() {
            addCriterion("banner_id is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("banner_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Integer value) {
            addCriterion("banner_id =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Integer value) {
            addCriterion("banner_id <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Integer value) {
            addCriterion("banner_id >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_id >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Integer value) {
            addCriterion("banner_id <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Integer value) {
            addCriterion("banner_id <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Integer> values) {
            addCriterion("banner_id in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Integer> values) {
            addCriterion("banner_id not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Integer value1, Integer value2) {
            addCriterion("banner_id between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_id not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerImgIsNull() {
            addCriterion("banner_img is null");
            return (Criteria) this;
        }

        public Criteria andBannerImgIsNotNull() {
            addCriterion("banner_img is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImgEqualTo(String value) {
            addCriterion("banner_img =", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotEqualTo(String value) {
            addCriterion("banner_img <>", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgGreaterThan(String value) {
            addCriterion("banner_img >", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgGreaterThanOrEqualTo(String value) {
            addCriterion("banner_img >=", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLessThan(String value) {
            addCriterion("banner_img <", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLessThanOrEqualTo(String value) {
            addCriterion("banner_img <=", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLike(String value) {
            addCriterion("banner_img like", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotLike(String value) {
            addCriterion("banner_img not like", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgIn(List<String> values) {
            addCriterion("banner_img in", values, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotIn(List<String> values) {
            addCriterion("banner_img not in", values, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgBetween(String value1, String value2) {
            addCriterion("banner_img between", value1, value2, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotBetween(String value1, String value2) {
            addCriterion("banner_img not between", value1, value2, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("banner_url =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("banner_url >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("banner_url <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("banner_url like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("banner_url not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("banner_url in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIsNull() {
            addCriterion("banner_status is null");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIsNotNull() {
            addCriterion("banner_status is not null");
            return (Criteria) this;
        }

        public Criteria andBannerStatusEqualTo(Integer value) {
            addCriterion("banner_status =", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotEqualTo(Integer value) {
            addCriterion("banner_status <>", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusGreaterThan(Integer value) {
            addCriterion("banner_status >", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_status >=", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusLessThan(Integer value) {
            addCriterion("banner_status <", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("banner_status <=", value, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusIn(List<Integer> values) {
            addCriterion("banner_status in", values, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotIn(List<Integer> values) {
            addCriterion("banner_status not in", values, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusBetween(Integer value1, Integer value2) {
            addCriterion("banner_status between", value1, value2, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andBannerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_status not between", value1, value2, "bannerStatus");
            return (Criteria) this;
        }

        public Criteria andCreatByIsNull() {
            addCriterion("creat_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatByIsNotNull() {
            addCriterion("creat_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatByEqualTo(String value) {
            addCriterion("creat_by =", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotEqualTo(String value) {
            addCriterion("creat_by <>", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByGreaterThan(String value) {
            addCriterion("creat_by >", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByGreaterThanOrEqualTo(String value) {
            addCriterion("creat_by >=", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByLessThan(String value) {
            addCriterion("creat_by <", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByLessThanOrEqualTo(String value) {
            addCriterion("creat_by <=", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByLike(String value) {
            addCriterion("creat_by like", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotLike(String value) {
            addCriterion("creat_by not like", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByIn(List<String> values) {
            addCriterion("creat_by in", values, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotIn(List<String> values) {
            addCriterion("creat_by not in", values, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByBetween(String value1, String value2) {
            addCriterion("creat_by between", value1, value2, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotBetween(String value1, String value2) {
            addCriterion("creat_by not between", value1, value2, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatAtIsNull() {
            addCriterion("creat_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatAtIsNotNull() {
            addCriterion("creat_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatAtEqualTo(Long value) {
            addCriterion("creat_at =", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotEqualTo(Long value) {
            addCriterion("creat_at <>", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtGreaterThan(Long value) {
            addCriterion("creat_at >", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtGreaterThanOrEqualTo(Long value) {
            addCriterion("creat_at >=", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtLessThan(Long value) {
            addCriterion("creat_at <", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtLessThanOrEqualTo(Long value) {
            addCriterion("creat_at <=", value, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtIn(List<Long> values) {
            addCriterion("creat_at in", values, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotIn(List<Long> values) {
            addCriterion("creat_at not in", values, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtBetween(Long value1, Long value2) {
            addCriterion("creat_at between", value1, value2, "creatAt");
            return (Criteria) this;
        }

        public Criteria andCreatAtNotBetween(Long value1, Long value2) {
            addCriterion("creat_at not between", value1, value2, "creatAt");
            return (Criteria) this;
        }

        public Criteria andUpadteByIsNull() {
            addCriterion("upadte_by is null");
            return (Criteria) this;
        }

        public Criteria andUpadteByIsNotNull() {
            addCriterion("upadte_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpadteByEqualTo(String value) {
            addCriterion("upadte_by =", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByNotEqualTo(String value) {
            addCriterion("upadte_by <>", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByGreaterThan(String value) {
            addCriterion("upadte_by >", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByGreaterThanOrEqualTo(String value) {
            addCriterion("upadte_by >=", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByLessThan(String value) {
            addCriterion("upadte_by <", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByLessThanOrEqualTo(String value) {
            addCriterion("upadte_by <=", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByLike(String value) {
            addCriterion("upadte_by like", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByNotLike(String value) {
            addCriterion("upadte_by not like", value, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByIn(List<String> values) {
            addCriterion("upadte_by in", values, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByNotIn(List<String> values) {
            addCriterion("upadte_by not in", values, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByBetween(String value1, String value2) {
            addCriterion("upadte_by between", value1, value2, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpadteByNotBetween(String value1, String value2) {
            addCriterion("upadte_by not between", value1, value2, "upadteBy");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Long value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Long value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Long value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Long value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Long value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Long> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Long> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Long value1, Long value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Long value1, Long value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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