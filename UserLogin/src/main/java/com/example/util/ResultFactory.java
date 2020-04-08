package com.example.util;

/**
 * 结果处理
 * @author sweet
 */
public class ResultFactory {

    public static Result successResult(Object data) {
        return buildResult(200, "成功", data);
    }

    public static Result failResult(Object data) {
        return buildResult(400, "失败", data);
    }

    public static Result buildResult(int resultCode, String message, Object data) {
        return new Result(resultCode, message, data);
    }
}
