package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/11/20 9:48
 * @Created by Administrator
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "Hello SpringBoot Info 项目经理123456";

    }
    //开发人员写了一句话


































    @RequestMapping("test")
    public String test(){
        return "这是一次小测试开奖号库.........";
    }

}
