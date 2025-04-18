package com.javase.object;

import java.util.Objects;


public class Person implements Cloneable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//1.Object中的toString方法:返回该对象的字符串表示形式
//public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}
//
//2.注意:
//a.如果没有重写Object中的toString方法,直接输出对象名会默认调用Object中的toString方法,直接输出地址值
//b.如果重写了Object中的toString方法,再输出地址值,重写没有意义,所以重写完toString之后,应该返回对象的内容
//
//3.总结:
//如果直接输出对象名不想输出地址值,就重写Object中的toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
       问题1:obj直接调用name和age调用不了,因为Object接收了Person类型的对象
            属于多态,多态前提下不能直接调用子类特有内容
       解决问题1:向下转型

       问题2:如果传递的不是Person类型,就会出现类型转换异常
       解决问题2:先判断类型,如果是Person类型,再强转成Person

       问题3:如果传递null呢?,就不用判断类型了,直接给false

       问题4:如果传递自己呢?就不用判断非空了,也不同判断类型了,直接给true
     */
   /* public boolean equals(Object obj){
        if (this==obj){
            return true;
        }

        if (obj==null){
            return false;
        }

        if (obj instanceof Person){
            Person p = (Person) obj;
            return this.name.equals(p.name)&&this.age==p.age;
        }
        return false;

    }*/
//1.概述:比较两个对象的地址值是否相等
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }
//
//    == 针对于基本数据类型来说,比较的是值
//    == 针对于引用数据类型来说,比较的是地址值
//
//2.注意:
//    a.如果没有重写Object中的equals方法,那么就会调用Object中的equals方法,比较对象的地址值
//    b.如果重写了Object中的equals方法,那么就会调用重写后的equals方法,应该比较对象的内容
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
//    小结:
//1.如果直接输出对象名不想输出地址值,重写toString方法
//2.如果想比较两个对象的内容,就重写一下equals方法
//3.怎么重写:alt+insert -> 选toString 或者equals and hashcode -> 啥也不要管 -> 一路下一步即可
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}





}
