package com.javase.regex;

import java.util.Arrays;

public class Demo02Regex {
    public static void main(String[] args) {
        method01();
        method02();
        method03();
        method04();
        method05();
        method06();
    }

    //字符类
    private static void method01() {
/*    java.util.regex.Pattern:正则表达式的编译表示形式。
    正则表达式-字符类:[]表示一个区间,范围可以自己定义
    语法示例：
    1. [abc]：代表a或者b，或者c字符中的一个。
    2. [^abc]：代表除a,b,c以外的任何字符。
    3. [a-z]：代表a-z的所有小写字符中的一个。
    4. [A-Z]：代表A-Z的所有大写字符中的一个。
    5. [0-9]：代表0-9之间的某一个数字字符。
    6. [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
    7. [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符*/
        //1.验证字符串是否以h开头,d结尾,中间是aeiou的某一个字符
        boolean result01 = "had".matches("[h][aeiou][d]");
        System.out.println("result01 = " + result01);

        //2.验证字符串是否以h开头,d结尾,中间不是aeiou的某个字符
        boolean result02 = "hyd".matches("[h][^aeiou][d]");
        System.out.println("result02 = " + result02);

        //3.验证字符串是否是开头a-z的任意一个小写字母,后面跟ad
        boolean result03 = "had".matches("[a-z][a][d]");
        System.out.println("result03 = " + result03);
    }


    /*
      逻辑运算符
     */
    private static void method02() {
        /*正则表达式-逻辑运算符
        语法示例：
        1. &&：并且
        2. | ：或者*/
        //1.要求字符串是小写字母并且字符不能以[aeiou]开头,后面跟ad
        boolean result01 = "yad".matches("[[a-z]&&[^aeiou]][a][d]");
        System.out.println("result01 = " + result01);

        //2.要求字符是aeiou的某一个字符开头,后面跟ad
        boolean result02 = "had".matches("[a|e|i|o|u][a][d]");
        System.out.println("result02 = " + result02);
    }
    //预定义字符
    private static void method03() {
/*        正则表达式-预定义字符
        语法示例：
        1. "." ： 匹配任何字符。(重点)  不能加[]
        2. "\\d"：任何数字[0-9]的简写；(重点)
        3. "\\D"：任何非数字[^0-9]的简写；
        4. "\\s"： 空白字符：[ \t\n\x0B\f\r] 的简写
        5. "\\S"： 非空白字符：[^\s] 的简写
        6. "\\w"：单词字符：[a-zA-Z_0-9]的简写(重点)
        7. "\\W"：非单词字符：[^\w]*/

        //1.验证字符串是否是三位数字
        //boolean result01 = "111".matches("[0-9][0-9][0-9]");
        boolean result01 = "111".matches("\\d\\d\\d");
        System.out.println("result01 = " + result01);

        //2.验证手机号: 1开头 第二位3 5 8 剩下的都是0-9的数字
        boolean result02 = "13838381438".matches("[1][358]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        System.out.println("result02 = " + result02);

        //3.验证字符串是否以h开头,d结尾,中间是任意一个字符
        boolean result03 = "had".matches("[h].[d]");
        System.out.println("result03 = " + result03);
    }

    //数量词
    private static void method04() {
/*        正则表达式-数量词
        语法示例：x代表字符
        1. X? : x出现的数量为 0次或1次
        2. X* : x出现的数量为 0次到多次 任意次
        3. X+ : x出现的数量为 1次或多次 X>=1次
        4. X{n} : x出现的数量为 恰好n次 X=n次
        5. X{n,} : x出现的数量为 至少n次 X>=n次  x{3,}
        6. X{n,m}: x出现的数量为 n到m次(n和m都是包含的)   n=<X<=m*/
        //1.验证字符串是否是三位数字
        boolean result01 = "111".matches("\\d{3}");
        System.out.println("result01 = " + result01);
        //2.验证手机号: 1开头 第二位3 5 8 剩下的都是0-9的数字
        boolean result02 = "13838381438".matches("[1][358]\\d{9}");
        System.out.println("result02 = " + result02);

        //3.验证qq号:  不能是0开头,都是数字,长度为5-15
        boolean result03 = "111111".matches("[1-9][0-9]{4,14}");
        System.out.println("result03 = " + result03);

    }
    //分组括号
    private static void method05() {
//        正则表达式-分组括号( )  (abc)
        //校验abc可以出现任意次
        boolean result = "abcabc".matches("(abc)*");
        System.out.println("result = " + result);
    }
    private static void method06() {
/*        String类中和正则表达式相关的方法
        boolean matches(String regex) 判断字符串是否匹配给定的正则表达式。
        String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String replaceAll(String regex, String replacement)把满足正则表达式的字符串,替换为新的字符*/
        //String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String s1 = "abc hahah  hehe   hdhshsh";
        String[] arr1 = s1.split(" +");
        System.out.println(Arrays.toString(arr1));
        //String replaceAll(String regex, String replacement)把满足正则表达式的字符串,替换为新的字符
        String s2 = s1.replaceAll(" +", "z");
        System.out.println("s2 = " + s2);
    }

}
