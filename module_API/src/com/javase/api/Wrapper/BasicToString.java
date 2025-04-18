package com.javase.api.Wrapper;




public class BasicToString {

    public static void main(String[] args) {
        method01();
        method02();
    }


    //基本数据类型转String
    /*1.方式1:
   + 拼接
     2.方式2:String中的静态方法
     static String valueOf(int i)*/
    private static void method01() {
        int i = 10;
        String s1 = i+"";
        System.out.println(s1+1);

        System.out.println("============");

        String s = String.valueOf(10);
        System.out.println(s+1);
    }

/*          | Byte    | static byte parseByte(String s)       | 将String转byte类型      |
            | ------- | ------------------------------------- | ----------------------- |
            | Short   | static short parseShort(String s)     | 将String转成short类型   |
            | Integer | static int parseInt(String s)         | 将String转成int类型     |
            | Long    | static long parseLong(String s)       | 将String转成long类型    |
            | Float   | static float parseFloat(String s)     | 将String转成float类型   |
            | Double  | static double parseDouble(String s)   | 将String转成double类型  |
            | Boolean | static boolean parseBoolean(String s) | 将String转成boolean类型 |*/
//    每个包装类中都有一个类似的方法:  parseXXX
    private static void method02() {
        int number = Integer.parseInt("1111");
        System.out.println(number+1);
    }
}
