package com.imooc.exception;

/**
 * Created by XuQin on 2018/7/11.
 */
public class RateLimitException extends RuntimeException {
    private Integer code;

    public RateLimitException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public RateLimitException(String message){
        super(message);
    }
}
