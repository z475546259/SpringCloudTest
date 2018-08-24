//package com.zzq.service0.entity;
//
//import com.sun.javafx.cursor.CursorType;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.sql.ResultSet;
//
///**
// * @author zhangzhiqiang
// * @date 2018-08-21 16:45
// * &Desc 存储过程的实体类
// */
//@Entity
//@Table(name = "PROCEDURE1")
//@NamedStoredProcedureQueries(@NamedStoredProcedureQuery(name = "get_result_account",procedureName = "DHGG_DATA.get_data",parameters = {
//        @StoredProcedureParameter(mode = ParameterMode.IN,name = "m_type",type = String.class),@StoredProcedureParameter(mode = ParameterMode.IN,name = "m_flag",type = String.class),
//        @StoredProcedureParameter(mode = ParameterMode.OUT,name = "ret",type = ResultSet.class)
//}))
//public class ProcedureEntity implements Serializable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "APP_USERTEL",unique = false,nullable = false)
//    @SequenceGenerator(name = "s_app_autodo_result",sequenceName = "s_app_autodo_result",allocationSize = 1 )
//    String app_usertel;
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "PASSWORD",unique = false,nullable = false)
//    @SequenceGenerator(name = "s_app_autodo_result",sequenceName = "s_app_autodo_result",allocationSize = 1 )
//    String password;
//
//    public String getApp_usertel() {
//        return app_usertel;
//    }
//
//    public void setApp_usertel(String app_usertel) {
//        this.app_usertel = app_usertel;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}
