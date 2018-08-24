package com.zzq.service0.controller;

import com.zzq.service0.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2018-08-21 12:34
 * &Desc 测试获取ip代理
 */
public class TestGetProxy {

    public static void main(String[] args) {
        String host = "https://jisuproxy.market.alicloudapi.com";
        String path = "/proxy/get";
        String method = "GET";
        String appcode = "959e863987334d2899adea1eaad7443d";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
//        querys.put("area", "area");
//        querys.put("areaex", "areaex");
        querys.put("num", "1");
//        querys.put("port", "port");
//        querys.put("portex", "portex");
        querys.put("protocol", "http");
        querys.put("type", "1");


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println("--------"+response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
