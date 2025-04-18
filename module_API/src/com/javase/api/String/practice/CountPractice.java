package com.javase.api.String.practice;
import java.util.Scanner;
/*键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
步骤:
1.创建Scanner对象,键盘录入
2.定义三个变量,用来统计
3.调用next方法录入一个字符串,遍历字符串,将每一个字符拿出来
4.统计大写字母
A-Z -> 65-90
比如:B -> 66 -> 在65-90之间,证明就是大写字母
5.统计小写字母
a-z -> 97-122
比如:b -> 98 -> 在97-122之间,证明就是小写字母
6.统计数字:
0-9 -> 48-57
比如:字符1 -> 49 -> 在48-57之间,证明就是数字
7.将统计结果打印出来*/
public class CountPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = 0;
        int small = 0;
        int number = 0;
        System.out.println("请您输入一个字符串:");
        String data = scanner.next();
        char[] chars = data.toCharArray();
        for (int i=0;i< chars.length;i++){
            char num = chars[i];
            //判断是否大写字母并统计
            if (num>='A'&&num<='Z'){
                big++;
            }
            //判断是否小写字母并统计
            if (num>='a'&&num<='z'){
                small++;
            }
            //判断是否数字并统计
            if (num>='0'&&num<='9'){
                number++;
            }
        }
        //7.将统计结果打印出来
        System.out.println("大写有"+big+"个");
        System.out.println("小写有"+small+"个");
        System.out.println("数字有"+number+"个");

    }

}
