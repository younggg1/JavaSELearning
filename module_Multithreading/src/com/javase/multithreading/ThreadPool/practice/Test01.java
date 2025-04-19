package com.javase.multithreading.ThreadPool.practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = es.submit(new MySum());
        Future<String> f2 = es.submit(new MyString());
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
}
