package com.zzq.service0;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
* @ClassName: Service0Application
* @Description: TODO 业务服务0
* @author 徐文海 xuwenhai@zbj.com
* @date 2018年8月9日 下午5:51:29
* 
*/
//@SpringBootApplication(scanBasePackages = "com.zzq.service0",exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.zzq.service0")
//@EnableEurekaClient
//@EnableWebMvc
@MapperScan("com.zzq.service0.mapper")
public class Service0Application {

    public static void main(String[] args) {
        SpringApplication.run(Service0Application.class, args);
    }
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
