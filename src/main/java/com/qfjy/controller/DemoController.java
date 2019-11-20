package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/20 0020.
 */

@RestController
public class DemoController {

    @RequestMapping("demo")
    public String demo(){
        return "demo";
    }





}
