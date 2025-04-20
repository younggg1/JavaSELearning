package com.javase.designpatterns.Creational.FactoryMethod;

// 具体产品
public class ConcreteProductA implements Product {
    @Override
    public void performTask() {
        System.out.println("Product A performing task");
    }
}
