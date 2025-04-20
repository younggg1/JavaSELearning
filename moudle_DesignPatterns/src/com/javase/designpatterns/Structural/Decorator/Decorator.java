package com.javase.designpatterns.Structural.Decorator;

// 装饰器类
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}