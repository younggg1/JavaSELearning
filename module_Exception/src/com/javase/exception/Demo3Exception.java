package com.javase.exception;

public class Demo3Exception {
    public static void main(String[] args) {
        String s = "a.tx1t";
        method(s);
    }
    public static void method(String s){
        if (!s.endsWith(".txt")){//判断文件名是否以.txt结尾
            //故意创建异常对象,用throw说明此处有异常
            throw new NullPointerException();
        }
        System.out.println("我要执行了");
    }
}
