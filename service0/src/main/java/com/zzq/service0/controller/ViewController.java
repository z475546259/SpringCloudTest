package com.zzq.service0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deng on 2017/12/24.
 */
@Controller
public class ViewController {
    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }
    @RequestMapping(value = "/referer")
    public String getReferer() {
        return "referer";
    }
    @RequestMapping(value = "/reCharge")
    public String getRecharge() {
        return "reCharge";
    }
}