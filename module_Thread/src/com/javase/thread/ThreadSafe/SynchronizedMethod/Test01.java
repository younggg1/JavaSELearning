package com.javase.thread.ThreadSafe.SynchronizedMethod;

public class Test01 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        System.out.println(myTicket);

        Thread t1 = new Thread(myTicket, "赵四");
        Thread t2 = new Thread(myTicket, "刘能");
        Thread t3 = new Thread(myTicket, "广坤");

        t1.start();
        t2.start();
        t3.start();
    }
}
