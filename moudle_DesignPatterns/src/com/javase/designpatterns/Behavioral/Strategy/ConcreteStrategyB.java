package com.javase.designpatterns.Behavioral.Strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy B");
    }
}
