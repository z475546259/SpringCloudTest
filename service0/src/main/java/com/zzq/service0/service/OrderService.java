package com.zzq.service0.service;


import com.zzq.service0.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> listOrder(Integer staut);
    void updateOrder(Integer id,String chargeTel,String password,Integer value);
    void updateOrderChargeStatu(Integer id);
}
