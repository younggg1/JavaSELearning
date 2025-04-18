package com.javase.api.System;

public class SystemTest {
//    static long currentTimeMillis()返回以毫秒为单位的当前时间,可以测效率
//static void exit(int status)终止当前正在运行的 Java 虚拟机

public static void main(String[] args) {
    //currentTimeMillis();
    //exit();
    arraycopy();
}

    /*
      static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
             src:源数组
             srcPos:从源数组的哪个索引开始复制
             dest:目标数组
             destPos:从目标数组的哪个索引开始粘贴
             length:复制多少个元素
     */
    private static void arraycopy() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,0,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }

    private static void exit() {
        for (int i = 0; i < 100; i++) {
            if (i==5){
                System.exit(0);
            }
            System.out.println("helloworld"+i);
        }
    }

    private static void currentTimeMillis() {
        long time = System.currentTimeMillis();
        System.out.println("time = " + time);
    }
}
