package com.zzq.service0.mapper;

import java.util.List;

import com.zzq.service0.entities.AppResult;
import com.zzq.service0.entities.AppResultExample;
import org.apache.ibatis.annotations.Param;

public interface AppResultMapper {
    long countByExample(AppResultExample example);

    int deleteByExample(AppResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppResult record);

    int insertSelective(AppResult record);

    List<AppResult> selectByExample(AppResultExample example);

    AppResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppResult record, @Param("example") AppResultExample example);

    int updateByExample(@Param("record") AppResult record, @Param("example") AppResultExample example);

    int updateByPrimaryKeySelective(AppResult record);

    int updateByPrimaryKey(AppResult record);
}