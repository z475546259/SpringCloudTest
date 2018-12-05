package com.zzq.service0.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppResultExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("APP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("APP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("APP_NAME =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("APP_NAME <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("APP_NAME >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NAME >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("APP_NAME <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("APP_NAME <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("APP_NAME like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("APP_NAME not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("APP_NAME in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("APP_NAME not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("APP_NAME between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("APP_NAME not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreIsNull() {
            addCriterion("APP_USERSCORE is null");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreIsNotNull() {
            addCriterion("APP_USERSCORE is not null");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreEqualTo(Integer value) {
            addCriterion("APP_USERSCORE =", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreNotEqualTo(Integer value) {
            addCriterion("APP_USERSCORE <>", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreGreaterThan(Integer value) {
            addCriterion("APP_USERSCORE >", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("APP_USERSCORE >=", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreLessThan(Integer value) {
            addCriterion("APP_USERSCORE <", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreLessThanOrEqualTo(Integer value) {
            addCriterion("APP_USERSCORE <=", value, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreIn(List<Integer> values) {
            addCriterion("APP_USERSCORE in", values, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreNotIn(List<Integer> values) {
            addCriterion("APP_USERSCORE not in", values, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreBetween(Integer value1, Integer value2) {
            addCriterion("APP_USERSCORE between", value1, value2, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUserscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("APP_USERSCORE not between", value1, value2, "appUserscore");
            return (Criteria) this;
        }

        public Criteria andAppUsertelIsNull() {
            addCriterion("APP_USERTEL is null");
            return (Criteria) this;
        }

        public Criteria andAppUsertelIsNotNull() {
            addCriterion("APP_USERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsertelEqualTo(String value) {
            addCriterion("APP_USERTEL =", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelNotEqualTo(String value) {
            addCriterion("APP_USERTEL <>", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelGreaterThan(String value) {
            addCriterion("APP_USERTEL >", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USERTEL >=", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelLessThan(String value) {
            addCriterion("APP_USERTEL <", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelLessThanOrEqualTo(String value) {
            addCriterion("APP_USERTEL <=", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelLike(String value) {
            addCriterion("APP_USERTEL like", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelNotLike(String value) {
            addCriterion("APP_USERTEL not like", value, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelIn(List<String> values) {
            addCriterion("APP_USERTEL in", values, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelNotIn(List<String> values) {
            addCriterion("APP_USERTEL not in", values, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelBetween(String value1, String value2) {
            addCriterion("APP_USERTEL between", value1, value2, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUsertelNotBetween(String value1, String value2) {
            addCriterion("APP_USERTEL not between", value1, value2, "appUsertel");
            return (Criteria) this;
        }

        public Criteria andAppUseremailIsNull() {
            addCriterion("APP_USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAppUseremailIsNotNull() {
            addCriterion("APP_USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAppUseremailEqualTo(String value) {
            addCriterion("APP_USEREMAIL =", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailNotEqualTo(String value) {
            addCriterion("APP_USEREMAIL <>", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailGreaterThan(String value) {
            addCriterion("APP_USEREMAIL >", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USEREMAIL >=", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailLessThan(String value) {
            addCriterion("APP_USEREMAIL <", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailLessThanOrEqualTo(String value) {
            addCriterion("APP_USEREMAIL <=", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailLike(String value) {
            addCriterion("APP_USEREMAIL like", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailNotLike(String value) {
            addCriterion("APP_USEREMAIL not like", value, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailIn(List<String> values) {
            addCriterion("APP_USEREMAIL in", values, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailNotIn(List<String> values) {
            addCriterion("APP_USEREMAIL not in", values, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailBetween(String value1, String value2) {
            addCriterion("APP_USEREMAIL between", value1, value2, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andAppUseremailNotBetween(String value1, String value2) {
            addCriterion("APP_USEREMAIL not between", value1, value2, "appUseremail");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNull() {
            addCriterion("CHARGE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIsNotNull() {
            addCriterion("CHARGE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyEqualTo(Integer value) {
            addCriterion("CHARGE_MONEY =", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotEqualTo(Integer value) {
            addCriterion("CHARGE_MONEY <>", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThan(Integer value) {
            addCriterion("CHARGE_MONEY >", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_MONEY >=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThan(Integer value) {
            addCriterion("CHARGE_MONEY <", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_MONEY <=", value, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyIn(List<Integer> values) {
            addCriterion("CHARGE_MONEY in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotIn(List<Integer> values) {
            addCriterion("CHARGE_MONEY not in", values, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_MONEY between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andChargeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_MONEY not between", value1, value2, "chargeMoney");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAppUseridIsNull() {
            addCriterion("APP_USERID is null");
            return (Criteria) this;
        }

        public Criteria andAppUseridIsNotNull() {
            addCriterion("APP_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andAppUseridEqualTo(String value) {
            addCriterion("APP_USERID =", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridNotEqualTo(String value) {
            addCriterion("APP_USERID <>", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridGreaterThan(String value) {
            addCriterion("APP_USERID >", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USERID >=", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridLessThan(String value) {
            addCriterion("APP_USERID <", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridLessThanOrEqualTo(String value) {
            addCriterion("APP_USERID <=", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridLike(String value) {
            addCriterion("APP_USERID like", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridNotLike(String value) {
            addCriterion("APP_USERID not like", value, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridIn(List<String> values) {
            addCriterion("APP_USERID in", values, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridNotIn(List<String> values) {
            addCriterion("APP_USERID not in", values, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridBetween(String value1, String value2) {
            addCriterion("APP_USERID between", value1, value2, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUseridNotBetween(String value1, String value2) {
            addCriterion("APP_USERID not between", value1, value2, "appUserid");
            return (Criteria) this;
        }

        public Criteria andAppUsernameIsNull() {
            addCriterion("APP_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAppUsernameIsNotNull() {
            addCriterion("APP_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppUsernameEqualTo(String value) {
            addCriterion("APP_USERNAME =", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameNotEqualTo(String value) {
            addCriterion("APP_USERNAME <>", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameGreaterThan(String value) {
            addCriterion("APP_USERNAME >", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USERNAME >=", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameLessThan(String value) {
            addCriterion("APP_USERNAME <", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameLessThanOrEqualTo(String value) {
            addCriterion("APP_USERNAME <=", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameLike(String value) {
            addCriterion("APP_USERNAME like", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameNotLike(String value) {
            addCriterion("APP_USERNAME not like", value, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameIn(List<String> values) {
            addCriterion("APP_USERNAME in", values, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameNotIn(List<String> values) {
            addCriterion("APP_USERNAME not in", values, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameBetween(String value1, String value2) {
            addCriterion("APP_USERNAME between", value1, value2, "appUsername");
            return (Criteria) this;
        }

        public Criteria andAppUsernameNotBetween(String value1, String value2) {
            addCriterion("APP_USERNAME not between", value1, value2, "appUsername");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("IS_DEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("IS_DEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("IS_DEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("IS_DEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("IS_DEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("IS_DEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DEL not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordIsNull() {
            addCriterion("APP_USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordIsNotNull() {
            addCriterion("APP_USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordEqualTo(String value) {
            addCriterion("APP_USERPASSWORD =", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordNotEqualTo(String value) {
            addCriterion("APP_USERPASSWORD <>", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordGreaterThan(String value) {
            addCriterion("APP_USERPASSWORD >", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USERPASSWORD >=", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordLessThan(String value) {
            addCriterion("APP_USERPASSWORD <", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("APP_USERPASSWORD <=", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordLike(String value) {
            addCriterion("APP_USERPASSWORD like", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordNotLike(String value) {
            addCriterion("APP_USERPASSWORD not like", value, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordIn(List<String> values) {
            addCriterion("APP_USERPASSWORD in", values, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordNotIn(List<String> values) {
            addCriterion("APP_USERPASSWORD not in", values, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordBetween(String value1, String value2) {
            addCriterion("APP_USERPASSWORD between", value1, value2, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andAppUserpasswordNotBetween(String value1, String value2) {
            addCriterion("APP_USERPASSWORD not between", value1, value2, "appUserpassword");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("DEVICE_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("DEVICE_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNull() {
            addCriterion("USER_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNotNull() {
            addCriterion("USER_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgentEqualTo(String value) {
            addCriterion("USER_AGENT =", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotEqualTo(String value) {
            addCriterion("USER_AGENT <>", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThan(String value) {
            addCriterion("USER_AGENT >", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("USER_AGENT >=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThan(String value) {
            addCriterion("USER_AGENT <", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThanOrEqualTo(String value) {
            addCriterion("USER_AGENT <=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLike(String value) {
            addCriterion("USER_AGENT like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotLike(String value) {
            addCriterion("USER_AGENT not like", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentIn(List<String> values) {
            addCriterion("USER_AGENT in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotIn(List<String> values) {
            addCriterion("USER_AGENT not in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentBetween(String value1, String value2) {
            addCriterion("USER_AGENT between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotBetween(String value1, String value2) {
            addCriterion("USER_AGENT not between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedIsNull() {
            addCriterion("IS_GENERATED is null");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedIsNotNull() {
            addCriterion("IS_GENERATED is not null");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedEqualTo(Byte value) {
            addCriterion("IS_GENERATED =", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedNotEqualTo(Byte value) {
            addCriterion("IS_GENERATED <>", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedGreaterThan(Byte value) {
            addCriterion("IS_GENERATED >", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_GENERATED >=", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedLessThan(Byte value) {
            addCriterion("IS_GENERATED <", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedLessThanOrEqualTo(Byte value) {
            addCriterion("IS_GENERATED <=", value, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedIn(List<Byte> values) {
            addCriterion("IS_GENERATED in", values, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedNotIn(List<Byte> values) {
            addCriterion("IS_GENERATED not in", values, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedBetween(Byte value1, Byte value2) {
            addCriterion("IS_GENERATED between", value1, value2, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andIsGeneratedNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_GENERATED not between", value1, value2, "isGenerated");
            return (Criteria) this;
        }

        public Criteria andEarnIsNull() {
            addCriterion("EARN is null");
            return (Criteria) this;
        }

        public Criteria andEarnIsNotNull() {
            addCriterion("EARN is not null");
            return (Criteria) this;
        }

        public Criteria andEarnEqualTo(BigDecimal value) {
            addCriterion("EARN =", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnNotEqualTo(BigDecimal value) {
            addCriterion("EARN <>", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnGreaterThan(BigDecimal value) {
            addCriterion("EARN >", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EARN >=", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnLessThan(BigDecimal value) {
            addCriterion("EARN <", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EARN <=", value, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnIn(List<BigDecimal> values) {
            addCriterion("EARN in", values, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnNotIn(List<BigDecimal> values) {
            addCriterion("EARN not in", values, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARN between", value1, value2, "earn");
            return (Criteria) this;
        }

        public Criteria andEarnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARN not between", value1, value2, "earn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("TEMP is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("TEMP =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("TEMP <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("TEMP >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("TEMP <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("TEMP <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("TEMP like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("TEMP not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("TEMP in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("TEMP not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("TEMP between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("TEMP not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andCodeMineIsNull() {
            addCriterion("CODE_MINE is null");
            return (Criteria) this;
        }

        public Criteria andCodeMineIsNotNull() {
            addCriterion("CODE_MINE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeMineEqualTo(String value) {
            addCriterion("CODE_MINE =", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineNotEqualTo(String value) {
            addCriterion("CODE_MINE <>", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineGreaterThan(String value) {
            addCriterion("CODE_MINE >", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_MINE >=", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineLessThan(String value) {
            addCriterion("CODE_MINE <", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineLessThanOrEqualTo(String value) {
            addCriterion("CODE_MINE <=", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineLike(String value) {
            addCriterion("CODE_MINE like", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineNotLike(String value) {
            addCriterion("CODE_MINE not like", value, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineIn(List<String> values) {
            addCriterion("CODE_MINE in", values, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineNotIn(List<String> values) {
            addCriterion("CODE_MINE not in", values, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineBetween(String value1, String value2) {
            addCriterion("CODE_MINE between", value1, value2, "codeMine");
            return (Criteria) this;
        }

        public Criteria andCodeMineNotBetween(String value1, String value2) {
            addCriterion("CODE_MINE not between", value1, value2, "codeMine");
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