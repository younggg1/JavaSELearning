package com.javase.designpatterns.Structural.Decorator;

// 具体装饰器
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        additionalFunction();
    }

    private void additionalFunction() {
        System.out.println("Additional functionality from ConcreteDecoratorA");
    }
}
