package com.zzq.service0.util;

import com.zzq.service0.entities.cnUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OperateOracle {

    // 定义连接所需的字符串
    // 192.168.0.X是本机地址(要改成自己的IP地址)，1521端口号，XE是精简版Oracle的默认数据库名
    private static String USERNAMR = "ZZQ";
    private static String PASSWORD = "ZZQZZQ";
    private static String DRVIER = "oracle.jdbc.driver.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@120.76.132.101:1521:orcl2";

    // 创建一个数据库连接
    Connection connection = null;
    // 创建预编译语句对象，一般都是用这个而不用Statement
    PreparedStatement pstm = null;
    // 创建一个结果集对象
    ResultSet rs = null;

    /**
     * 向数据库插入 app薅羊毛 结果
     *
     */
    public void AddData(String appName,cnUser user) {
        connection = getConnection();
        // String sql =
        // "insert into student values('1','王小军','1','17','北京市和平里七区30号楼7门102')";
//        String sql = "select count(*) from student where 1 = 1";
        String sqlStr = "insert into APP_AUTODO_RESULT (app_name,app_username,app_usertel,app_useremail,app_userpassword,app_userscore,app_userid,device_id,user_agent)values(?,?,?,?,?,?,?,?,?)";

        try {
            // 执行插入数据操作
            pstm = connection.prepareStatement(sqlStr);
            pstm.setString(1, appName);
            pstm.setString(2, user.getUser_name());
            pstm.setString(3, user.getTelephone());
            pstm.setString(4, "email");
            pstm.setString(5, user.getPassword());
            pstm.setInt(6, user.getScore());
            pstm.setString(7, user.getCnuserID());
            pstm.setString(8, user.getDeviceID());
            pstm.setString(9, user.getUser_agent());
//            pstm.executeUpdate();
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }
    /**
     * 更新菜鸟理财 app薅羊毛 结果
     *
     */
    public void updateCaiNiaoLiCaiData(String appName,cnUser user) {
        connection = getConnection();
        // String sql =
        // "insert into student values('1','王小军','1','17','北京市和平里七区30号楼7门102')";
//        String sql = "select count(*) from student where 1 = 1";
        String sqlStr = "UPDATE APP_AUTODO_RESULT set app_userscore=? , device_id=? , user_agent=? ,earn=?,app_userid=? ,code_mine=?,note=?,charge_money=? where app_name= ? and app_usertel =?";

        try {
            // 执行插入数据操作,
            pstm = connection.prepareStatement(sqlStr);
            pstm.setInt(1, user.getScore());
            pstm.setString(2, user.getDeviceID());
            pstm.setString(3, user.getUser_agent());
            pstm.setInt(4, user.getEarn());
            pstm.setString(5, user.getCnuserID());
            pstm.setString(6, user.getCodeMine());
            if(user.getNote()==null){
                pstm.setString(7, user.getChargeTel());
            }else if(user.getNote().contains(user.getChargeTel())){
                pstm.setString(7, user.getNote());
            }else {
                pstm.setString(7, user.getNote()+","+user.getChargeTel());
            }
            pstm.setInt(8, user.getChargeMoney()+user.getChargeValue());
            pstm.setString(9, appName);
            pstm.setString(10, user.getTelephone());
           
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    
    /**
     * 更新 app薅羊毛数据，先查询有次记录没有 否则 插入
     * @param appName
     * @param user
     */
    public void updateAppData(String appName,cnUser user){
        connection = getConnection();
        String sqlStr = "select count(1) count from APP_AUTODO_RESULT where app_name =? and app_usertel = ? ";
        try {
            // 执行插入数据操作
            pstm = connection.prepareStatement(sqlStr);
            pstm.setString(1, appName);
            pstm.setString(2, user.getTelephone());
//            pstm.setString(3, appUserTel);
//            pstm.setString(4, appUserEmail);
//            pstm.setString(5, appUserPassword);
//            pstm.setString(6, appUserId);
            System.out.println(pstm.toString());
            rs = pstm.executeQuery();
            int count = 0;
            while (rs.next()){
                count =  rs.getInt("count");
            }
            if(count==0){
                AddData( appName, user);
            }else if(count!=0){
                updateCaiNiaoLiCaiData( appName, user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 向数据库中删除数据
     * @param stuName:根据姓名删除数据
     */
    public void DeleteData(String stuName) {
        connection = getConnection();
        String sqlStr = "delete from student where stu_name=?";
        System.out.println(stuName);
        try {
            // 执行删除数据操作
            pstm = connection.prepareStatement(sqlStr);
            pstm.setString(1, stuName);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 向数据库中修改数据
     * @param stuName:学生姓名,根据此值查询要修改的某行值
     * @param gender
     * @param age
     * @param address
     */
    public void UpdateData(String stuName, int gender, int age, String address) {
        connection = getConnection();
        String sql = "select id from student where 1 = 1 and stu_name = ?";
        String sqlStr = "update student set stu_name=?,gender=?,age=?,address=? where id=?";
        int count = 0;

        try {
            // 计算数据库student表中数据总数
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, stuName);
            rs = pstm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
                System.out.println(rs.getInt(1));
            }
            // 执行插入数据操作
            pstm = connection.prepareStatement(sqlStr);
            pstm.setString(1, stuName);
            pstm.setInt(2, gender);
            pstm.setInt(3, age);
            pstm.setString(4, address);
            pstm.setInt(5, count);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 更新充值记录表里的数据
     */
    public void UpdateChargeOrder(int id, String tel,String pass, int value) {
        connection = getConnection();
        String sqlStr = "update app_charge_order t set t.charged = t.charged+?, t.note=t.note||','||?,t.last_charge_account=?,t.last_charge_pass=?,t.last_charge_statu=0,t.last_charge_time=sysdate where t.id = ?";
        int count = 0;

        try {
            pstm = connection.prepareStatement(sqlStr);
            pstm.setInt(1, value);
            pstm.setString(2, tel);
            pstm.setString(3, tel);
            pstm.setString(4, pass);
            pstm.setInt(5, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 更新充值状态
     */
    public void UpdateChargeStatu(int id) {
        connection = getConnection();
        String sqlStr = "update app_charge_order t set t.last_charge_statu=1 where t.id = ?";
        int count = 0;

        try {
            pstm = connection.prepareStatement(sqlStr);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 向数据库中查询数据
     */
    public void SelectData() {
        connection = getConnection();
        String sql = "select * from student where 1 = 1";
        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("stu_name");
                String gender = rs.getString("gender");
                String age = rs.getString("age");
                String address = rs.getString("address");
                System.out.println(id + "\t" + name + "\t" + gender + "\t"
                        + age + "\t" + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 使用ResultSetMetaData计算列数
     */
    public void SelectData2() {
        connection = getConnection();
        String sql = "select * from employees where 1 = 1";
        int count = 0;

        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                count++;
            }

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols_len = rsmd.getColumnCount();

            System.out.println("count=" + count + "\tcols_len=" + cols_len);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    /**
     * 获取Connection对象
     *
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName(DRVIER);
            connection = DriverManager.getConnection(URL, USERNAMR, PASSWORD);
            System.out.println("成功连接数据库");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("class not find !", e);
        } catch (SQLException e) {
            throw new RuntimeException("get connection error!", e);
        }

        return connection;
    }

    /**
     * 释放资源
     */
    public void ReleaseResource() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    /**
     * 从数据库取现成的user
     */
    public List<cnUser> getCnUsers(){
    	List<cnUser> cnUsers = new ArrayList<cnUser>();
    	 connection = getConnection();
         String sql = "select * from app_autodo_result where is_del = 0 and app_name='菜鸟理财'";
         try {
             pstm = connection.prepareStatement(sql);
             rs = pstm.executeQuery();
             while (rs.next()) {
            	 cnUser user =  new cnUser();
            	 user.setUser_name(rs.getString("APP_USERNAME"));
            	 user.setTelephone(rs.getString("APP_USERTEL"));
            	 user.setCnuserID(rs.getString("APP_USERID"));
            	 user.setPassword(rs.getString("APP_USERPASSWORD"));
            	 if(rs.getString("DEVICE_ID")==""||rs.getString("DEVICE_ID")==null) {
            		 user.setDeviceID(Utils.randomHexString(16));
            	 }else {
            		 user.setDeviceID(rs.getString("DEVICE_ID"));
            	 }
            	 
            	 if(rs.getString("USER_AGENT")==""||rs.getString("USER_AGENT")==null) {
            		 Random random = new Random();
            	     int s = random.nextInt(Utils.user_agents.length);
            		 user.setUser_agent(Utils.user_agents[s]);
            	 }else {
            		 user.setUser_agent(rs.getString("USER_AGENT"));
            	 }
                 cnUsers.add(user);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             ReleaseResource();
         }
    	return cnUsers;
    }
    
    
    
    /**
     * 从数据库取出需要修改密码的user
     */
    public List<cnUser> getChangePwdUsers(int blankNum){
    	List<cnUser> cnUsers = new ArrayList<cnUser>();
    	 connection = getConnection();
         String sql = "select t1.*"+
        		 		" from (select rownum rn, a.* from APP_AUTODO_RESULT a order by id asc) t1,"+
        		 		" (select rownum rn, b.* from APP_AUTODO_RESULT b order by id asc) t2"+
        		 		" where t1.app_userpassword = t2.app_userpassword"+
        		 		" and abs(t1.app_userid - t2.app_userid) < ?"+
        		 		" and mod(t1.rn, 2) = 1"+
        		 		" and t1.rn = t2.rn - 1";
         try {
             pstm = connection.prepareStatement(sql);
             pstm.setInt(1, blankNum);
             System.out.println(sql);
             rs = pstm.executeQuery();
             while (rs.next()) {
            	 cnUser user =  new cnUser();
            	 user.setUser_name(rs.getString("APP_USERNAME"));
            	 user.setTelephone(rs.getString("APP_USERTEL"));
            	 user.setCnuserID(rs.getString("APP_USERID"));
            	 user.setPassword(rs.getString("APP_USERPASSWORD"));
            	 user.setRandomPwd(rs.getString("PASSWORD"));
            	 if(rs.getString("DEVICE_ID")==""||rs.getString("DEVICE_ID")==null) {
            		 user.setDeviceID(Utils.randomHexString(16));
            	 }else {
            		 user.setDeviceID(rs.getString("DEVICE_ID"));
            	 }
            	 
            	 if(rs.getString("USER_AGENT")==""||rs.getString("USER_AGENT")==null) {
            		 Random random = new Random();
            	     int s = random.nextInt(Utils.user_agents.length);
            		 user.setUser_agent(Utils.user_agents[s]);
            	 }else {
            		 user.setUser_agent(rs.getString("USER_AGENT"));
            	 }
                 cnUsers.add(user);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             ReleaseResource();
         }
    	return cnUsers;
    }
    
    
    /**
     * 更新菜鸟理财 app薅羊毛 密码
     *
     */
    public boolean updatePwd(cnUser user) {
    	Boolean flag = false;
        connection = getConnection();
        // String sql =
        // "insert into student values('1','王小军','1','17','北京市和平里七区30号楼7门102')";
//        String sql = "select count(*) from student where 1 = 1";
        String sqlStr = "UPDATE APP_AUTODO_RESULT set app_userpassword=? , password =? where app_name= '菜鸟理财' and app_usertel =?";

        try {
            // 执行插入数据操作,
            pstm = connection.prepareStatement(sqlStr);
            pstm.setString(1, user.getPassword());
            pstm.setString(2, user.getRandomPwd());
            pstm.setString(3, user.getTelephone());
           
            pstm.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            ReleaseResource();
        }
        return flag;
    }
    
}