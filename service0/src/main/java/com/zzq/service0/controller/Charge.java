package com.zzq.service0.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzq.service0.biz.AppAutoDoResultSecification;
import com.zzq.service0.biz.CnChargeFlow;
import com.zzq.service0.biz.CnChargeStatuFlow;
import com.zzq.service0.biz.CnRecommendFlow;
import com.zzq.service0.dto.AppAutoDoResultRepository;
import com.zzq.service0.entities.*;
import com.zzq.service0.service.AppResultService;
import com.zzq.service0.service.OrderService;
import com.zzq.service0.service.UserService;
import com.zzq.service0.util.OperateOracle;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
//    @Autowired
//    AppAutoDoResultRepository appAutoDoResultRepository;
    @Autowired
    AppResultService appResultService;
    @Autowired
    OrderService orderService;

    @GetMapping("/{id}/{tel}/{value}")
    public String getChageAccount( @PathVariable int id,@PathVariable String tel, @PathVariable int value){
        Map<String,String> result = new HashMap<>();
        try {
            AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
            cnUser cnUser = new cnUser();
//            List<AppAutoDoResult> list1 = appAutoDoResultRepository.findAll(new AppAutoDoResultSecification(tel,value));
//            if(list1.size()<=0){
//                list1 = appAutoDoResultRepository.findAll(new AppAutoDoResultSecification("",value));
//                appAutoDoResult = list1.get(0);
//
//            }else{
//                appAutoDoResult = list1.get(0);
//            }


//            cnUser.setTelephone(appAutoDoResult.getAPP_USERTEL());
//            cnUser.setPassword(appAutoDoResult.getAPP_USERPASSWORD());
//            cnUser.setDeviceID(appAutoDoResult.getDEVICE_ID());
//            cnUser.setCnuserID(appAutoDoResult.getAPP_USERID());
//            cnUser.setUser_agent(appAutoDoResult.getUSER_AGENT());
//            cnUser.setScore(appAutoDoResult.getAPP_USERSCORE());
//            cnUser.setNote(appAutoDoResult.getNOTE());
//            cnUser.setChargeMoney(appAutoDoResult.getCHARGE_MONEY());
//            cnUser.setChargeTel(tel);
//            cnUser.setChargeValue(value);

            AppResult appResult = appResultService.findOne(tel,value);

            cnUser.setTelephone(appResult.getAppUsertel());
            cnUser.setPassword(appResult.getAppUserpassword());
            cnUser.setDeviceID(appResult.getDeviceId());
            cnUser.setCnuserID(appResult.getAppUserid());
            cnUser.setUser_agent(appResult.getUserAgent());
            cnUser.setScore(appResult.getAppUserscore());
            cnUser.setNote(appResult.getNote());
            cnUser.setChargeMoney(appResult.getChargeMoney());
            cnUser.setChargeTel(tel);
            cnUser.setChargeValue(value);

            CnChargeFlow cnChargeFlow = new CnChargeFlow(tel,value);
            cnChargeFlow.autoDo(cnUser);
            System.out.println("充值成功更新订单");
            //更新充值订单
            //OperateOracle operateOracle = new OperateOracle();
            //operateOracle.UpdateChargeOrder(id,appResult.getAppUsertel(),appResult.getPassword(),value);
            orderService.updateOrder(id,appResult.getAppUsertel(),appResult.getPassword(),value);
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
    public Map<String,String> getChageAccount2(HttpServletRequest request){
        String param = request.getParameter("param");
        String sign = request.getParameter("sign");
        Map<String,String> result = new HashMap<>();
        result.put("param",param);
        result.put("sign",sign);
        String md5Sign = DigestUtils.md5Hex(param+"776829b92dd4da15f503fdc5011ae31b");

        System.out.println("返回sign=="+sign);
        System.out.println("加密sign=="+md5Sign);
        System.out.println("对比结果=="+sign.equals(md5Sign));
        return result;
    }
    @Value("${ip}")
    private String ip;
    @Value("${port}")
    private String port;
    @GetMapping("/test")
    public String test(HttpServletRequest request){
        return "成功了"+ ip + " : " + port;
    }
    @GetMapping("/statu/{id}/{tel}")
    public String queryChargeStatu(@PathVariable Integer id,@PathVariable String tel){
//        AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
//        appAutoDoResult.setAPP_USERTEL(tel);
//        appAutoDoResult.setAPP_NAME("菜鸟理财");
//        Example<AppAutoDoResult> example = Example.of(appAutoDoResult);
//        appAutoDoResult = appAutoDoResultRepository.findOne(example);
        AppResult appResult = appResultService.findOneByAccountTel(tel);

        cnUser cnUser = new cnUser();
        cnUser.setTelephone(appResult.getAppUsertel());
        cnUser.setPassword(appResult.getAppUserpassword());
        cnUser.setDeviceID(appResult.getDeviceId());
        cnUser.setCnuserID(appResult.getAppUserid());
        cnUser.setUser_agent(appResult.getUserAgent());
        cnUser.setScore(appResult.getAppUserscore());
        cnUser.setNote(appResult.getNote());
        cnUser.setChargeMoney(appResult.getChargeMoney());
        cnUser.setChargeTel(tel);
        CnChargeStatuFlow cnChargeStatuFlow = new CnChargeStatuFlow();
        Integer statu = cnChargeStatuFlow.autoDo(cnUser);
        if(statu==1){
            System.out.println("更改状态");
//            OperateOracle operateOracle = new OperateOracle();
//            operateOracle.UpdateChargeStatu(id);
            orderService.updateOrderChargeStatu(id);
        }
        Map<String,String> result = new HashMap<>();
        result.put("MSG","query and update charge statu successfully");
        return JSONObject.toJSONString(result);
    }
//    @GetMapping(value = "/recommend/{tel}/{code}/{yzm}",produces = "text/html;charset=utf-8")
//    public String recommend(@PathVariable String tel,@PathVariable String code,@PathVariable String yzm){
//        AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
//        appAutoDoResult.setAPP_USERTEL(tel);
//        appAutoDoResult.setAPP_NAME("菜鸟理财");
//        Example<AppAutoDoResult> example = Example.of(appAutoDoResult);
//        appAutoDoResult = appAutoDoResultRepository.findOne(example);
//
//        cnUser cnUser = new cnUser();
//        cnUser.setTelephone(appAutoDoResult.getAPP_USERTEL());
//        cnUser.setPassword(appAutoDoResult.getAPP_USERPASSWORD());
//        cnUser.setDeviceID(appAutoDoResult.getDEVICE_ID());
//        cnUser.setCnuserID(appAutoDoResult.getAPP_USERID());
//        cnUser.setUser_agent(appAutoDoResult.getUSER_AGENT());
//        cnUser.setScore(appAutoDoResult.getAPP_USERSCORE());
//        cnUser.setNote(appAutoDoResult.getNOTE());
//        cnUser.setChargeMoney(appAutoDoResult.getCHARGE_MONEY());
//        cnUser.setChargeTel(tel);
//
//        CnRecommendFlow cnRecommendFlow = new CnRecommendFlow();
//        String result = cnRecommendFlow.autoDo(cnUser,code,yzm);
//
//        return result;
//    }

    @RequestMapping(value = "/referer", method = RequestMethod.GET)
    public String login() {
//        logger.info("=====");
        return "referer";
    }
    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }
    @RequestMapping(method = RequestMethod.POST,value = "/list/｛statu｝")
    public JSONArray getList(@PathVariable String statu){
        JSONArray array = new JSONArray();

        return array;
    }

    @Autowired
    UserService userService;

    @RequestMapping(value = "/query/{id}")
    public User findByIdUser(@PathVariable("id") Integer id) {
        User us = userService.findUser(id);
        return us;
    }


    @RequestMapping(method = RequestMethod.GET,value = "/list/{statu}")
    public List<Order> getOrderByChargeStatu(@PathVariable Integer statu){
        return orderService.listOrder(statu);
    }

}
