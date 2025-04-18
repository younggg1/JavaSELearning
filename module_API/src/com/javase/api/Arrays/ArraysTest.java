package com.javase.api.Arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,5,4,7};
        //按照格式打印数组元素<br>[元素1, 元素2, ...]
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        //升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("==============");
        int[] arr1 = {1,2,3,4,5,6,7};
        //二分查找(前提是升序)
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("index = " + index);

        System.out.println("==============");
        int[] arr2 = {1,2,3,4,5};
        //数组扩容
        int[] newArr = Arrays.copyOf(arr2, 10);
        System.out.println(Arrays.toString(newArr));

        arr2 = newArr;
        System.out.println(Arrays.toString(arr2));

    }
}
