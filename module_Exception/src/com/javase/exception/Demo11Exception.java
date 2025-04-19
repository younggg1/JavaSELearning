package com.javase.exception;

import java.util.Scanner;
//Throwable类中的方法:
//String toString()  :输出异常类型和设置的异常信息
//String getMessage(): 输出设置的异常信息
//void printStackTrace():打印异常信息是最全的:包括异常类型,信息,以及出现的行数等
public class Demo11Exception {
    public static void main(String[] args) {
        //1.定义一个用户名,代表已经注册的用户
        String username = "root";
        //2.创建Scanner对象,录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入要登录的用户名:");
        String name = sc.next();
        //3.判断用户名是否和已经存在的用户名一致
        if (name.equals(username)) {
            System.out.println("登录成功了");
        } else {
            try {
                throw new LoginUserException("登录失败了,用户名或者密码有问题");
            }catch (Exception e){
                //System.out.println(e.toString());
                //System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
