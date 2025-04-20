package com.javase.designpatterns.TemplateMethod;

public class Test01 {
    public static void main(String[] args) {
        QuanJuDe quanJuDe = new QuanJuDe();
        quanJuDe.eat();

        System.out.println("================");

        ZhangLiang zhangLiang = new ZhangLiang();
        zhangLiang.eat();
    }
}
