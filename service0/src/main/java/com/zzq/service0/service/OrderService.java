package com.zzq.service0.service;


import com.zzq.service0.entities.Order;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    List<Order> listOrder(Integer staut);
    void updateOrder(Integer id,String chargeTel,String password,Integer value);
    void updateOrderChargeStatu(Integer id);
    Boolean addOrder(String tel, BigDecimal recharge, BigDecimal discount,String referer);
    Boolean updateOrderReceive(BigDecimal orderId, BigDecimal receive);
}
