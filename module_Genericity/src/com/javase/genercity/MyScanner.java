package com.javase.genercity;
// 泛型实现迭代器接口
public class MyScanner implements MyIterator<String>{
    @Override
    public String next() {
        return "涛哥和金莲的故事";
    }
}
