package com.zzq.service0.mapper;

import java.util.List;

import com.zzq.service0.entities.Order;
import com.zzq.service0.entities.OrderExample;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExampleWithBLOBs(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExampleWithBLOBs(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
    int updateReceive(@Param("record") Order record);
}