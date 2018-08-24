package com.zzq.service0.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzq.service0.biz.AppAutoDoResultSecification;
import com.zzq.service0.biz.CnChargeFlow;
import com.zzq.service0.biz.CnChargeStatuFlow;
import com.zzq.service0.dto.AppAutoDoResultRepository;
import com.zzq.service0.entities.AppAutoDoResult;
import com.zzq.service0.entities.cnUser;
import com.zzq.service0.util.OperateOracle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2018-08-21 15:10
 * &Desc 充值
 */
@RestController
@RequestMapping("/charge")
public class Charge {
    @Autowired
    AppAutoDoResultRepository appAutoDoResultRepository;
    @GetMapping("/{id}/{tel}/{value}")
    public String getChageAccount( @PathVariable int id,@PathVariable String tel, @PathVariable int value){
        Map<String,String> result = new HashMap<>();
        try {
            AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
            cnUser cnUser = new cnUser();
            List<AppAutoDoResult> list1 = appAutoDoResultRepository.findAll(new AppAutoDoResultSecification(tel,value));
            if(list1.size()<=0){
                list1 = appAutoDoResultRepository.findAll(new AppAutoDoResultSecification("",value));
                appAutoDoResult = list1.get(0);

            }else{
                appAutoDoResult = list1.get(0);
            }

            cnUser.setTelephone(appAutoDoResult.getAPP_USERTEL());
            cnUser.setPassword(appAutoDoResult.getAPP_USERPASSWORD());
            cnUser.setDeviceID(appAutoDoResult.getDEVICE_ID());
            cnUser.setCnuserID(appAutoDoResult.getAPP_USERID());
            cnUser.setUser_agent(appAutoDoResult.getUSER_AGENT());
            cnUser.setScore(appAutoDoResult.getAPP_USERSCORE());
            cnUser.setNote(appAutoDoResult.getNOTE());
            cnUser.setChargeMoney(appAutoDoResult.getCHARGE_MONEY());
            cnUser.setChargeTel(tel);
            cnUser.setChargeValue(value);

            CnChargeFlow cnChargeFlow = new CnChargeFlow(tel,value);
            cnChargeFlow.autoDo(cnUser);

            //更新充值订单
            OperateOracle operateOracle = new OperateOracle();
            operateOracle.UpdateChargeOrder(id,appAutoDoResult.getAPP_USERTEL(),appAutoDoResult.getPASSWORD(),value);
        }catch (Exception e){
            result.put("MSG",tel+"== failure == "+value+" beacause:"+e.getMessage());
            return JSONObject.toJSONString(result);
        }


//        System.out.println(list1.size()+"====="+list1.get(0).toString());
//        AppAutoDoResult appAutoDoResult1 = list1.get(0);
//        appAutoDoResult1.setNOTE("更新操作");
//        AppAutoDoResult appAutoDoResult2 = appAutoDoResultRepository.save(appAutoDoResult1);
//        System.out.println("更新后的数据=="+appAutoDoResult2.getNOTE());
//        AppAutoDoResult appAutoDoResult3 = new AppAutoDoResult();
//        appAutoDoResult2.setNOTE("刚刚插入的数据");
//        appAutoDoResult3.setAPP_USERTEL("13333333333");
//        appAutoDoResult3 =appAutoDoResultRepository.save(appAutoDoResult3);
//        System.out.println("新增后的数据=="+appAutoDoResult2.getNOTE());

        result.put("MSG",tel+"== success == "+value);
        return JSONObject.toJSONString(result);
    }

    @PostMapping("/check")
    public String getChageAccount2(){
        return "== success == ";
    }
    @GetMapping("/statu/{id}/{tel}")
    public String queryChargeStatu(@PathVariable Integer id,@PathVariable String tel){
        AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
        appAutoDoResult.setAPP_USERTEL(tel);
        appAutoDoResult.setAPP_NAME("菜鸟理财");
        Example<AppAutoDoResult> example = Example.of(appAutoDoResult);
        appAutoDoResult = appAutoDoResultRepository.findOne(example);
        cnUser cnUser = new cnUser();
        cnUser.setTelephone(appAutoDoResult.getAPP_USERTEL());
        cnUser.setPassword(appAutoDoResult.getAPP_USERPASSWORD());
        cnUser.setDeviceID(appAutoDoResult.getDEVICE_ID());
        cnUser.setCnuserID(appAutoDoResult.getAPP_USERID());
        cnUser.setUser_agent(appAutoDoResult.getUSER_AGENT());
        cnUser.setScore(appAutoDoResult.getAPP_USERSCORE());
        cnUser.setNote(appAutoDoResult.getNOTE());
        cnUser.setChargeMoney(appAutoDoResult.getCHARGE_MONEY());
        cnUser.setChargeTel(tel);
        CnChargeStatuFlow cnChargeStatuFlow = new CnChargeStatuFlow();
        Integer statu = cnChargeStatuFlow.autoDo(cnUser);
        if(statu==1){
            OperateOracle operateOracle = new OperateOracle();
            operateOracle.UpdateChargeStatu(id);
        }
        Map<String,String> result = new HashMap<>();
        result.put("MSG","query and update charge statu successfully");
        return JSONObject.toJSONString(result);
    }
}
