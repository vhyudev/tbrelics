package com.lxtech.tbrelics.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ViewApplicationResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewApplicationResourceExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNull() {
            addCriterion("applicationId is null");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNotNull() {
            addCriterion("applicationId is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationidEqualTo(Long value) {
            addCriterion("applicationId =", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotEqualTo(Long value) {
            addCriterion("applicationId <>", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThan(Long value) {
            addCriterion("applicationId >", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThanOrEqualTo(Long value) {
            addCriterion("applicationId >=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThan(Long value) {
            addCriterion("applicationId <", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThanOrEqualTo(Long value) {
            addCriterion("applicationId <=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidIn(List<Long> values) {
            addCriterion("applicationId in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotIn(List<Long> values) {
            addCriterion("applicationId not in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidBetween(Long value1, Long value2) {
            addCriterion("applicationId between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotBetween(Long value1, Long value2) {
            addCriterion("applicationId not between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNull() {
            addCriterion("resourceId is null");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNotNull() {
            addCriterion("resourceId is not null");
            return (Criteria) this;
        }

        public Criteria andResourceidEqualTo(Long value) {
            addCriterion("resourceId =", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotEqualTo(Long value) {
            addCriterion("resourceId <>", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThan(Long value) {
            addCriterion("resourceId >", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThanOrEqualTo(Long value) {
            addCriterion("resourceId >=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThan(Long value) {
            addCriterion("resourceId <", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThanOrEqualTo(Long value) {
            addCriterion("resourceId <=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidIn(List<Long> values) {
            addCriterion("resourceId in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotIn(List<Long> values) {
            addCriterion("resourceId not in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidBetween(Long value1, Long value2) {
            addCriterion("resourceId between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotBetween(Long value1, Long value2) {
            addCriterion("resourceId not between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterionForJDBCDate("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNull() {
            addCriterion("useTime is null");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNotNull() {
            addCriterion("useTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsetimeEqualTo(Date value) {
            addCriterionForJDBCDate("useTime =", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("useTime <>", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("useTime >", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("useTime >=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThan(Date value) {
            addCriterionForJDBCDate("useTime <", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("useTime <=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeIn(List<Date> values) {
            addCriterionForJDBCDate("useTime in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("useTime not in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("useTime between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("useTime not between", value1, value2, "usetime");
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

        public Criteria andAddresssIsNull() {
            addCriterion("addresss is null");
            return (Criteria) this;
        }

        public Criteria andAddresssIsNotNull() {
            addCriterion("addresss is not null");
            return (Criteria) this;
        }

        public Criteria andAddresssEqualTo(String value) {
            addCriterion("addresss =", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssNotEqualTo(String value) {
            addCriterion("addresss <>", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssGreaterThan(String value) {
            addCriterion("addresss >", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssGreaterThanOrEqualTo(String value) {
            addCriterion("addresss >=", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssLessThan(String value) {
            addCriterion("addresss <", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssLessThanOrEqualTo(String value) {
            addCriterion("addresss <=", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssLike(String value) {
            addCriterion("addresss like", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssNotLike(String value) {
            addCriterion("addresss not like", value, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssIn(List<String> values) {
            addCriterion("addresss in", values, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssNotIn(List<String> values) {
            addCriterion("addresss not in", values, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssBetween(String value1, String value2) {
            addCriterion("addresss between", value1, value2, "addresss");
            return (Criteria) this;
        }

        public Criteria andAddresssNotBetween(String value1, String value2) {
            addCriterion("addresss not between", value1, value2, "addresss");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andResolutionratioIsNull() {
            addCriterion("resolutionRatio is null");
            return (Criteria) this;
        }

        public Criteria andResolutionratioIsNotNull() {
            addCriterion("resolutionRatio is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionratioEqualTo(String value) {
            addCriterion("resolutionRatio =", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioNotEqualTo(String value) {
            addCriterion("resolutionRatio <>", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioGreaterThan(String value) {
            addCriterion("resolutionRatio >", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioGreaterThanOrEqualTo(String value) {
            addCriterion("resolutionRatio >=", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioLessThan(String value) {
            addCriterion("resolutionRatio <", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioLessThanOrEqualTo(String value) {
            addCriterion("resolutionRatio <=", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioLike(String value) {
            addCriterion("resolutionRatio like", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioNotLike(String value) {
            addCriterion("resolutionRatio not like", value, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioIn(List<String> values) {
            addCriterion("resolutionRatio in", values, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioNotIn(List<String> values) {
            addCriterion("resolutionRatio not in", values, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioBetween(String value1, String value2) {
            addCriterion("resolutionRatio between", value1, value2, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andResolutionratioNotBetween(String value1, String value2) {
            addCriterion("resolutionRatio not between", value1, value2, "resolutionratio");
            return (Criteria) this;
        }

        public Criteria andImgsizeIsNull() {
            addCriterion("imgSize is null");
            return (Criteria) this;
        }

        public Criteria andImgsizeIsNotNull() {
            addCriterion("imgSize is not null");
            return (Criteria) this;
        }

        public Criteria andImgsizeEqualTo(String value) {
            addCriterion("imgSize =", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotEqualTo(String value) {
            addCriterion("imgSize <>", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeGreaterThan(String value) {
            addCriterion("imgSize >", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeGreaterThanOrEqualTo(String value) {
            addCriterion("imgSize >=", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLessThan(String value) {
            addCriterion("imgSize <", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLessThanOrEqualTo(String value) {
            addCriterion("imgSize <=", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeLike(String value) {
            addCriterion("imgSize like", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotLike(String value) {
            addCriterion("imgSize not like", value, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeIn(List<String> values) {
            addCriterion("imgSize in", values, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotIn(List<String> values) {
            addCriterion("imgSize not in", values, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeBetween(String value1, String value2) {
            addCriterion("imgSize between", value1, value2, "imgsize");
            return (Criteria) this;
        }

        public Criteria andImgsizeNotBetween(String value1, String value2) {
            addCriterion("imgSize not between", value1, value2, "imgsize");
            return (Criteria) this;
        }

        public Criteria andRelicidIsNull() {
            addCriterion("relicId is null");
            return (Criteria) this;
        }

        public Criteria andRelicidIsNotNull() {
            addCriterion("relicId is not null");
            return (Criteria) this;
        }

        public Criteria andRelicidEqualTo(Long value) {
            addCriterion("relicId =", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidNotEqualTo(Long value) {
            addCriterion("relicId <>", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidGreaterThan(Long value) {
            addCriterion("relicId >", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidGreaterThanOrEqualTo(Long value) {
            addCriterion("relicId >=", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidLessThan(Long value) {
            addCriterion("relicId <", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidLessThanOrEqualTo(Long value) {
            addCriterion("relicId <=", value, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidIn(List<Long> values) {
            addCriterion("relicId in", values, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidNotIn(List<Long> values) {
            addCriterion("relicId not in", values, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidBetween(Long value1, Long value2) {
            addCriterion("relicId between", value1, value2, "relicid");
            return (Criteria) this;
        }

        public Criteria andRelicidNotBetween(Long value1, Long value2) {
            addCriterion("relicId not between", value1, value2, "relicid");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
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