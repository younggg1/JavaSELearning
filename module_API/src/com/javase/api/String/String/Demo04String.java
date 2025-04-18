package com.javase.api.String.String;

public class Demo04String {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
    }
   /* 问1:String s = new String("abc")共有几个对象? 2个
    一个new本身   一个是"abc"

    问2:String s = new String("abc")共创建了几个对象?  1个或者2个
    就看abc有没有提前创建出来了*/
}
