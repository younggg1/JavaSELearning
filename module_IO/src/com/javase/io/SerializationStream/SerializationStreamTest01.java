package com.javase.io.SerializationStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStreamTest01 {
    public static void main(String[] args) throws Exception {
        write();
    }
    //序列化
    private static void write()throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        Person p1 = new Person("涛哥", 12);
        oos.writeObject(p1);
        oos.close();
    }


    //反学序列化
    private static void read()throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("module22\\person.txt"));
        Person person = (Person) ois.readObject();
        System.out.println(person);
        ois.close();
    }
}
