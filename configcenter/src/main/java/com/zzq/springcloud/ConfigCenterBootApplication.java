package com.zzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigCenterBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterBootApplication.class, args);
    }
}