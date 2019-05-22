package com.zhouwei.ucenter.enums;

/**
 * 响应码
 * @author zhouwei
 * @create 2019-04-15
 */
public enum ResponseCodeEnum {
    SUCCESS("200","SUCCESS");

    ResponseCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
