package com.feige.aliyun_pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lyf
 * @create 2022 03-09 17:16
 */
@Controller
public class PayController {

    @RequestMapping("/pay")
    public String getPay(){
        return "index";
    }
}
