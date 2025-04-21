package com.javase.enum_test;
public class Test01 {
    public static void main(String[] args) {
        State weifahuo = State.WEIFAHUO;
        System.out.println(weifahuo);//默认调用toString

        State yifukuan = State.YIFUKUAN;
        System.out.println(yifukuan.getName());

        System.out.println("====================");

        String string = State.WEIFUKUAN.toString();
        System.out.println("string = " + string);

        System.out.println("===================");
        State[] values = State.values();
        for (State value : values) {
            System.out.println(value);
        }

        System.out.println("==================");

        State yifahuo = State.valueOf("YIFAHUO");
        System.out.println("yifahuo = " + yifahuo);
    }
}