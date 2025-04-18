package com.javase.api.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*1.问题描述:我们知道直接用float或者double做运算会出现精度损失的问题,所以将来设计到钱,我们就不能用float或者double直接做运算
2.作用:主要是解决float和double直接做运算出现的精度损失问题
3.构造方法:
BigDecimal(String val)  -> val必须要是数字形式
4.常用方法:
static BigDecimal valueOf(double val)  -> 此方法初始化小数时可以传入double型数据
BigDecimal add(BigDecimal val)  返回其值为 (this + val) 的 BigDecimal
BigDecimal subtract(BigDecimal val) 返回其值为 (this - val) 的 BigDecimal
BigDecimal multiply(BigDecimal val)  返回其值为 (this * val) 的 BigDecimal
BigDecimal divide(BigDecimal val)    返回其值为 (this / val) 的 BigDecimal
BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
divisor:除号后面的那个数
scale:指定保留几位小数
roundingMode:取舍方式
static int ROUND_UP -> 向上加1
static int ROUND_DOWN -> 直接舍去
static int ROUND_HALF_UP -> 四舍五入
5.注意:
如果除不尽,会报错,出现运算异常*/
public class BigDecimalMethod {
    public static void main(String[] args) {
// double doubleValue()  将此BigDecimal转成double
        //big01();
        //big02();
        big03();
        big04();
    }
    private static void big04() {
        /*1.注意:如果调用的成员上面有一个横线,证明此成员过时了,底层会有一个注解@Deprecated修饰,但是过时的成员还能使用,只不过被新的成员代替了,不推荐使用了
        2.方法:
        divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
        divisor:代表除号后面的数据
        scale:保留几位小数
        roundingMode:取舍方式-> RoundingMode是一个枚举,里面的成员可以类名直接调用
        UP:向上加1
        DOWN:直接舍去
        HALF_UP:四舍五入*/
        BigDecimal b1 = new BigDecimal("3.55");
        BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal divide = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("divide = " + divide);
    }
    private static void big03() {
        BigDecimal b1 = new BigDecimal("3.55");
        BigDecimal b2 = new BigDecimal("2.12");
        //b1除以b2,保留2位小数，取舍方式向上取整
        BigDecimal divide = b1.divide(b2, 2, BigDecimal.ROUND_UP);
        System.out.println("divide = " + divide);
        double v = divide.doubleValue();
        System.out.println("v = " + v);
    }

    private static void big02() {
        BigDecimal b1 = new BigDecimal("3.55");
        //BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal b2 = BigDecimal.valueOf(2.12);

        //BigDecimal add(BigDecimal val)  返回其值为 (this + val) 的 BigDecimal
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);
        //BigDecimal subtract(BigDecimal val) 返回其值为 (this - val) 的 BigDecimal
        BigDecimal subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);
        //BigDecimal multiply(BigDecimal val)  返回其值为 (this * val) 的 BigDecimal
        BigDecimal multiply = b1.multiply(b2);
        System.out.println("multiply = " + multiply);
        //BigDecimal divide(BigDecimal val)    返回其值为 (this / val) 的 BigDecimal
        BigDecimal divide = b1.divide(b2);
        System.out.println("divide = " + divide);

    }

    private static void big01() {
        float a = 3.55F;
        float b = 2.12F;

        float result = a-b;
        System.out.println("result = " + result);//1.4300001
    }
}
