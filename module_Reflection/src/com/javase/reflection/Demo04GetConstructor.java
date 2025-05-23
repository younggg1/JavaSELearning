package com.javase.reflection;

import java.lang.reflect.Constructor;

public class Demo04GetConstructor {
    public static void main(String[] args)throws Exception {
        //获取Class对象
        Class<Person> aClass = Person.class;
        Constructor<Person> constructor = aClass.getConstructor();
        System.out.println("constructor = " + constructor);

        /*
          好比是Person person = new Person()
         */
        Person person = constructor.newInstance();

        //好比是直接输出对象名,默认调用toString
        System.out.println(person);
    }
}
