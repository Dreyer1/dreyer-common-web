
package com.dreyer.common.web.result;

/**
 * @author Dreyer
 * @date 2015年8月31日 下午11:58:29
 * @description API统一返回的code码与msg提示信息
 */
public enum ApiResultCodeMsg {
    SUCCESSFUL(0, "成功"),
    FAIL(-1, "失败"),
    SYSTEM_ERROR(-2, "系统内部错误"),
    BAD_PARAMETER(-3, "请求参数错误");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ApiResultCodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
