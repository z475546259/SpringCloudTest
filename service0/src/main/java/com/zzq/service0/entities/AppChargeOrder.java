package com.zzq.service0.entities;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;
@Entity
@DynamicUpdate   //不加注解，对象save时updateTime不会自动更新
public class AppChargeOrder {
    @Id
    @Column(name="id", nullable=false)
    @SequenceGenerator(name="patient_seq", sequenceName="patient_id_seq")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name ="tel")
    private String tel;
    private double recharge;
    private Date createtime;
    private Date updatetime;
    private double receive;
    private double discount;
    private String note;
    private String regerer;
    private Date lastchargetime;
    private String lastchargeaccount;
    private String lastchargepass;
    private int lastchargestatu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getRecharge() {
        return recharge;
    }

    public void setRecharge(double recharge) {
        this.recharge = recharge;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public double getReceive() {
        return receive;
    }

    public void setReceive(double receive) {
        this.receive = receive;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRegerer() {
        return regerer;
    }

    public void setRegerer(String regerer) {
        this.regerer = regerer;
    }

    public Date getLastchargetime() {
        return lastchargetime;
    }

    public void setLastchargetime(Date lastchargetime) {
        this.lastchargetime = lastchargetime;
    }

    public String getLastchargeaccount() {
        return lastchargeaccount;
    }

    public void setLastchargeaccount(String lastchargeaccount) {
        this.lastchargeaccount = lastchargeaccount;
    }

    public String getLastchargepass() {
        return lastchargepass;
    }

    public void setLastchargepass(String lastchargepass) {
        this.lastchargepass = lastchargepass;
    }

    public int getLastchargestatu() {
        return lastchargestatu;
    }

    public void setLastchargestatu(int lastchargestatu) {
        this.lastchargestatu = lastchargestatu;
    }

    @Override
    public String toString() {
        return "AppChargeOrder{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", recharge=" + recharge +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", receive=" + receive +
                ", discount=" + discount +
                ", note='" + note + '\'' +
                ", regerer='" + regerer + '\'' +
                ", lastchargetime=" + lastchargetime +
                ", lastchargeaccount='" + lastchargeaccount + '\'' +
                ", lastchargepass='" + lastchargepass + '\'' +
                ", lastchargestatu=" + lastchargestatu +
                '}';
    }
}
