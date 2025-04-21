package com.javase.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*@Before:在@Test之前执行,有多少个@Test执行,@Before就执行多少次->都是用作初始化一些数据
@After:在@Test之后执行,有多少个@Test执行,@After就执行多少次-> 都是用作释放资源使用*/
public class Demo02Junit {
    @Test
    public void add(){

        System.out.println("我是@Test执行的add方法");
    }

    @Test
    public void delete(){

        System.out.println("我是@Test执行的delete方法");
    }


    @Before
    public void methodBefore(){
        System.out.println("我是@Before执行的方法");
    }

    @After
    public void methodAfter(){
        System.out.println("我是@After执行的方法");
    }

}
