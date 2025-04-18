package com.javase;

public class TestComparator {
    public static void main(String[] args) {
        //创建一个数组
        StudentComparator[] students = new StudentComparator[3];
        StudentComparator s1 = new StudentComparator("张三", 100);
        StudentComparator s2 = new StudentComparator("李四", 60);
        StudentComparator s3 = new StudentComparator("王五", 80);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        StudentComparator student = new StudentComparator();

        for (int j = 0; j<students.length-1;j++){
            for (int i = 0;i<students.length-1-j;i++){
                //如果students[i]比students[i+1]大,就排序换位置
                if (student.compare(students[i],students[i+1])>0){
                    StudentComparator temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }

        //遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
