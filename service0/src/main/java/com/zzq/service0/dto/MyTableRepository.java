//package com.zzq.service0.interface1;
//
//import com.zzq.service0.entities.ProcedureEntity;
//import feign.Param;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.query.Procedure;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Service;
//
//import java.sql.ResultSet;
//
///**
// * @author zhangzhiqiang
// * @date 2018-08-21 16:56
// * &Desc aa
// */
//@Service
//public interface MyTableRepository extends JpaRepository<ProcedureEntity,String>{
//    @Procedure(name = "get_result_account")
//    ResultSet getResultAccount(@Param("m_type")String m_type,@Param("m_flag")String m_flag);
//}
