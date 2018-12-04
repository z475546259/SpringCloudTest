package com.zzq.service0.impl;

import com.zzq.service0.dto.AppChargeOrderDto;
import com.zzq.service0.entities.AppChargeOrder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class AppChargeOrderImpl implements AppChargeOrderDto {
    @Resource
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<AppChargeOrder> listOrder(int statu) {
        // 1. 定义一个sql语句
        String querySQL = "select * from app_charge_order where last_charge_statu = ?";

        // 2. 定义一个RowMapper
        RowMapper<AppChargeOrder> rowMapper = new BeanPropertyRowMapper<AppChargeOrder>(AppChargeOrder.class);

        // 3. 执行查询方法

        //List<User> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));

        List<AppChargeOrder> orders = jdbcTemplate.query(querySQL, new Object[]{statu}, rowMapper);
        return orders;
    }

    @Override
    public void addOrder(AppChargeOrder order) {

    }

    @Override
    public void updateOrder(AppChargeOrder order) {

    }

    @Override
    public AppChargeOrder getOrderById(int orderId) {
        return null;
    }
}
