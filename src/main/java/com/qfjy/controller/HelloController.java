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
        //这是肖韩写的话
        return "Hello SpringBoot Info 项目经理123456";
    }
    //开发人员写了一句话
    //蔡敏捷，啦啦啦
    //黎敏川.......
    //介文娟
    //张帅帅
    //张刚
    //贺兵兵
    //肖韩
    //窦刘柱
    //赵孟洋
    //下面的别删了
    //钱行玉
    //梁栋
    //米莱迪
    //吴维
    //章志勇
    //孙晨
    //许亮
    //靳旺仔
    //宋文成
    //////

}
