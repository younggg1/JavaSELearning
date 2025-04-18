package com.javase.api.String.practice;

public class FetchPractice {
    //遍历字符串
    public static void main(String[] args) {
        String s = "abcdefg";
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));//根据索引获取对应的字符
        }
    }
}
