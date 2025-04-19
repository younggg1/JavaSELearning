package com.javase.thread.Thread;

public class ThreadMethod {
    public static void main(String[] args) {
        /*void start() -> 开启线程,jvm自动调用run方法
        void run()  -> 设置线程任务,这个run方法是Thread重写的接口Runnable中的run方法
        String getName()  -> 获取线程名字
        void setName(String name) -> 给线程设置名字
        static Thread currentThread() -> 获取正在执行的线程对象(此方法在哪个线程中使用,获取的就是哪个线程对象)
        static void sleep(long millis)->线程睡眠,超时后自动醒来继续执行,传递的是毫秒值*/
        MyThread t1 = new MyThread();
        t1.setName("线程1");
        t1.start();
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"执行了"+i);
        }

    }
}
