package com.javase.exception;

import java.io.FileNotFoundException;

//
//1.概述:代表的是不管是否触发了异常,都会执行的代码块
//特殊情况:如果之前执行了System.exit(0)终止当前正在执行的java虚拟机
//2.使用:都是配合try...catch使用
//  try{
//可能出现异常的代码
//  }catch(异常 对象名){
//处理异常的代码-> 将来开发会将异常信息保存到日志文件中
//  }finally{
//不管是否有异常,都会执行的代码
//  }
public class Demo09Exception {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method() {
        try {
            String s = null;
            System.out.println(s.length());//空指针异常
            return 2;
        } catch (Exception e) {
            return 1;
        } finally {
            System.out.println("我一定要执行");
            //return 3;
        }
    }
}