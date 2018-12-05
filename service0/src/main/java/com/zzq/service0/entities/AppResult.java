package com.zzq.service0.entities;

import java.math.BigDecimal;
import java.util.Date;

public class AppResult {
    private Integer id;

    private String appName;

    private Integer appUserscore;

    private String appUsertel;

    private String appUseremail;

    private String password;

    private Integer chargeMoney;

    private String note;

    private Date updateTime;

    private String appUserid;

    private String appUsername;

    private Boolean isDel;

    private String appUserpassword;

    private String deviceId;

    private String userAgent;

    private Byte isGenerated;

    private BigDecimal earn;

    private Date createTime;

    private String temp;

    private String codeMine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Integer getAppUserscore() {
        return appUserscore;
    }

    public void setAppUserscore(Integer appUserscore) {
        this.appUserscore = appUserscore;
    }

    public String getAppUsertel() {
        return appUsertel;
    }

    public void setAppUsertel(String appUsertel) {
        this.appUsertel = appUsertel == null ? null : appUsertel.trim();
    }

    public String getAppUseremail() {
        return appUseremail;
    }

    public void setAppUseremail(String appUseremail) {
        this.appUseremail = appUseremail == null ? null : appUseremail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(Integer chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAppUserid() {
        return appUserid;
    }

    public void setAppUserid(String appUserid) {
        this.appUserid = appUserid == null ? null : appUserid.trim();
    }

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername == null ? null : appUsername.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getAppUserpassword() {
        return appUserpassword;
    }

    public void setAppUserpassword(String appUserpassword) {
        this.appUserpassword = appUserpassword == null ? null : appUserpassword.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    public Byte getIsGenerated() {
        return isGenerated;
    }

    public void setIsGenerated(Byte isGenerated) {
        this.isGenerated = isGenerated;
    }

    public BigDecimal getEarn() {
        return earn;
    }

    public void setEarn(BigDecimal earn) {
        this.earn = earn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getCodeMine() {
        return codeMine;
    }

    public void setCodeMine(String codeMine) {
        this.codeMine = codeMine == null ? null : codeMine.trim();
    }
}