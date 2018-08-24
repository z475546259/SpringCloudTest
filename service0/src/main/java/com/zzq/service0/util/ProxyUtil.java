package com.zzq.service0.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2018-08-22 17:39
 * &Desc 代理工具类
 */
public class ProxyUtil {

    public static HttpHost getHostFromAliYun() throws Exception {
        String ip;
        Integer port;
        String protocol;
        String host = "https://jisuproxy.market.alicloudapi.com";
        String path = "/proxy/get";
        String method = "GET";
        String appcode = "959e863987334d2899adea1eaad7443d";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", "中国");
//        querys.put("areaex", "areaex");
        querys.put("num", "1");
//        querys.put("port", "port");
//        querys.put("portex", "portex");
        querys.put("protocol", "HTTP");
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
//            System.out.println("--------"+response.toString());
            //获取response的body
            String jsonString = EntityUtils.toString(response.getEntity());
            System.out.println("获取代理请求返回==："+jsonString);
            JSONObject jsonObject = JSON.parseObject(jsonString);
            JSONObject singlePorxy = jsonObject.getJSONObject("result").getJSONArray("list").getJSONObject(0);
            ip = singlePorxy.getString("ip").split(":")[0];
            port = Integer.parseInt(singlePorxy.getString("ip").split(":")[1]);
            protocol = singlePorxy.getString("protocol");
            System.out.println("获取到的代理是："+ip+":"+port+protocol);
            return  new HttpHost(ip,port,protocol);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取代理出错：");
            throw e;
        }

    }

    public static HttpHost getHostFromDaiLiJingLing() throws Exception{
        HttpHost httpHost = null;
        HttpClient httpClient = null;
        String proxyStr = null;
        try {
            httpClient = new SSLClient();
            HttpGet httpGet = new HttpGet("http://ip.11jsq.com/index.php/api/entry?method=proxyServer.generate_api_url&packid=1&fa=0&fetch_key=&qty=1&time=1&pro=&city=&port=1&format=txt&ss=1&css=&dt=1&specialTxt=3&specialJson=");
            HttpResponse response;
            response = httpClient.execute(httpGet);

            if(response != null){
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){
                    proxyStr = EntityUtils.toString(resEntity,"utf-8");
                    System.out.println(proxyStr);
                    httpGet.releaseConnection();
                    String ip = proxyStr.split(":")[0];
                    String port = proxyStr.split(":")[1];
                    return  new HttpHost(ip,Integer.parseInt(port));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
        return httpHost;
    }


    public static void main(String[] args) {
        try {
            HttpHost httpHost = getHostFromDaiLiJingLing();
            System.out.println(httpHost.getAddress()+"```"+httpHost.getPort()+"````"+httpHost.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
