package com.javase.api.String.StringBuilder;
//定义一个数组,以[元素1, 元素2, 元素3..]的形式输出,用StringBuilder拼接
public class StringBuilderPractice2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 1; i < 10; i++) {
            if(i == 9){
                sb.append("元素"+ i);
            }else{
                sb.append("元素"+ i).append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
