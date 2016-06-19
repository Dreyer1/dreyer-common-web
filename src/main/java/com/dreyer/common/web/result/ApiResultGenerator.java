
package com.dreyer.common.web.result;

/**
 * @author Dreyer
 * @date 2015年8月31日 下午11:59:02
 * @description 常用的生成ApiResult工具方法
 */
public class ApiResultGenerator {
    /**
     * 返回成功信息
     *
     * @param data 操作成功返回的数据
     * @return
     */
    public static ApiResult success(Object data) {
        return generate(ApiResultCodeMsg.SUCCESSFUL.getCode(),
                ApiResultCodeMsg.SUCCESSFUL.getMsg(), data);
    }

    /**
     * 返回成功信息
     *
     * @param data 操作成功返回的数据
     * @return
     */
    public static ApiResult success(Object data, String msg) {
        return generate(ApiResultCodeMsg.SUCCESSFUL.getCode(),
                msg, data);
    }

    /**
     * 请求参数错误(系统默认提示)
     *
     * @return
     */
    public static ApiResult badParameter() {
        return generate(ApiResultCodeMsg.BAD_PARAMETER.getCode(),
                ApiResultCodeMsg.BAD_PARAMETER.getMsg());
    }

    /**
     * 请求参数错误(可自定义提示信息)
     *
     * @param msg 自定义的提示信息
     * @return
     */
    public static ApiResult badParameter(String msg) {
        return generate(ApiResultCodeMsg.BAD_PARAMETER.getCode(),
                msg);
    }

    /**
     * 请求操作失败
     *
     * @param msg 失败原因
     * @return
     */
    public static ApiResult fail(String msg) {
        return generate(ApiResultCodeMsg.FAIL.getCode(),
                msg);
    }

    /**
     * 系统内部异常
     *
     * @param throwable 接受一个异常类
     * @return
     */
    public static ApiResult error(Throwable throwable) {
        return generate(ApiResultCodeMsg.SYSTEM_ERROR.getCode(), throwable.getMessage());
    }

    /**
     * 系统内部错误(自定义异常信息)
     *
     * @param errMsg 自定义的异常提示信息
     * @return
     */
    public static ApiResult error(String errMsg) {
        return generate(ApiResultCodeMsg.SYSTEM_ERROR.getCode(), errMsg);
    }

    /**
     * 构造Result对象
     *
     * @param code
     * @param msg
     * @return
     */
    public static ApiResult generate(int code, String msg) {
        return generate(code, msg, null);
    }

    /**
     * 构造Result对象
     *
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static ApiResult generate(int code, String msg, Object data) {
        return new ApiResult(code, msg, data);
    }

}
