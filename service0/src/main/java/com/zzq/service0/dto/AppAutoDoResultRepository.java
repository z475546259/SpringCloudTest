package com.zzq.service0.dto;

import com.zzq.service0.entities.AppAutoDoResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author zhangzhiqiang
 * @date 2018-08-22 11:26
 * &Desc 自动刷分结果 接口
 */
//@Repository
//public interface AppAutoDoResultRepository extends JpaRepository<AppAutoDoResult,Long> {
public interface AppAutoDoResultRepository extends JpaSpecificationExecutor<AppAutoDoResult>,JpaRepository<AppAutoDoResult,Long>{

}
