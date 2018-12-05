package com.zzq.service0.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNull() {
            addCriterion("RECHARGE is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIsNotNull() {
            addCriterion("RECHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeEqualTo(BigDecimal value) {
            addCriterion("RECHARGE =", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotEqualTo(BigDecimal value) {
            addCriterion("RECHARGE <>", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThan(BigDecimal value) {
            addCriterion("RECHARGE >", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECHARGE >=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThan(BigDecimal value) {
            addCriterion("RECHARGE <", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECHARGE <=", value, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeIn(List<BigDecimal> values) {
            addCriterion("RECHARGE in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotIn(List<BigDecimal> values) {
            addCriterion("RECHARGE not in", values, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECHARGE between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECHARGE not between", value1, value2, "recharge");
            return (Criteria) this;
        }

        public Criteria andChargedIsNull() {
            addCriterion("CHARGED is null");
            return (Criteria) this;
        }

        public Criteria andChargedIsNotNull() {
            addCriterion("CHARGED is not null");
            return (Criteria) this;
        }

        public Criteria andChargedEqualTo(BigDecimal value) {
            addCriterion("CHARGED =", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotEqualTo(BigDecimal value) {
            addCriterion("CHARGED <>", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedGreaterThan(BigDecimal value) {
            addCriterion("CHARGED >", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGED >=", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedLessThan(BigDecimal value) {
            addCriterion("CHARGED <", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGED <=", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedIn(List<BigDecimal> values) {
            addCriterion("CHARGED in", values, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotIn(List<BigDecimal> values) {
            addCriterion("CHARGED not in", values, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGED between", value1, value2, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGED not between", value1, value2, "charged");
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

        public Criteria andReceiveIsNull() {
            addCriterion("RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNotNull() {
            addCriterion("RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEqualTo(BigDecimal value) {
            addCriterion("RECEIVE =", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE <>", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE >", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE >=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThan(BigDecimal value) {
            addCriterion("RECEIVE <", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE <=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveIn(List<BigDecimal> values) {
            addCriterion("RECEIVE in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE not in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE not between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("REFERRER is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("REFERRER is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("REFERRER =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("REFERRER <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("REFERRER >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("REFERRER >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("REFERRER <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("REFERRER <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("REFERRER like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("REFERRER not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("REFERRER in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("REFERRER not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("REFERRER between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("REFERRER not between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIsNull() {
            addCriterion("LAST_CHARGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIsNotNull() {
            addCriterion("LAST_CHARGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeEqualTo(Date value) {
            addCriterion("LAST_CHARGE_TIME =", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotEqualTo(Date value) {
            addCriterion("LAST_CHARGE_TIME <>", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeGreaterThan(Date value) {
            addCriterion("LAST_CHARGE_TIME >", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_CHARGE_TIME >=", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeLessThan(Date value) {
            addCriterion("LAST_CHARGE_TIME <", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_CHARGE_TIME <=", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIn(List<Date> values) {
            addCriterion("LAST_CHARGE_TIME in", values, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotIn(List<Date> values) {
            addCriterion("LAST_CHARGE_TIME not in", values, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_CHARGE_TIME between", value1, value2, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_CHARGE_TIME not between", value1, value2, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountIsNull() {
            addCriterion("LAST_CHARGE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountIsNotNull() {
            addCriterion("LAST_CHARGE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountEqualTo(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT =", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountNotEqualTo(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT <>", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountGreaterThan(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT >", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT >=", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountLessThan(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT <", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountLessThanOrEqualTo(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT <=", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountLike(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT like", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountNotLike(String value) {
            addCriterion("LAST_CHARGE_ACCOUNT not like", value, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountIn(List<String> values) {
            addCriterion("LAST_CHARGE_ACCOUNT in", values, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountNotIn(List<String> values) {
            addCriterion("LAST_CHARGE_ACCOUNT not in", values, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountBetween(String value1, String value2) {
            addCriterion("LAST_CHARGE_ACCOUNT between", value1, value2, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargeAccountNotBetween(String value1, String value2) {
            addCriterion("LAST_CHARGE_ACCOUNT not between", value1, value2, "lastChargeAccount");
            return (Criteria) this;
        }

        public Criteria andLastChargePassIsNull() {
            addCriterion("LAST_CHARGE_PASS is null");
            return (Criteria) this;
        }

        public Criteria andLastChargePassIsNotNull() {
            addCriterion("LAST_CHARGE_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargePassEqualTo(String value) {
            addCriterion("LAST_CHARGE_PASS =", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassNotEqualTo(String value) {
            addCriterion("LAST_CHARGE_PASS <>", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassGreaterThan(String value) {
            addCriterion("LAST_CHARGE_PASS >", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CHARGE_PASS >=", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassLessThan(String value) {
            addCriterion("LAST_CHARGE_PASS <", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassLessThanOrEqualTo(String value) {
            addCriterion("LAST_CHARGE_PASS <=", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassLike(String value) {
            addCriterion("LAST_CHARGE_PASS like", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassNotLike(String value) {
            addCriterion("LAST_CHARGE_PASS not like", value, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassIn(List<String> values) {
            addCriterion("LAST_CHARGE_PASS in", values, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassNotIn(List<String> values) {
            addCriterion("LAST_CHARGE_PASS not in", values, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassBetween(String value1, String value2) {
            addCriterion("LAST_CHARGE_PASS between", value1, value2, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargePassNotBetween(String value1, String value2) {
            addCriterion("LAST_CHARGE_PASS not between", value1, value2, "lastChargePass");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuIsNull() {
            addCriterion("LAST_CHARGE_STATU is null");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuIsNotNull() {
            addCriterion("LAST_CHARGE_STATU is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuEqualTo(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU =", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuNotEqualTo(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU <>", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuGreaterThan(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU >", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU >=", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuLessThan(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU <", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_CHARGE_STATU <=", value, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuIn(List<BigDecimal> values) {
            addCriterion("LAST_CHARGE_STATU in", values, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuNotIn(List<BigDecimal> values) {
            addCriterion("LAST_CHARGE_STATU not in", values, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_CHARGE_STATU between", value1, value2, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andLastChargeStatuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_CHARGE_STATU not between", value1, value2, "lastChargeStatu");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountIsNull() {
            addCriterion("lastchargeaccount is null");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountIsNotNull() {
            addCriterion("lastchargeaccount is not null");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountEqualTo(String value) {
            addCriterion("lastchargeaccount =", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountNotEqualTo(String value) {
            addCriterion("lastchargeaccount <>", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountGreaterThan(String value) {
            addCriterion("lastchargeaccount >", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountGreaterThanOrEqualTo(String value) {
            addCriterion("lastchargeaccount >=", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountLessThan(String value) {
            addCriterion("lastchargeaccount <", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountLessThanOrEqualTo(String value) {
            addCriterion("lastchargeaccount <=", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountLike(String value) {
            addCriterion("lastchargeaccount like", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountNotLike(String value) {
            addCriterion("lastchargeaccount not like", value, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountIn(List<String> values) {
            addCriterion("lastchargeaccount in", values, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountNotIn(List<String> values) {
            addCriterion("lastchargeaccount not in", values, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountBetween(String value1, String value2) {
            addCriterion("lastchargeaccount between", value1, value2, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargeaccountNotBetween(String value1, String value2) {
            addCriterion("lastchargeaccount not between", value1, value2, "lastchargeaccount");
            return (Criteria) this;
        }

        public Criteria andLastchargepassIsNull() {
            addCriterion("lastchargepass is null");
            return (Criteria) this;
        }

        public Criteria andLastchargepassIsNotNull() {
            addCriterion("lastchargepass is not null");
            return (Criteria) this;
        }

        public Criteria andLastchargepassEqualTo(String value) {
            addCriterion("lastchargepass =", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassNotEqualTo(String value) {
            addCriterion("lastchargepass <>", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassGreaterThan(String value) {
            addCriterion("lastchargepass >", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassGreaterThanOrEqualTo(String value) {
            addCriterion("lastchargepass >=", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassLessThan(String value) {
            addCriterion("lastchargepass <", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassLessThanOrEqualTo(String value) {
            addCriterion("lastchargepass <=", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassLike(String value) {
            addCriterion("lastchargepass like", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassNotLike(String value) {
            addCriterion("lastchargepass not like", value, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassIn(List<String> values) {
            addCriterion("lastchargepass in", values, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassNotIn(List<String> values) {
            addCriterion("lastchargepass not in", values, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassBetween(String value1, String value2) {
            addCriterion("lastchargepass between", value1, value2, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargepassNotBetween(String value1, String value2) {
            addCriterion("lastchargepass not between", value1, value2, "lastchargepass");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuIsNull() {
            addCriterion("lastchargestatu is null");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuIsNotNull() {
            addCriterion("lastchargestatu is not null");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuEqualTo(Integer value) {
            addCriterion("lastchargestatu =", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuNotEqualTo(Integer value) {
            addCriterion("lastchargestatu <>", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuGreaterThan(Integer value) {
            addCriterion("lastchargestatu >", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastchargestatu >=", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuLessThan(Integer value) {
            addCriterion("lastchargestatu <", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuLessThanOrEqualTo(Integer value) {
            addCriterion("lastchargestatu <=", value, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuIn(List<Integer> values) {
            addCriterion("lastchargestatu in", values, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuNotIn(List<Integer> values) {
            addCriterion("lastchargestatu not in", values, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuBetween(Integer value1, Integer value2) {
            addCriterion("lastchargestatu between", value1, value2, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargestatuNotBetween(Integer value1, Integer value2) {
            addCriterion("lastchargestatu not between", value1, value2, "lastchargestatu");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeIsNull() {
            addCriterion("lastchargetime is null");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeIsNotNull() {
            addCriterion("lastchargetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeEqualTo(Date value) {
            addCriterion("lastchargetime =", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeNotEqualTo(Date value) {
            addCriterion("lastchargetime <>", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeGreaterThan(Date value) {
            addCriterion("lastchargetime >", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastchargetime >=", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeLessThan(Date value) {
            addCriterion("lastchargetime <", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastchargetime <=", value, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeIn(List<Date> values) {
            addCriterion("lastchargetime in", values, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeNotIn(List<Date> values) {
            addCriterion("lastchargetime not in", values, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeBetween(Date value1, Date value2) {
            addCriterion("lastchargetime between", value1, value2, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andLastchargetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastchargetime not between", value1, value2, "lastchargetime");
            return (Criteria) this;
        }

        public Criteria andRegererIsNull() {
            addCriterion("regerer is null");
            return (Criteria) this;
        }

        public Criteria andRegererIsNotNull() {
            addCriterion("regerer is not null");
            return (Criteria) this;
        }

        public Criteria andRegererEqualTo(String value) {
            addCriterion("regerer =", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererNotEqualTo(String value) {
            addCriterion("regerer <>", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererGreaterThan(String value) {
            addCriterion("regerer >", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererGreaterThanOrEqualTo(String value) {
            addCriterion("regerer >=", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererLessThan(String value) {
            addCriterion("regerer <", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererLessThanOrEqualTo(String value) {
            addCriterion("regerer <=", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererLike(String value) {
            addCriterion("regerer like", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererNotLike(String value) {
            addCriterion("regerer not like", value, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererIn(List<String> values) {
            addCriterion("regerer in", values, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererNotIn(List<String> values) {
            addCriterion("regerer not in", values, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererBetween(String value1, String value2) {
            addCriterion("regerer between", value1, value2, "regerer");
            return (Criteria) this;
        }

        public Criteria andRegererNotBetween(String value1, String value2) {
            addCriterion("regerer not between", value1, value2, "regerer");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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