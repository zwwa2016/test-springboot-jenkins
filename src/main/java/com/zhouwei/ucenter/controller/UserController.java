package com.zhouwei.ucenter.controller;


import com.zhouwei.ucenter.vo.request.RegisterRequest;
import com.zhouwei.ucenter.vo.response.RegisterResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 对用户的操作
 */
@Controller
public class UserController {

    /**
     * 注册用户
     * @param request
     * @return
     */
    @RequestMapping("/register")
    public RegisterResponse register(RegisterRequest request){
        return new RegisterResponse();
    }
}
