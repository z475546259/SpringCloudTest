//package com.zzq.service0.entity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.CallableStatementCallback;
//import org.springframework.jdbc.core.CallableStatementCreator;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Types;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author zhangzhiqiang
// * @date 2018-08-21 17:20
// * &Desc 数据库链接工具类
// */
//@Repository
//public class DBUtil {
//
//    @Autowired //注入数据库操作
//    private   JdbcTemplate jdbcTemplate;
//
//    public  List<String> doDeposit() {
//
//        CallableStatementCreator callableStatementCreator = new CallableStatementCreator() {
//            @Override
//            public CallableStatement createCallableStatement(Connection con) throws SQLException {
//                // 调用的sql
//                String storedProc = "{call DHGG_DATA.get_data(?,?,?)}";
//                CallableStatement cs = con.prepareCall(storedProc);
//                cs.setString(1, "get_result_account");
//                cs.setString(2, "15923584508|50");
//                // 注册输出参数 返回类型
//                cs.registerOutParameter(3, Types.REF_CURSOR);
////                cs.registerOutParameter(10,java.sql.Types.VARCHAR);// 注册输出参数 返回信息
//                return cs;
//            }
//        };
//
//        CallableStatementCallback callableStatementCallback =  new CallableStatementCallback() {
//            @Override
//            public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
//                List<String> result = new ArrayList<String>();
//                cs.execute();
//
//                result.add(cs.getString(9));
//                result.add(cs.getString(10));
//                return result;
//            }
//        };
//        List<String> resultList = (List<String>) jdbcTemplate.execute(callableStatementCreator,callableStatementCallback);
//
//
//        return resultList;
//
//    }
//
//}
