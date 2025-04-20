package com.javase.designpatterns.Creational.FactoryMethod;
// 具体工厂
public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
