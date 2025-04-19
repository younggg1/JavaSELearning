package com.javase.thread.ThreadSafe;

public class MyTicket implements Runnable{
/*1.格式:
    synchronized(任意对象){
        线程可能出现不安全的代码
    }
2.任意对象:就是我们的锁对象
3.执行:
    一个线程拿到锁之后,会进入到同步代码块中执行,在此期间,
    其他线程拿不到锁,就进不去同步代码块,需要在同步代码块外面等待排队,
    需要等着执行的线程执行完毕,出了同步代码块,相当于释放锁了,
    等待的线程才能抢到锁,才能进入到同步代码块中执行*/
    //定义票量
    int ticket = 30;

    //任意new一个对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }

}
