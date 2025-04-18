package com.javase.exception;

import java.io.FileNotFoundException;

//1.格式:在方法参数和方法体之间位置上写
//  throws 异常
//2.意义:处理异常
//  将异常往上抛
public class Demo4Exception {
    public static void main(String[] args) throws FileNotFoundException{
        String s = "a.txt1";
        add(s);//增加功能，接到异常
        delete(s);//删除功能
        update(s);//升级功能
        find(s);//查找功能
    }
    public static void add(String s) throws FileNotFoundException{
        if (!s.endsWith(".txt")) {
            //故意创建异常
            //编译时期异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }
    public static void delete(String s) {
        System.out.println("删除功能");
    }
    public static void update(String s) {
        System.out.println("升级功能");
    }
    public static void find(String s) {
        System.out.println("查找功能");
    }
}
