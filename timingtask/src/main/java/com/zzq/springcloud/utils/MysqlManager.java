package com.zzq.springcloud.utils;

import com.zzq.springcloud.entities.cnUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlManager {
    /**
     * 获取数据库连接
     * @return
     */
    public static Connection getConnection(){
        Connection connection = null;
        String url = "jdbc:mysql://120.77.202.205:3306/zzq?useSSL=false";
        String user="writer";
        String password="zzqwriter";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =  DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 获取菜鸟理财用户
     * @return
     */
    public static List<cnUser> getCNUsers(){
        List<cnUser> cnUsers = new ArrayList<>();
        Connection connection = getConnection();
        Statement stmt = null;
        String sql = "select * from app_autodo_result  where is_del = 0 and app_name='菜鸟理财' ";
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                cnUser cnUser = new cnUser();
                cnUser.setTelephone(result.getString("APP_USERTEL"));
                cnUser.setPassword(result.getString("APP_USERPASSWORD"));
                cnUser.setDeviceID(result.getString("DEVICE_ID"));
                cnUser.setUser_agent(result.getString("USER_AGENT"));
                cnUser.setEarn(result.getInt("EARN"));
                cnUser.setScore(result.getInt("APP_USERSCORE"));
                cnUser.setCnuserID(result.getString("APP_USERID"));
                cnUser.setCodeMine(result.getString("CODE_MINE"));
                cnUsers.add(cnUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                RecordToFile.record(new String[]{"断开数据库连接失败"}, "error-log.txt",true);
            }
        }
        return  cnUsers;
    }
}
