package com.zhouwei.ucenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试类
 * @author zhouwei
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "index.html";
    }
}
