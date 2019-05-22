package com.zhouwei.ucenter.vo.response;

import com.zhouwei.ucenter.enums.ResponseCodeEnum;

/**
 * 注册用户的响应
 * @author zhouwei
 * @create 2019-04-15
 */
public class RegisterResponse extends Response {
    public RegisterResponse() {
        this.code = ResponseCodeEnum.SUCCESS.getCode();
        this.msg = ResponseCodeEnum.SUCCESS.getDesc();
    }

    public RegisterResponse(ResponseCodeEnum responseCodeEnum) {
        this.code = responseCodeEnum.getCode();
        this.msg = responseCodeEnum.getDesc();
    }
}
