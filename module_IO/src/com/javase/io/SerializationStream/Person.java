package com.javase.io.SerializationStream;

import java.io.Serializable;
/*问题描述:
序列化之后,修改源码,修改完之后没有重新序列化,直接反序列化了,就会出现了序列号冲突问题:
InvalidClassException
解决:将序列号定死,后面不管怎么修改源码,序列号都是这一个
在被序列化的对象中加上一个public static final long 的变量,并为其赋值*/
public class Person implements Serializable {
    public static final long serialVersionUID = 42L;
    private String name;
    public Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
