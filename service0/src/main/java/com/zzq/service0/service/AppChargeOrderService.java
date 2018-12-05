package com.zzq.service0.service;

import com.zzq.service0.dto.AppChargeOrderDto;
import com.zzq.service0.entities.AppChargeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppChargeOrderService {
    @Autowired
    AppChargeOrderDto appChargeOrderDto;
    public List<AppChargeOrder> listOrder(int statu){
        return appChargeOrderDto.listOrder(statu);
    }
}
