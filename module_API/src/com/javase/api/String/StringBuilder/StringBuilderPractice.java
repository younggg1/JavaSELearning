package com.javase.api.String.StringBuilder;

import java.util.Scanner;

/*练习:键盘录入一个字符串,判断此字符串是否为"回文内容"
比如: abcba  上海自来水来自海上*/
public class StringBuilderPractice {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串:");
        String data = sc.next();
        //2.创建StringBuilder对象
        StringBuilder sb = new StringBuilder(data);
        //3.翻转
        sb.reverse();
        //4.将StringBuilder转成String
        String s = sb.toString();
        if (data.equals(s)){
            System.out.println("是回文内容");
        }else{
            System.out.println("不是回文内容");
        }

    }

}
