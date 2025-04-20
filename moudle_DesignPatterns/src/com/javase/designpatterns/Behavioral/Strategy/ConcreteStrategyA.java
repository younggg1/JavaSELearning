package com.javase.designpatterns.Behavioral.Strategy;
// 具体策略
public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy A");
    }
}
