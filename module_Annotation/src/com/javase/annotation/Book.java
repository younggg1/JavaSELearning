package com.javase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*1.概述:元注解就是管理注解的注解
2.从哪些方面管理呢?
a.控制注解的使用位置
控制注解是否能在类上使用
控制注解是否能在方法上使用
控制注解是否能在构造上使用等
b.控制注解的生命周期(加载位置)
控制注解是否能在源码中出现
控制注解是否能在class文件中出现
控制注解是否能在内存中出现
3.怎么使用:
a.@Target:控制注解的使用位置
属性:ElementType[] value();
ElementType是一个枚举,里面的成员可以类名直接调用
ElementType中的成员:
TYPE:控制注解能使用在类上
FIELD:控制注解能使用在属性上
METHOD:控制注解能使用在方法上
PARAMETER:控制注解能使用在参数上
CONSTRUCTOR:控制注解能使用在构造上
LOCAL_VARIABLE:控制注解能使用在局部变量上
b.@Retention:控制注解的生命周期(加载位置)
属性:RetentionPolicy value();
RetentionPolicy是一个枚举,里面的成员可以类名直接调用
RetentionPolicy中的成员:
SOURCE:控制注解能在源码中出现 -> 默认
CLASS:控制注解能在class文件中出现
RUNTIME:控制注解能在内存中出现*/
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    String bookName();
    //作者
    String[] author();
    //价格
    int price();
    //数量
    int count() default 10;
}
