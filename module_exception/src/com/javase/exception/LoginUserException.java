package com.javase.exception;
//1.定义一个类
//
//2.如果继承Exception 就是编译时期异常
//
//3.如果继承RuntimeException,就是运行时期异常
public class LoginUserException extends Exception{
    public LoginUserException() {

    }

    public LoginUserException(String message) {
        super(message);
    }
}
