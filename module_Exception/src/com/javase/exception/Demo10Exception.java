package com.javase.exception;

//1.如果父类中的方法抛了异常,那么子类重写之后要不要抛?
//可抛可不抛
//2.如果父类中的方法没有抛异常,那么子类重写之后要不要抛?
//不要抛
public class Demo10Exception {
    public static void main(String[] args) {

    }
    class A{
        public void method()/*throws Exception*/{

        }
    }

    class B extends A{
        @Override
        public void method()/*throws Exception*/{

        }
    }
}