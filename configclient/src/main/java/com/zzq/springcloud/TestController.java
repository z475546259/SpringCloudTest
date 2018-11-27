package com.zzq.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

//    @Autowired
//    RestTemplate restTemplate;

    @RequestMapping("/hi")
//    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hi(@RequestParam String id){
//        return restTemplate.getForObject("http://service-a/hi?id="+id, String.class);
        return "http://service-a/hi?id="+id;
    }

    public String hiFallback(String id) {
        return "hi, " + id + ", error!";
    }

    @Value("${ip}")
    private String ip;
    @Value("${port}")
    private String port;

    @RequestMapping("/getProperties")
    public String getProperties(){
        return ip + " : " + port;
    }
}