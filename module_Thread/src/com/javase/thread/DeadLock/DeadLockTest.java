package com.javase.thread.DeadLock;

public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock dieLock1 = new DeadLock(true);
        DeadLock dieLock2 = new DeadLock(false);

        new Thread(dieLock1).start();
        new Thread(dieLock2).start();
    }
}
