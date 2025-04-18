package com.javase.api.String.String;
/*1.String()  -> 利用String的无参构造创建String对象
2.String(String original) -> 根据字符串创建String对象
3.String(char[] value) -> 根据char数组创建String对象
4.String(byte[] bytes) -> 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
a.平台:操作系统
b.操作系统默认字符集:GBK
GBK:一个中文占2个字节
UTF-8:一个中文占3个字节而且,中文对应的字节一般都是负数
代码在idea中写的,idea启动的时候,会自动加一个启动参数,此启动参数为UTF-8-Dfile.encoding=UTF-8
5.简化形式:
String 变量名 = ""*/
public class Demo02String {
    public static void main(String[] args) {
        //1.String()  -> 利用String的无参构造创建String对象
        String s1 = new String(); //
        System.out.println(s1);
        //2.String(String original) -> 根据字符串创建String对象
        String s2 = new String("abc");
        System.out.println(s2);
        //3.String(char[] value) -> 根据char数组创建String对象
        char[] chars = {'a','b','c'};
        String s3 = new String(chars);
        System.out.println(s3);
        /*
          4.String(byte[] bytes) -> 通过使用平台的默认字符集解码指定的 byte 数组，
                                    构造一个新的 String
         */
        byte[] bytes1 = {97,98,99};
        String s4 = new String(bytes1);
        System.out.println(s4);

        byte[] bytes2 = {-97,-98,-99};
        String s5 = new String(bytes2);
        System.out.println(s5);

        byte[] bytes3 = {-28,-67,-96};
        String s6 = new String(bytes3);
        System.out.println(s6);

        //5.简化形式
        String s7 = "abc";
        System.out.println(s7);
    }
}