package com.zzq.service0.impl;

import com.zzq.service0.entities.Order;
import com.zzq.service0.entities.OrderExample;
import com.zzq.service0.mapper.OrderMapper;
import com.zzq.service0.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author zhangzhiqiang
 * @date 2018-12-05 20:34
 * &Desc 订单服务实现类
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> listOrder(Integer staut) {
        List<Order> orders = new ArrayList<>();
        OrderExample orderExample = new OrderExample();
        if(staut==1){//全部
            orderExample.setOrderByClause("id desc");
            orders =orderMapper.selectByExample(orderExample);
        }else if(staut==5){//处理中
            orderExample.setOrderByClause("id desc");
            orderExample.createCriteria().andLastChargeStatuEqualTo(new BigDecimal(0)).andUpdateTimeIsNotNull();
            orders =orderMapper.selectByExample(orderExample);
        }else if(staut==2){//待充值
            TimeZone curTimeZone = TimeZone.getTimeZone("GMT+8");
            Calendar c = Calendar.getInstance(curTimeZone);
//            c.setTime(d);
            c.set(Calendar.HOUR_OF_DAY, 0);
            c.set(Calendar.MINUTE, 0);
            c.set(Calendar.SECOND, 0);
            Date z = c.getTime();
            orderExample.createCriteria().andLastchargetimeLessThan(z);
            orderExample.or(orderExample.createCriteria().andLastchargetimeIsNull());
            List<Order> orders2 =orderMapper.selectByExample(orderExample);//查询出所有最后充值时间为空或者充值时间小于今天的订单
            //遍历找出 已充值金额小于充值金额的订单
            for (Order order:orders2) {
                if(order.getCharged().doubleValue()<order.getRecharge().doubleValue()){
                    orders.add(order);
                }
            }
        }else if(staut==3){//待付款
            List<Order> orders2 =orderMapper.selectByExample(orderExample);
            //遍历找出 已付款小于打折后的订单金额
            for (Order order:orders2) {
                if(order.getReceive().doubleValue()<order.getRecharge().doubleValue()*order.getDiscount().doubleValue()){
                    orders.add(order);
                }
            }
        }

       // orderExample.createCriteria().andLastchargestatuEqualTo(staut);

        return orders;
    }

    @Override
    public void updateOrder(Integer id, String chargeTel, String password, Integer value) {
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andIdEqualTo(new BigDecimal(id));
        Order order = orderMapper.selectByExample(orderExample).get(0);
        order.setCharged(order.getCharged().add(new BigDecimal(value)));
        order.setNote(order.getNote()+","+chargeTel);
        order.setLastChargeAccount(chargeTel);
        order.setLastChargePass(password);
        order.setLastChargeStatu(new BigDecimal(0));
        order.setUpdateTime(new Date());
        order.setLastChargeTime(new Date());
        int i =orderMapper.updateByExample(order,orderExample);
        if(i==0){
            System.out.println("更新充值订单失败");
        }else {
            System.out.println("更新充值订单成功");
        }
    }

    @Override
    public void updateOrderChargeStatu(Integer id) {
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andIdEqualTo(new BigDecimal(id));
        Order order = orderMapper.selectByExample(orderExample).get(0);
        order.setLastChargeStatu(new BigDecimal(1));
        order.setUpdateTime(new Date());
        int i =orderMapper.updateByExample(order,orderExample);
        if(i==0){
            System.out.println("更新充值订单失败");
        }else {
            System.out.println("更新充值订单成功");
        }
    }

    @Override
    public Boolean addOrder(String tel, BigDecimal recharge, BigDecimal discount, String referer) {
        Order order = new Order();
        order.setTel(tel);
        order.setRecharge(recharge);
        order.setDiscount(discount);
        order.setReferrer(referer);
        order.setLastchargestatu(0);
        order.setCharged(new BigDecimal(0));
        order.setReceive(new BigDecimal(0));
        int i = orderMapper.insert(order);
        return i==1?true:false;
    }

    @Override
    public Boolean updateOrderReceive(BigDecimal orderId, BigDecimal receive) {
        Order order = new Order();
        order.setId(orderId);
        order.setReceive(receive);
        int i = orderMapper.updateReceive(order);
        return i==i?true:false;
    }
}
