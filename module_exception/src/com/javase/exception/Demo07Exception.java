package com.javase.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

//1.格式:
//        try{
//可能出现异常的代码
//  }catch(异常 对象名){
//处理异常的代码-> 将来开发会将异常信息保存到日志文件中
//  }catch(异常 对象名){
//处理异常的代码-> 将来开发会将异常信息保存到日志文件中
//  }catch(异常 对象名){
//处理异常的代码-> 将来开发会将异常信息保存到日志文件中
//  }catch(异常 对象名){
//处理异常的代码-> 将来开发会将异常信息保存到日志文件中
//  }...
//
// 2.注意:
//如果catch的多个异常之间有子父类继承关系,我们可以直接catch父类异常
//如果不知道多个异常之间是否有子父类继承关系,我们也可以直接catch Exception
public class Demo07Exception {
    public static void main(String[] args) {
        String s = null;
       /* try {
            add(s);//添加功能
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }*/

        /*try {
            add(s);//添加功能
        }catch (IOException e){
            System.out.println(e);
        }*/

        try {
            add(s);//添加功能
        }catch (Exception e){
            e.printStackTrace();//将详细的异常信息打印到控制台上
        }
        delete();//删除功能
        update();//修改功能
        find();//查询功能
    }


    private static void add(String s) throws FileNotFoundException, IOException {
        if (s == null) {
            //故意造异常
            throw new IOException("IO异常");
        }
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }

    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("修改功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }

}
