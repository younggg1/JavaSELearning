package com.javase.api.String.String;

public class Demo05String {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello"+"world";
        String s5 = s1+"world";
        String s6 = s1+s2;
/*        1.字符串拼接,如果等号右边是字符串字面值拼接,不会产生新对象
        2.字符串拼接,如果等号右边有变量参数拼接,会产生新字符串对象*/
        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
    }
}
