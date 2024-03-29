package com.zzp.entity.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysRolePrivilegeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SysRolePrivilegeExample() {
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

    /**
     * <p>Description:  sys_role_privilege表的实体类 </p>
     * <p>Title: GeneratedCriteria </p>
     * <p>Create Time:2018-11-15 22:27 </p>
     *
     * @author: mybatis generator
     * @version: 1.0
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andSrpIdIsNull() {
            addCriterion("srp_id is null");
            return (Criteria) this;
        }

        public Criteria andSrpIdIsNotNull() {
            addCriterion("srp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrpIdEqualTo(Integer value) {
            addCriterion("srp_id =", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdNotEqualTo(Integer value) {
            addCriterion("srp_id <>", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdGreaterThan(Integer value) {
            addCriterion("srp_id >", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srp_id >=", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdLessThan(Integer value) {
            addCriterion("srp_id <", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdLessThanOrEqualTo(Integer value) {
            addCriterion("srp_id <=", value, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdIn(List<Integer> values) {
            addCriterion("srp_id in", values, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdNotIn(List<Integer> values) {
            addCriterion("srp_id not in", values, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdBetween(Integer value1, Integer value2) {
            addCriterion("srp_id between", value1, value2, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srp_id not between", value1, value2, "srpId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdIsNull() {
            addCriterion("srp_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdIsNotNull() {
            addCriterion("srp_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdEqualTo(Integer value) {
            addCriterion("srp_role_id =", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdNotEqualTo(Integer value) {
            addCriterion("srp_role_id <>", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdGreaterThan(Integer value) {
            addCriterion("srp_role_id >", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srp_role_id >=", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdLessThan(Integer value) {
            addCriterion("srp_role_id <", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("srp_role_id <=", value, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdIn(List<Integer> values) {
            addCriterion("srp_role_id in", values, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdNotIn(List<Integer> values) {
            addCriterion("srp_role_id not in", values, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("srp_role_id between", value1, value2, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srp_role_id not between", value1, value2, "srpRoleId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdIsNull() {
            addCriterion("srp_privilege_id is null");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdIsNotNull() {
            addCriterion("srp_privilege_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdEqualTo(Integer value) {
            addCriterion("srp_privilege_id =", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdNotEqualTo(Integer value) {
            addCriterion("srp_privilege_id <>", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdGreaterThan(Integer value) {
            addCriterion("srp_privilege_id >", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("srp_privilege_id >=", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdLessThan(Integer value) {
            addCriterion("srp_privilege_id <", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("srp_privilege_id <=", value, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdIn(List<Integer> values) {
            addCriterion("srp_privilege_id in", values, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdNotIn(List<Integer> values) {
            addCriterion("srp_privilege_id not in", values, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdBetween(Integer value1, Integer value2) {
            addCriterion("srp_privilege_id between", value1, value2, "srpPrivilegeId");
            return (Criteria) this;
        }

        public Criteria andSrpPrivilegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("srp_privilege_id not between", value1, value2, "srpPrivilegeId");
            return (Criteria) this;
        }
    }

    /**
     * sys_role_privilege
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * <p>Description:  sys_role_privilege表的实体类 </p>
     * <p>Title: Criterion </p>
     * <p>Create Time:2018-11-15 22:27 </p>
     *
     * @author: mybatis generator
     * @version: 1.0
     */
    public static class Criterion implements Serializable {
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