package com.zzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @ClassName: RegisterApplication
* @Description: TODO 注册中心，服务发现和注册
* @author 徐文海 xuwenhai@zbj.com
* @date 2018年8月9日 下午5:50:30
* 
*/
@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }
}
