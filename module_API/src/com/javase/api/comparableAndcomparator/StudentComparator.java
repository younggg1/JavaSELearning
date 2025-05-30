package com.javase.api.comparableAndcomparator;

import java.util.Comparator;

public class StudentComparator implements Comparator {
    private String name;
    private int score;

    public StudentComparator() {

    }

    public StudentComparator(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    /*
       o1代表students[i]
       o2代表students[i+1]

       如果o1的分数大于o2的分数-> compare方法返回正整数
       如果o1的分数小于o2的分数-> compare方法返回负整数
       如果o1的分数等于o2的分数-> compare方法返回0
     */
    @Override
    public int compare(Object o1, Object o2) {
        StudentComparator s1 = (StudentComparator) o1;
        StudentComparator s2 = (StudentComparator) o2;
        return s1.getScore()-s2.getScore();
    }

}
