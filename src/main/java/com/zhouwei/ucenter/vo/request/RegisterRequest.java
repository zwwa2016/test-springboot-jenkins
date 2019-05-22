package com.zhouwei.ucenter.vo.request;

import java.io.Serializable;

/**
 * 注册用户的请求
 * @author zhouwei
 * @create 2019-04-15
 */
public class RegisterRequest implements Serializable {
    /**
     * 用户名
     */
    public String userName;
    /**
     * 手机号
     */
    public String mobile;
    /**
     * 密码
     */
    public String password;
    /**
     * 年龄
     */
    private Integer age;
}
