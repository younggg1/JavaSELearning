package com.javase.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/*@BeforeClass:在@Test之前执行,只执行一次,可以修饰静态方法
@AfterClass:@Test之后执行,只执行一次,可以修饰静态方法*/
public class Demo04Junit {
    @Test
    public void add(){

        System.out.println("我是@Test执行的add方法");
    }

    @Test
    public void delete(){

        System.out.println("我是@Test执行的delete方法");
    }


    @BeforeClass
    public static void methodBefore(){
        System.out.println("我是@Before执行的方法");
    }

    @AfterClass
    public static void methodAfter(){
        System.out.println("我是@After执行的方法");
    }

}