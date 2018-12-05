package com.zzq.service0.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private BigDecimal id;

    private String tel;

    private BigDecimal recharge;

    private BigDecimal charged;

    private Date createTime;

    private Date updateTime;

    private BigDecimal receive;

    private BigDecimal discount;

    private String referrer;

    private Date lastChargeTime;

    private String lastChargeAccount;

    private String lastChargePass;

    private BigDecimal lastChargeStatu;

    private Date createtime;

    private String lastchargeaccount;

    private String lastchargepass;

    private Integer lastchargestatu;

    private Date lastchargetime;

    private String regerer;

    private Date updatetime;

    private String note;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public BigDecimal getRecharge() {
        return recharge;
    }

    public void setRecharge(BigDecimal recharge) {
        this.recharge = recharge;
    }

    public BigDecimal getCharged() {
        return charged;
    }

    public void setCharged(BigDecimal charged) {
        this.charged = charged;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getReceive() {
        return receive;
    }

    public void setReceive(BigDecimal receive) {
        this.receive = receive;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer == null ? null : referrer.trim();
    }

    public Date getLastChargeTime() {
        return lastChargeTime;
    }

    public void setLastChargeTime(Date lastChargeTime) {
        this.lastChargeTime = lastChargeTime;
    }

    public String getLastChargeAccount() {
        return lastChargeAccount;
    }

    public void setLastChargeAccount(String lastChargeAccount) {
        this.lastChargeAccount = lastChargeAccount == null ? null : lastChargeAccount.trim();
    }

    public String getLastChargePass() {
        return lastChargePass;
    }

    public void setLastChargePass(String lastChargePass) {
        this.lastChargePass = lastChargePass == null ? null : lastChargePass.trim();
    }

    public BigDecimal getLastChargeStatu() {
        return lastChargeStatu;
    }

    public void setLastChargeStatu(BigDecimal lastChargeStatu) {
        this.lastChargeStatu = lastChargeStatu;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLastchargeaccount() {
        return lastchargeaccount;
    }

    public void setLastchargeaccount(String lastchargeaccount) {
        this.lastchargeaccount = lastchargeaccount == null ? null : lastchargeaccount.trim();
    }

    public String getLastchargepass() {
        return lastchargepass;
    }

    public void setLastchargepass(String lastchargepass) {
        this.lastchargepass = lastchargepass == null ? null : lastchargepass.trim();
    }

    public Integer getLastchargestatu() {
        return lastchargestatu;
    }

    public void setLastchargestatu(Integer lastchargestatu) {
        this.lastchargestatu = lastchargestatu;
    }

    public Date getLastchargetime() {
        return lastchargetime;
    }

    public void setLastchargetime(Date lastchargetime) {
        this.lastchargetime = lastchargetime;
    }

    public String getRegerer() {
        return regerer;
    }

    public void setRegerer(String regerer) {
        this.regerer = regerer == null ? null : regerer.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}