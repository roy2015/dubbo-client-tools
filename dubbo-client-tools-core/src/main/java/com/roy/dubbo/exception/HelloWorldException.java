package com.roy.dubbo.exception;

/**
 * Created by apple on 2019/4/15.
 */
public class HelloWorldException extends RuntimeException {

    public HelloWorldException(String message) {
        super(message);
    }

    public HelloWorldException(Throwable cause) {
        super(cause);
    }

    public HelloWorldException(String message, Throwable cause) {
        super(message, cause);
    }
}
