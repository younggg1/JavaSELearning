package com.javase.jdknew.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
//        1. 第一个队伍只要名字为3个字的成员姓名；//filter
        ArrayList<String> one  = new ArrayList<>();
        one.add("张无忌");
        one.add("段誉");
        one.add("赵敏");
        one.add("周芷若");
        one.add("小昭");
        one.add("赵高");
        one.add("周东");
        one.add("小龙女");

//        2. 第一个队伍筛选之后只要前3个人；//limit
        //将集合变成Stream流
        Stream<String> team1 = one.stream();
        Stream<String> listA = team1.filter(s -> s.length() == 3).limit(3);
        System.out.println(listA);



        ArrayList<String> two  = new ArrayList<>();
        two.add("张无忌0");
        two.add("张无忌1");
        two.add("张无忌2");
        two.add("张无忌3");
        two.add("张无忌4");
        two.add("张无忌5");
        two.add("张无忌6");
        two.add("张无忌7");
        //将集合变成Stream流
        Stream<String> team2 = two.stream();
        //        3. 第二个队伍只要姓张的成员姓名；//filter
        //        4. 第二个队伍筛选之后不要前2个人；//skip
        Stream<String> listB = team2.filter(s -> s.startsWith("张")).skip(2);
        System.out.println(listB);


//        5. 将两个队伍合并为一个队伍；//concat
//        6. 打印整个队伍的姓名信息。//forEeach
        Stream.concat(team1.filter(s -> s.length() == 3).limit(3),team2.filter(s -> s.startsWith("张")).skip(2)).forEach(s -> System.out.println(s));
    }
}
