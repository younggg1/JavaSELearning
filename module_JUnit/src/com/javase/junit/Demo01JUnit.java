package com.javase.junit;

import org.junit.Test;

public class Demo01JUnit {
    @Test
    public void add(){
        System.out.println("我是@Test执行的add方法");
    }

    @Test
    public void delete(){
        System.out.println("我是@Test执行的delete方法");
    }
}
