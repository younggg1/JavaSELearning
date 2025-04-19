package com.javase.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
//1.格式:throws 异常1,异常2
//2.注意:
//如果throws的多个异常之间有子父类继承关系,我们可以直接throws父类异常
//如果不知道多个异常之间是否有子父类继承关系,我们可以直接throws Exception
public class Demo5Exception {
    public static void main(String[] args)throws /*FileNotFoundException,*//*IOException*/Exception {
        String s = null;
        add(s);//添加功能
        delete();//删除功能
        update();//修改功能
        find();//查询功能
    }


    private static void add(String s)throws /*FileNotFoundException,*//*IOException*/Exception {
        if (s==null){
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