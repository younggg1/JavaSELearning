package com.javase.exception;

public class Demo2Exception {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        method(arr);
    }
    public static void method(int[] arr){
        System.out.println(arr[6]);
        System.out.println("我想执行");
    }
}
