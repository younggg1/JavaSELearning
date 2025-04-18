package com.javase.api.Wrapper;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);  // 使用 valueOf() 代替构造器
        System.out.println("i1 = " + i1);

        Integer i2 = Integer.valueOf("10");  // 使用 valueOf() 代替构造器
        System.out.println("i2 = " + i2);

        System.out.println("================");

        Boolean b1 = Boolean.valueOf("true");  // 使用 valueOf() 代替构造器
        System.out.println("b1 = " + b1);

        Boolean b2 = Boolean.valueOf("false");  // 使用 valueOf() 代替构造器
        System.out.println("b2 = " + b2);

        Boolean b3 = Boolean.valueOf("True");  // 使用 valueOf() 代替构造器
        System.out.println("b3 = " + b3);
    }

    //装箱
    public void Boxing(){
        //装箱
        Integer i1 = Integer.valueOf(10);
        System.out.println("i1 = " + i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println("i2 = " + i2);
    }
    //拆箱
    public void Unboxing(){
        Integer i1 = Integer.valueOf(10);
        int i2 = i1.intValue();//拆箱
        System.out.println("i2 = " + i2);
    }
    //自动拆装
    public void AutoUnboxing(){
        Integer i = 10;//发生了自动装箱了
        Integer sum = i+10;//发生了自动拆箱装箱
        System.out.println("sum = " + sum);
    }
}
