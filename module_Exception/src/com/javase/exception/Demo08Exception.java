package com.javase.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Demo08Exception {
    public static void main(String[] args){
        String s = "a.txt";
        try {
            add(s);//添加功能
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("我必须滴执行");
        }
    }


    private static void add(String s)throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }
}