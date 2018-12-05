package com.zzq.service0.impl;

import com.zzq.service0.entities.Order;
import com.zzq.service0.entities.OrderExample;
import com.zzq.service0.mapper.OrderMapper;
import com.zzq.service0.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andLastchargestatuEqualTo(staut);
        List<Order> orders =orderMapper.selectByExample(orderExample);
        return orders;
    }
}
