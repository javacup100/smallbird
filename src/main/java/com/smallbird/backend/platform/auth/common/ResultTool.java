package com.smallbird.backend.platform.auth.common;

public class ResultTool {
    public static ResponseResult success() {
        return new ResponseResult(true);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult(true, data);
    }

    public static ResponseResult fail() {
        return new ResponseResult(false);
    }

    public static ResponseResult fail(ResultCode resultEnum) {
        return new ResponseResult(false, resultEnum);
    }
}
