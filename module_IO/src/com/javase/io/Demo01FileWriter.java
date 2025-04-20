package com.javase.io;

import java.io.FileWriter;

public class Demo01FileWriter {
    public static void main(String[] args)throws Exception {
        FileWriter fw = new FileWriter("module21\\2.txt");
        fw.write("千山鸟飞绝\r\n");
        fw.write("万径人踪灭\r\n");
        fw.write("孤舟蓑笠翁\r\n");
        fw.write("独钓寒江雪\r\n");
        //fw.flush();
        fw.close();
    }
}