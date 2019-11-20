package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/20 0020.
 */

@RestController
public class UserController {

    @RequestMapping("user/login")
    public String login(){
        return "congratulations";
    }




    //黄庆超  前来修改
    //潘舒华
}
