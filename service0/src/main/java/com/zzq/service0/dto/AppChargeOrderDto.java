package com.zzq.service0.dto;

import com.zzq.service0.entities.AppChargeOrder;

import java.util.List;

public interface AppChargeOrderDto {
    List<AppChargeOrder> listOrder(int statu);
    void addOrder(AppChargeOrder order);
    void updateOrder(AppChargeOrder order);
    AppChargeOrder getOrderById(int orderId);
}
