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
import java.math.BigDecimal;
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
    AppResultService appResultService;
    @Autowired
    OrderService orderService;

    @GetMapping("/{id}/{tel}/{value}")
    public String getChageAccount( @PathVariable int id,@PathVariable String tel, @PathVariable int value){
        Map<String,String> result = new HashMap<>();
        try {
            AppAutoDoResult appAutoDoResult = new AppAutoDoResult();
            cnUser cnUser = new cnUser();

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
            cnUser user = cnChargeFlow.autoDo(cnUser);
            appResultService.updateResult(user);
            System.out.println("充值成功更新订单");
            //更新充值订单
            //OperateOracle operateOracle = new OperateOracle();
            //operateOracle.UpdateChargeOrder(id,appResult.getAppUsertel(),appResult.getPassword(),value);
            orderService.updateOrder(id,appResult.getAppUsertel(),appResult.getPassword(),value);
        }catch (Exception e){
            result.put("MSG",tel+"== failure == "+value+" beacause:"+e.getMessage());
            return JSONObject.toJSONString(result);
        }
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

    @RequestMapping(method = RequestMethod.POST,value = "/addOrder")
    public Map<String,String> addOder(@RequestParam String tel, @RequestParam BigDecimal recharge, @RequestParam BigDecimal discount, @RequestParam String referrer){
        Boolean result = orderService.addOrder(tel,recharge,discount,referrer);
        String retString;
        Map<String,String> ret = new HashMap<>();
        if(result){
            ret.put("msg","新建订单成功");
        }else{
            ret.put("msg","新建订单失败");
        }
        return ret;
    }
    @RequestMapping(method = RequestMethod.POST,value = "/updateReceive")
    public Map<String,String>  updateReceive(@RequestParam BigDecimal orderId, @RequestParam BigDecimal receive){
        Map<String,String> ret = new HashMap<>();
        if(orderService.updateOrderReceive(orderId,receive)){
            ret.put("msg","更新收款成功");
        }else{
            ret.put("msg","更新收款失败");
        }
        return ret;
    }
}
