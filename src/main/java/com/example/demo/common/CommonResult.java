package com.example.demo.common;

import lombok.Data;

/**
 * @Auther DRevelation
 * @Date 2019-08-14 10:31
 * @Desc 接口返回通用类数据
 */
@Data
public final class CommonResult<T> {

    private int status = 1;
    private String errorCode = "";
    private String errorMsg = "";
    private T responseBody;

    public CommonResult() {}

    public CommonResult(T responseBody) {
        this.responseBody = responseBody;
    }

}
