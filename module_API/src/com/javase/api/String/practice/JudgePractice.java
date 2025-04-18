package com.javase.api.String.practice;

import java.util.Scanner;
/*已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录成功与否，给出相应的提示
步骤:
1.先定义两个字符串,表示注册过的用户名和密码
2.创建Scanner对象,键盘录入用户名和密码
3.比较,如果输入的用户名和密码跟已经注册过的用户名和密码内容一样,就登录成功,否则就登录失败*/
public class JudgePractice {
    public static void main(String[] args) {
        String username = "root";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请您输入用户名:");
            String name = scanner.next();
            System.out.println("请您输入密码:");
            String pwd = scanner.next();
            if(name.equals(username)&&pwd.equals(password)){
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号冻结");
                } else {
                    System.out.println("登录失败!您还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
