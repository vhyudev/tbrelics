package com.lxtech.tbrelics.domain;

import java.util.ArrayList;
import java.util.List;

public class LCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LCollectionExample() {
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

        public Criteria andIdentifiertypeIsNull() {
            addCriterion("identifierType is null");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeIsNotNull() {
            addCriterion("identifierType is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeEqualTo(String value) {
            addCriterion("identifierType =", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeNotEqualTo(String value) {
            addCriterion("identifierType <>", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeGreaterThan(String value) {
            addCriterion("identifierType >", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeGreaterThanOrEqualTo(String value) {
            addCriterion("identifierType >=", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeLessThan(String value) {
            addCriterion("identifierType <", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeLessThanOrEqualTo(String value) {
            addCriterion("identifierType <=", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeLike(String value) {
            addCriterion("identifierType like", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeNotLike(String value) {
            addCriterion("identifierType not like", value, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeIn(List<String> values) {
            addCriterion("identifierType in", values, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeNotIn(List<String> values) {
            addCriterion("identifierType not in", values, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeBetween(String value1, String value2) {
            addCriterion("identifierType between", value1, value2, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifiertypeNotBetween(String value1, String value2) {
            addCriterion("identifierType not between", value1, value2, "identifiertype");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFormertitleIsNull() {
            addCriterion("formerTitle is null");
            return (Criteria) this;
        }

        public Criteria andFormertitleIsNotNull() {
            addCriterion("formerTitle is not null");
            return (Criteria) this;
        }

        public Criteria andFormertitleEqualTo(String value) {
            addCriterion("formerTitle =", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleNotEqualTo(String value) {
            addCriterion("formerTitle <>", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleGreaterThan(String value) {
            addCriterion("formerTitle >", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleGreaterThanOrEqualTo(String value) {
            addCriterion("formerTitle >=", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleLessThan(String value) {
            addCriterion("formerTitle <", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleLessThanOrEqualTo(String value) {
            addCriterion("formerTitle <=", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleLike(String value) {
            addCriterion("formerTitle like", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleNotLike(String value) {
            addCriterion("formerTitle not like", value, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleIn(List<String> values) {
            addCriterion("formerTitle in", values, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleNotIn(List<String> values) {
            addCriterion("formerTitle not in", values, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleBetween(String value1, String value2) {
            addCriterion("formerTitle between", value1, value2, "formertitle");
            return (Criteria) this;
        }

        public Criteria andFormertitleNotBetween(String value1, String value2) {
            addCriterion("formerTitle not between", value1, value2, "formertitle");
            return (Criteria) this;
        }

        public Criteria andChronologyIsNull() {
            addCriterion("chronology is null");
            return (Criteria) this;
        }

        public Criteria andChronologyIsNotNull() {
            addCriterion("chronology is not null");
            return (Criteria) this;
        }

        public Criteria andChronologyEqualTo(String value) {
            addCriterion("chronology =", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyNotEqualTo(String value) {
            addCriterion("chronology <>", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyGreaterThan(String value) {
            addCriterion("chronology >", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyGreaterThanOrEqualTo(String value) {
            addCriterion("chronology >=", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyLessThan(String value) {
            addCriterion("chronology <", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyLessThanOrEqualTo(String value) {
            addCriterion("chronology <=", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyLike(String value) {
            addCriterion("chronology like", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyNotLike(String value) {
            addCriterion("chronology not like", value, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyIn(List<String> values) {
            addCriterion("chronology in", values, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyNotIn(List<String> values) {
            addCriterion("chronology not in", values, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyBetween(String value1, String value2) {
            addCriterion("chronology between", value1, value2, "chronology");
            return (Criteria) this;
        }

        public Criteria andChronologyNotBetween(String value1, String value2) {
            addCriterion("chronology not between", value1, value2, "chronology");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriod1IsNull() {
            addCriterion("period1 is null");
            return (Criteria) this;
        }

        public Criteria andPeriod1IsNotNull() {
            addCriterion("period1 is not null");
            return (Criteria) this;
        }

        public Criteria andPeriod1EqualTo(String value) {
            addCriterion("period1 =", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1NotEqualTo(String value) {
            addCriterion("period1 <>", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1GreaterThan(String value) {
            addCriterion("period1 >", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1GreaterThanOrEqualTo(String value) {
            addCriterion("period1 >=", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1LessThan(String value) {
            addCriterion("period1 <", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1LessThanOrEqualTo(String value) {
            addCriterion("period1 <=", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1Like(String value) {
            addCriterion("period1 like", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1NotLike(String value) {
            addCriterion("period1 not like", value, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1In(List<String> values) {
            addCriterion("period1 in", values, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1NotIn(List<String> values) {
            addCriterion("period1 not in", values, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1Between(String value1, String value2) {
            addCriterion("period1 between", value1, value2, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod1NotBetween(String value1, String value2) {
            addCriterion("period1 not between", value1, value2, "period1");
            return (Criteria) this;
        }

        public Criteria andPeriod2IsNull() {
            addCriterion("period2 is null");
            return (Criteria) this;
        }

        public Criteria andPeriod2IsNotNull() {
            addCriterion("period2 is not null");
            return (Criteria) this;
        }

        public Criteria andPeriod2EqualTo(String value) {
            addCriterion("period2 =", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2NotEqualTo(String value) {
            addCriterion("period2 <>", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2GreaterThan(String value) {
            addCriterion("period2 >", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2GreaterThanOrEqualTo(String value) {
            addCriterion("period2 >=", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2LessThan(String value) {
            addCriterion("period2 <", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2LessThanOrEqualTo(String value) {
            addCriterion("period2 <=", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2Like(String value) {
            addCriterion("period2 like", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2NotLike(String value) {
            addCriterion("period2 not like", value, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2In(List<String> values) {
            addCriterion("period2 in", values, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2NotIn(List<String> values) {
            addCriterion("period2 not in", values, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2Between(String value1, String value2) {
            addCriterion("period2 between", value1, value2, "period2");
            return (Criteria) this;
        }

        public Criteria andPeriod2NotBetween(String value1, String value2) {
            addCriterion("period2 not between", value1, value2, "period2");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNull() {
            addCriterion("workType is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNotNull() {
            addCriterion("workType is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeEqualTo(String value) {
            addCriterion("workType =", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotEqualTo(String value) {
            addCriterion("workType <>", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThan(String value) {
            addCriterion("workType >", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("workType >=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThan(String value) {
            addCriterion("workType <", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThanOrEqualTo(String value) {
            addCriterion("workType <=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLike(String value) {
            addCriterion("workType like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotLike(String value) {
            addCriterion("workType not like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeIn(List<String> values) {
            addCriterion("workType in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotIn(List<String> values) {
            addCriterion("workType not in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeBetween(String value1, String value2) {
            addCriterion("workType between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotBetween(String value1, String value2) {
            addCriterion("workType not between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andTexturetype1IsNull() {
            addCriterion("textureType1 is null");
            return (Criteria) this;
        }

        public Criteria andTexturetype1IsNotNull() {
            addCriterion("textureType1 is not null");
            return (Criteria) this;
        }

        public Criteria andTexturetype1EqualTo(String value) {
            addCriterion("textureType1 =", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1NotEqualTo(String value) {
            addCriterion("textureType1 <>", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1GreaterThan(String value) {
            addCriterion("textureType1 >", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1GreaterThanOrEqualTo(String value) {
            addCriterion("textureType1 >=", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1LessThan(String value) {
            addCriterion("textureType1 <", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1LessThanOrEqualTo(String value) {
            addCriterion("textureType1 <=", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1Like(String value) {
            addCriterion("textureType1 like", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1NotLike(String value) {
            addCriterion("textureType1 not like", value, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1In(List<String> values) {
            addCriterion("textureType1 in", values, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1NotIn(List<String> values) {
            addCriterion("textureType1 not in", values, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1Between(String value1, String value2) {
            addCriterion("textureType1 between", value1, value2, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype1NotBetween(String value1, String value2) {
            addCriterion("textureType1 not between", value1, value2, "texturetype1");
            return (Criteria) this;
        }

        public Criteria andTexturetype2IsNull() {
            addCriterion("textureType2 is null");
            return (Criteria) this;
        }

        public Criteria andTexturetype2IsNotNull() {
            addCriterion("textureType2 is not null");
            return (Criteria) this;
        }

        public Criteria andTexturetype2EqualTo(String value) {
            addCriterion("textureType2 =", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2NotEqualTo(String value) {
            addCriterion("textureType2 <>", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2GreaterThan(String value) {
            addCriterion("textureType2 >", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2GreaterThanOrEqualTo(String value) {
            addCriterion("textureType2 >=", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2LessThan(String value) {
            addCriterion("textureType2 <", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2LessThanOrEqualTo(String value) {
            addCriterion("textureType2 <=", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2Like(String value) {
            addCriterion("textureType2 like", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2NotLike(String value) {
            addCriterion("textureType2 not like", value, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2In(List<String> values) {
            addCriterion("textureType2 in", values, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2NotIn(List<String> values) {
            addCriterion("textureType2 not in", values, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2Between(String value1, String value2) {
            addCriterion("textureType2 between", value1, value2, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andTexturetype2NotBetween(String value1, String value2) {
            addCriterion("textureType2 not between", value1, value2, "texturetype2");
            return (Criteria) this;
        }

        public Criteria andMaterialsIsNull() {
            addCriterion("materials is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsIsNotNull() {
            addCriterion("materials is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsEqualTo(String value) {
            addCriterion("materials =", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotEqualTo(String value) {
            addCriterion("materials <>", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsGreaterThan(String value) {
            addCriterion("materials >", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("materials >=", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLessThan(String value) {
            addCriterion("materials <", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLessThanOrEqualTo(String value) {
            addCriterion("materials <=", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLike(String value) {
            addCriterion("materials like", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotLike(String value) {
            addCriterion("materials not like", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsIn(List<String> values) {
            addCriterion("materials in", values, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotIn(List<String> values) {
            addCriterion("materials not in", values, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsBetween(String value1, String value2) {
            addCriterion("materials between", value1, value2, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotBetween(String value1, String value2) {
            addCriterion("materials not between", value1, value2, "materials");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityIsNull() {
            addCriterion("absoluteQuantity is null");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityIsNotNull() {
            addCriterion("absoluteQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityEqualTo(String value) {
            addCriterion("absoluteQuantity =", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityNotEqualTo(String value) {
            addCriterion("absoluteQuantity <>", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityGreaterThan(String value) {
            addCriterion("absoluteQuantity >", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityGreaterThanOrEqualTo(String value) {
            addCriterion("absoluteQuantity >=", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityLessThan(String value) {
            addCriterion("absoluteQuantity <", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityLessThanOrEqualTo(String value) {
            addCriterion("absoluteQuantity <=", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityLike(String value) {
            addCriterion("absoluteQuantity like", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityNotLike(String value) {
            addCriterion("absoluteQuantity not like", value, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityIn(List<String> values) {
            addCriterion("absoluteQuantity in", values, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityNotIn(List<String> values) {
            addCriterion("absoluteQuantity not in", values, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityBetween(String value1, String value2) {
            addCriterion("absoluteQuantity between", value1, value2, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andAbsolutequantityNotBetween(String value1, String value2) {
            addCriterion("absoluteQuantity not between", value1, value2, "absolutequantity");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(String value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(String value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(String value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(String value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(String value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(String value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLike(String value) {
            addCriterion("length like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotLike(String value) {
            addCriterion("length not like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<String> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<String> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(String value1, String value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(String value1, String value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(String value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(String value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(String value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(String value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(String value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(String value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLike(String value) {
            addCriterion("width like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotLike(String value) {
            addCriterion("width not like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<String> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<String> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(String value1, String value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(String value1, String value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNull() {
            addCriterion("dimensions is null");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNotNull() {
            addCriterion("dimensions is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionsEqualTo(String value) {
            addCriterion("dimensions =", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotEqualTo(String value) {
            addCriterion("dimensions <>", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThan(String value) {
            addCriterion("dimensions >", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThanOrEqualTo(String value) {
            addCriterion("dimensions >=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThan(String value) {
            addCriterion("dimensions <", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThanOrEqualTo(String value) {
            addCriterion("dimensions <=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLike(String value) {
            addCriterion("dimensions like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotLike(String value) {
            addCriterion("dimensions not like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsIn(List<String> values) {
            addCriterion("dimensions in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotIn(List<String> values) {
            addCriterion("dimensions not in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsBetween(String value1, String value2) {
            addCriterion("dimensions between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotBetween(String value1, String value2) {
            addCriterion("dimensions not between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andMassrangeIsNull() {
            addCriterion("massRange is null");
            return (Criteria) this;
        }

        public Criteria andMassrangeIsNotNull() {
            addCriterion("massRange is not null");
            return (Criteria) this;
        }

        public Criteria andMassrangeEqualTo(String value) {
            addCriterion("massRange =", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeNotEqualTo(String value) {
            addCriterion("massRange <>", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeGreaterThan(String value) {
            addCriterion("massRange >", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeGreaterThanOrEqualTo(String value) {
            addCriterion("massRange >=", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeLessThan(String value) {
            addCriterion("massRange <", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeLessThanOrEqualTo(String value) {
            addCriterion("massRange <=", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeLike(String value) {
            addCriterion("massRange like", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeNotLike(String value) {
            addCriterion("massRange not like", value, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeIn(List<String> values) {
            addCriterion("massRange in", values, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeNotIn(List<String> values) {
            addCriterion("massRange not in", values, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeBetween(String value1, String value2) {
            addCriterion("massRange between", value1, value2, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassrangeNotBetween(String value1, String value2) {
            addCriterion("massRange not between", value1, value2, "massrange");
            return (Criteria) this;
        }

        public Criteria andMassIsNull() {
            addCriterion("mass is null");
            return (Criteria) this;
        }

        public Criteria andMassIsNotNull() {
            addCriterion("mass is not null");
            return (Criteria) this;
        }

        public Criteria andMassEqualTo(String value) {
            addCriterion("mass =", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotEqualTo(String value) {
            addCriterion("mass <>", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThan(String value) {
            addCriterion("mass >", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThanOrEqualTo(String value) {
            addCriterion("mass >=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThan(String value) {
            addCriterion("mass <", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThanOrEqualTo(String value) {
            addCriterion("mass <=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLike(String value) {
            addCriterion("mass like", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotLike(String value) {
            addCriterion("mass not like", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassIn(List<String> values) {
            addCriterion("mass in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotIn(List<String> values) {
            addCriterion("mass not in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassBetween(String value1, String value2) {
            addCriterion("mass between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotBetween(String value1, String value2) {
            addCriterion("mass not between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMassunitIsNull() {
            addCriterion("massUnit is null");
            return (Criteria) this;
        }

        public Criteria andMassunitIsNotNull() {
            addCriterion("massUnit is not null");
            return (Criteria) this;
        }

        public Criteria andMassunitEqualTo(String value) {
            addCriterion("massUnit =", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitNotEqualTo(String value) {
            addCriterion("massUnit <>", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitGreaterThan(String value) {
            addCriterion("massUnit >", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitGreaterThanOrEqualTo(String value) {
            addCriterion("massUnit >=", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitLessThan(String value) {
            addCriterion("massUnit <", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitLessThanOrEqualTo(String value) {
            addCriterion("massUnit <=", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitLike(String value) {
            addCriterion("massUnit like", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitNotLike(String value) {
            addCriterion("massUnit not like", value, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitIn(List<String> values) {
            addCriterion("massUnit in", values, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitNotIn(List<String> values) {
            addCriterion("massUnit not in", values, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitBetween(String value1, String value2) {
            addCriterion("massUnit between", value1, value2, "massunit");
            return (Criteria) this;
        }

        public Criteria andMassunitNotBetween(String value1, String value2) {
            addCriterion("massUnit not between", value1, value2, "massunit");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessIsNull() {
            addCriterion("levelOfCompleteness is null");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessIsNotNull() {
            addCriterion("levelOfCompleteness is not null");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessEqualTo(String value) {
            addCriterion("levelOfCompleteness =", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessNotEqualTo(String value) {
            addCriterion("levelOfCompleteness <>", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessGreaterThan(String value) {
            addCriterion("levelOfCompleteness >", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessGreaterThanOrEqualTo(String value) {
            addCriterion("levelOfCompleteness >=", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessLessThan(String value) {
            addCriterion("levelOfCompleteness <", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessLessThanOrEqualTo(String value) {
            addCriterion("levelOfCompleteness <=", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessLike(String value) {
            addCriterion("levelOfCompleteness like", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessNotLike(String value) {
            addCriterion("levelOfCompleteness not like", value, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessIn(List<String> values) {
            addCriterion("levelOfCompleteness in", values, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessNotIn(List<String> values) {
            addCriterion("levelOfCompleteness not in", values, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessBetween(String value1, String value2) {
            addCriterion("levelOfCompleteness between", value1, value2, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andLevelofcompletenessNotBetween(String value1, String value2) {
            addCriterion("levelOfCompleteness not between", value1, value2, "levelofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessIsNull() {
            addCriterion("currentConditionOfCompleteness is null");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessIsNotNull() {
            addCriterion("currentConditionOfCompleteness is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessEqualTo(String value) {
            addCriterion("currentConditionOfCompleteness =", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessNotEqualTo(String value) {
            addCriterion("currentConditionOfCompleteness <>", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessGreaterThan(String value) {
            addCriterion("currentConditionOfCompleteness >", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessGreaterThanOrEqualTo(String value) {
            addCriterion("currentConditionOfCompleteness >=", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessLessThan(String value) {
            addCriterion("currentConditionOfCompleteness <", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessLessThanOrEqualTo(String value) {
            addCriterion("currentConditionOfCompleteness <=", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessLike(String value) {
            addCriterion("currentConditionOfCompleteness like", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessNotLike(String value) {
            addCriterion("currentConditionOfCompleteness not like", value, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessIn(List<String> values) {
            addCriterion("currentConditionOfCompleteness in", values, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessNotIn(List<String> values) {
            addCriterion("currentConditionOfCompleteness not in", values, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessBetween(String value1, String value2) {
            addCriterion("currentConditionOfCompleteness between", value1, value2, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andCurrentconditionofcompletenessNotBetween(String value1, String value2) {
            addCriterion("currentConditionOfCompleteness not between", value1, value2, "currentconditionofcompleteness");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationIsNull() {
            addCriterion("presentStateOfPreservation is null");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationIsNotNull() {
            addCriterion("presentStateOfPreservation is not null");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationEqualTo(String value) {
            addCriterion("presentStateOfPreservation =", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationNotEqualTo(String value) {
            addCriterion("presentStateOfPreservation <>", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationGreaterThan(String value) {
            addCriterion("presentStateOfPreservation >", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationGreaterThanOrEqualTo(String value) {
            addCriterion("presentStateOfPreservation >=", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationLessThan(String value) {
            addCriterion("presentStateOfPreservation <", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationLessThanOrEqualTo(String value) {
            addCriterion("presentStateOfPreservation <=", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationLike(String value) {
            addCriterion("presentStateOfPreservation like", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationNotLike(String value) {
            addCriterion("presentStateOfPreservation not like", value, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationIn(List<String> values) {
            addCriterion("presentStateOfPreservation in", values, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationNotIn(List<String> values) {
            addCriterion("presentStateOfPreservation not in", values, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationBetween(String value1, String value2) {
            addCriterion("presentStateOfPreservation between", value1, value2, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andPresentstateofpreservationNotBetween(String value1, String value2) {
            addCriterion("presentStateOfPreservation not between", value1, value2, "presentstateofpreservation");
            return (Criteria) this;
        }

        public Criteria andAccessiondateIsNull() {
            addCriterion("accessionDate is null");
            return (Criteria) this;
        }

        public Criteria andAccessiondateIsNotNull() {
            addCriterion("accessionDate is not null");
            return (Criteria) this;
        }

        public Criteria andAccessiondateEqualTo(String value) {
            addCriterion("accessionDate =", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateNotEqualTo(String value) {
            addCriterion("accessionDate <>", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateGreaterThan(String value) {
            addCriterion("accessionDate >", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateGreaterThanOrEqualTo(String value) {
            addCriterion("accessionDate >=", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateLessThan(String value) {
            addCriterion("accessionDate <", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateLessThanOrEqualTo(String value) {
            addCriterion("accessionDate <=", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateLike(String value) {
            addCriterion("accessionDate like", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateNotLike(String value) {
            addCriterion("accessionDate not like", value, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateIn(List<String> values) {
            addCriterion("accessionDate in", values, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateNotIn(List<String> values) {
            addCriterion("accessionDate not in", values, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateBetween(String value1, String value2) {
            addCriterion("accessionDate between", value1, value2, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessiondateNotBetween(String value1, String value2) {
            addCriterion("accessionDate not between", value1, value2, "accessiondate");
            return (Criteria) this;
        }

        public Criteria andAccessionyearIsNull() {
            addCriterion("accessionYear is null");
            return (Criteria) this;
        }

        public Criteria andAccessionyearIsNotNull() {
            addCriterion("accessionYear is not null");
            return (Criteria) this;
        }

        public Criteria andAccessionyearEqualTo(String value) {
            addCriterion("accessionYear =", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearNotEqualTo(String value) {
            addCriterion("accessionYear <>", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearGreaterThan(String value) {
            addCriterion("accessionYear >", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearGreaterThanOrEqualTo(String value) {
            addCriterion("accessionYear >=", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearLessThan(String value) {
            addCriterion("accessionYear <", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearLessThanOrEqualTo(String value) {
            addCriterion("accessionYear <=", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearLike(String value) {
            addCriterion("accessionYear like", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearNotLike(String value) {
            addCriterion("accessionYear not like", value, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearIn(List<String> values) {
            addCriterion("accessionYear in", values, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearNotIn(List<String> values) {
            addCriterion("accessionYear not in", values, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearBetween(String value1, String value2) {
            addCriterion("accessionYear between", value1, value2, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAccessionyearNotBetween(String value1, String value2) {
            addCriterion("accessionYear not between", value1, value2, "accessionyear");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andEditionIsNull() {
            addCriterion("edition is null");
            return (Criteria) this;
        }

        public Criteria andEditionIsNotNull() {
            addCriterion("edition is not null");
            return (Criteria) this;
        }

        public Criteria andEditionEqualTo(String value) {
            addCriterion("edition =", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotEqualTo(String value) {
            addCriterion("edition <>", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThan(String value) {
            addCriterion("edition >", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionGreaterThanOrEqualTo(String value) {
            addCriterion("edition >=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThan(String value) {
            addCriterion("edition <", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLessThanOrEqualTo(String value) {
            addCriterion("edition <=", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionLike(String value) {
            addCriterion("edition like", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotLike(String value) {
            addCriterion("edition not like", value, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionIn(List<String> values) {
            addCriterion("edition in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotIn(List<String> values) {
            addCriterion("edition not in", values, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionBetween(String value1, String value2) {
            addCriterion("edition between", value1, value2, "edition");
            return (Criteria) this;
        }

        public Criteria andEditionNotBetween(String value1, String value2) {
            addCriterion("edition not between", value1, value2, "edition");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeIsNull() {
            addCriterion("existingVolume is null");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeIsNotNull() {
            addCriterion("existingVolume is not null");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeEqualTo(String value) {
            addCriterion("existingVolume =", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeNotEqualTo(String value) {
            addCriterion("existingVolume <>", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeGreaterThan(String value) {
            addCriterion("existingVolume >", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeGreaterThanOrEqualTo(String value) {
            addCriterion("existingVolume >=", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeLessThan(String value) {
            addCriterion("existingVolume <", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeLessThanOrEqualTo(String value) {
            addCriterion("existingVolume <=", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeLike(String value) {
            addCriterion("existingVolume like", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeNotLike(String value) {
            addCriterion("existingVolume not like", value, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeIn(List<String> values) {
            addCriterion("existingVolume in", values, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeNotIn(List<String> values) {
            addCriterion("existingVolume not in", values, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeBetween(String value1, String value2) {
            addCriterion("existingVolume between", value1, value2, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andExistingvolumeNotBetween(String value1, String value2) {
            addCriterion("existingVolume not between", value1, value2, "existingvolume");
            return (Criteria) this;
        }

        public Criteria andF33IsNull() {
            addCriterion("F33 is null");
            return (Criteria) this;
        }

        public Criteria andF33IsNotNull() {
            addCriterion("F33 is not null");
            return (Criteria) this;
        }

        public Criteria andF33EqualTo(String value) {
            addCriterion("F33 =", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33NotEqualTo(String value) {
            addCriterion("F33 <>", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33GreaterThan(String value) {
            addCriterion("F33 >", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33GreaterThanOrEqualTo(String value) {
            addCriterion("F33 >=", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33LessThan(String value) {
            addCriterion("F33 <", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33LessThanOrEqualTo(String value) {
            addCriterion("F33 <=", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33Like(String value) {
            addCriterion("F33 like", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33NotLike(String value) {
            addCriterion("F33 not like", value, "f33");
            return (Criteria) this;
        }

        public Criteria andF33In(List<String> values) {
            addCriterion("F33 in", values, "f33");
            return (Criteria) this;
        }

        public Criteria andF33NotIn(List<String> values) {
            addCriterion("F33 not in", values, "f33");
            return (Criteria) this;
        }

        public Criteria andF33Between(String value1, String value2) {
            addCriterion("F33 between", value1, value2, "f33");
            return (Criteria) this;
        }

        public Criteria andF33NotBetween(String value1, String value2) {
            addCriterion("F33 not between", value1, value2, "f33");
            return (Criteria) this;
        }

        public Criteria andF34IsNull() {
            addCriterion("F34 is null");
            return (Criteria) this;
        }

        public Criteria andF34IsNotNull() {
            addCriterion("F34 is not null");
            return (Criteria) this;
        }

        public Criteria andF34EqualTo(String value) {
            addCriterion("F34 =", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34NotEqualTo(String value) {
            addCriterion("F34 <>", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34GreaterThan(String value) {
            addCriterion("F34 >", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34GreaterThanOrEqualTo(String value) {
            addCriterion("F34 >=", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34LessThan(String value) {
            addCriterion("F34 <", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34LessThanOrEqualTo(String value) {
            addCriterion("F34 <=", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34Like(String value) {
            addCriterion("F34 like", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34NotLike(String value) {
            addCriterion("F34 not like", value, "f34");
            return (Criteria) this;
        }

        public Criteria andF34In(List<String> values) {
            addCriterion("F34 in", values, "f34");
            return (Criteria) this;
        }

        public Criteria andF34NotIn(List<String> values) {
            addCriterion("F34 not in", values, "f34");
            return (Criteria) this;
        }

        public Criteria andF34Between(String value1, String value2) {
            addCriterion("F34 between", value1, value2, "f34");
            return (Criteria) this;
        }

        public Criteria andF34NotBetween(String value1, String value2) {
            addCriterion("F34 not between", value1, value2, "f34");
            return (Criteria) this;
        }

        public Criteria andF35IsNull() {
            addCriterion("F35 is null");
            return (Criteria) this;
        }

        public Criteria andF35IsNotNull() {
            addCriterion("F35 is not null");
            return (Criteria) this;
        }

        public Criteria andF35EqualTo(String value) {
            addCriterion("F35 =", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35NotEqualTo(String value) {
            addCriterion("F35 <>", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35GreaterThan(String value) {
            addCriterion("F35 >", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35GreaterThanOrEqualTo(String value) {
            addCriterion("F35 >=", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35LessThan(String value) {
            addCriterion("F35 <", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35LessThanOrEqualTo(String value) {
            addCriterion("F35 <=", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35Like(String value) {
            addCriterion("F35 like", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35NotLike(String value) {
            addCriterion("F35 not like", value, "f35");
            return (Criteria) this;
        }

        public Criteria andF35In(List<String> values) {
            addCriterion("F35 in", values, "f35");
            return (Criteria) this;
        }

        public Criteria andF35NotIn(List<String> values) {
            addCriterion("F35 not in", values, "f35");
            return (Criteria) this;
        }

        public Criteria andF35Between(String value1, String value2) {
            addCriterion("F35 between", value1, value2, "f35");
            return (Criteria) this;
        }

        public Criteria andF35NotBetween(String value1, String value2) {
            addCriterion("F35 not between", value1, value2, "f35");
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