package com.javase.designpatterns.Creational.Singleton;

public class Singletonlan {
    /*
      防止外界随意使用构造方法new对象,我们需要将构造私有化
    */
    private Singletonlan() {

    }

    /*
       懒汉式,不着急new对象
     */
    private static Singletonlan singleton1 = null;

    /*
       为了将内部new出来的对给外界
       定义一个方法,将内部new出来的对返回
     */
    public static Singletonlan getSingleton1() {
        //如果singleton1不是null就没必要抢锁了,直接返回,是null再抢锁
        if (singleton1==null){
            synchronized (Singletonlan.class){
                if (singleton1 == null) {
                    singleton1 = new Singletonlan();
                }
            }
        }
        return singleton1;
    }
}
