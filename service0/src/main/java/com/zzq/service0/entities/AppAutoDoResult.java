package com.zzq.service0.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangzhiqiang
 * @date 2018-08-22 11:18
 * &Desc app_autodo_resutl实体类
 */
@Entity(name = "APP_AUTODO_RESULT")
@SequenceGenerator(name = "sequence",sequenceName = "S_APP_AUTODO_RESULT",allocationSize = 1)
public class AppAutoDoResult implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence")
    @Column(name = "ID",unique = true,nullable = false)

    private Long id;

    private String APP_NAME;
    private Integer APP_USERSCORE;
    private String APP_USERTEL;
    private String APP_USEREMAIL;
    private String PASSWORD;
    private Integer CHARGE_MONEY;
    private String NOTE;
    private Date UPDATE_TIME;
    private String APP_USERID;
    private String APP_USERNAME;
    private String APP_USERPASSWORD;
    private String DEVICE_ID;
    private String USER_AGENT;
    private Date CREATE_TIME;
    private Integer EARN;
    private Integer IS_DEL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAPP_NAME() {
        return APP_NAME;
    }

    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME;
    }

    public Integer getAPP_USERSCORE() {
        return APP_USERSCORE;
    }

    public void setAPP_USERSCORE(Integer APP_USERSCORE) {
        this.APP_USERSCORE = APP_USERSCORE;
    }

    public String getAPP_USERTEL() {
        return APP_USERTEL;
    }

    public void setAPP_USERTEL(String APP_USERTEL) {
        this.APP_USERTEL = APP_USERTEL;
    }

    public String getAPP_USEREMAIL() {
        return APP_USEREMAIL;
    }

    public void setAPP_USEREMAIL(String APP_USEREMAIL) {
        this.APP_USEREMAIL = APP_USEREMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Integer getCHARGE_MONEY() {
        return CHARGE_MONEY;
    }

    public void setCHARGE_MONEY(Integer CHARGE_MONEY) {
        this.CHARGE_MONEY = CHARGE_MONEY;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public String getAPP_USERID() {
        return APP_USERID;
    }

    public void setAPP_USERID(String APP_USERID) {
        this.APP_USERID = APP_USERID;
    }

    public String getAPP_USERNAME() {
        return APP_USERNAME;
    }

    public void setAPP_USERNAME(String APP_USERNAME) {
        this.APP_USERNAME = APP_USERNAME;
    }

    public String getAPP_USERPASSWORD() {
        return APP_USERPASSWORD;
    }

    public void setAPP_USERPASSWORD(String APP_USERPASSWORD) {
        this.APP_USERPASSWORD = APP_USERPASSWORD;
    }

    public String getDEVICE_ID() {
        return DEVICE_ID;
    }

    public void setDEVICE_ID(String DEVICE_ID) {
        this.DEVICE_ID = DEVICE_ID;
    }

    public String getUSER_AGENT() {
        return USER_AGENT;
    }

    public void setUSER_AGENT(String USER_AGENT) {
        this.USER_AGENT = USER_AGENT;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Integer getEARN() {
        return EARN;
    }

    public void setEARN(Integer EARN) {
        this.EARN = EARN;
    }

    public Integer getIS_DEL() {
        return IS_DEL;
    }

    public void setIS_DEL(Integer IS_DEL) {
        this.IS_DEL = IS_DEL;
    }

    @Override
    public String toString() {
        return "AppAutoDoResult{" +
                "id=" + id +
                ", APP_NAME='" + APP_NAME + '\'' +
                ", APP_USERSCORE=" + APP_USERSCORE +
                ", APP_USERTEL='" + APP_USERTEL + '\'' +
                ", APP_USEREMAIL='" + APP_USEREMAIL + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", CHARGE_MONEY=" + CHARGE_MONEY +
                ", NOTE='" + NOTE + '\'' +
                ", UPDATE_TIME=" + UPDATE_TIME +
                ", APP_USERID='" + APP_USERID + '\'' +
                ", APP_USERNAME='" + APP_USERNAME + '\'' +
                ", APP_USERPASSWORD='" + APP_USERPASSWORD + '\'' +
                ", DEVICE_ID='" + DEVICE_ID + '\'' +
                ", USER_AGENT='" + USER_AGENT + '\'' +
                ", CREATE_TIME=" + CREATE_TIME +
                ", EARN=" + EARN +
                ", IS_DEL=" + IS_DEL +
                '}';
    }
}
