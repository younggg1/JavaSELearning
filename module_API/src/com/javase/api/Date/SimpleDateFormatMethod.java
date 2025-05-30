package com.javase.api.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMethod {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //1.String format(Date date) -> 将Date对象按照指定的格式转成String
        String time1 = sdf.format(new Date());
        System.out.println("time1 = " + time1);
        //2.Date parse(String source)-> 将符合日期格式的字符串转成Date对象
        String time2 = "2000-10-10 10:10:10";
        Date date = null;
        try {
            date = sdf.parse(time2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("date = " + date);
    }
}
