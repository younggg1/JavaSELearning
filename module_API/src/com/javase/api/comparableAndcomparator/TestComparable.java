package com.javase.api.comparableAndcomparator;

public class TestComparable {
    public static void main(String[] args) {
        //创建一个数组
        StudentComparable[] studentComparables = new StudentComparable[3];
        StudentComparable s1 = new StudentComparable("张三", 100);
        StudentComparable s2 = new StudentComparable("李四", 60);
        StudentComparable s3 = new StudentComparable("王五", 80);
        studentComparables[0] = s1;
        studentComparables[1] = s2;
        studentComparables[2] = s3;

        for (int j = 0; j< studentComparables.length-1; j++){
            for (int i = 0; i< studentComparables.length-1-j; i++){
                //如果students[i]比students[i+1]大,就排序换位置
                if (studentComparables[i].compareTo(studentComparables[i+1])>0){
                    StudentComparable temp = studentComparables[i];
                    studentComparables[i] = studentComparables[i+1];
                    studentComparables[i+1] = temp;
                }
            }
        }

        //遍历
        for (int i = 0; i < studentComparables.length; i++) {
            System.out.println(studentComparables[i]);
        }
    }
}
