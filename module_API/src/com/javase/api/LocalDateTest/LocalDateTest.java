package com.javase.api.LocalDateTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;


public class LocalDateTest {
    public static void main(String[] args) {
        //static LocalDate now()  -> 创建LocalDate对象
        LocalDate localDateTest = LocalDate.now();
        System.out.println("localDate = " + localDateTest);
        //static LocalDate of(int year, int month, int dayOfMonth)  -> 创建LocalDate对象,设置年月日
        LocalDate localDateTest1 = LocalDate.of(2000, 10, 10);
        System.out.println("localDate1 = " + localDateTest1);
    }

    //获取日期字段
    private static void get() {
        LocalDate localDate = LocalDate.now();
        //int getYear()->获取年份
        System.out.println(localDate.getYear());
        //int getMonthValue()->获取月份
        System.out.println(localDate.getMonthValue());
        //int getDayOfMonth()->获取月中的第几天
        System.out.println(localDate.getDayOfMonth());
    }
    //日期字段偏移
    private static void plusAndMinus() {
        LocalDate localDate = LocalDate.now();
        // LocalDate localDate1 = localDate.plusYears(1L);
        // System.out.println("localDate1 = " + localDate1);
        LocalDate localDate1 = localDate.minusYears(1L);
        System.out.println("localDate1 = " + localDate1);

    }
    //设置日期字段
    private static void with() {
        LocalDate localDate = LocalDate.now();
        //LocalDate withYear(int year):设置年份
        //LocalDate localDate1 = localDate.withYear(2000);
        //System.out.println(localDate1);

        //LocalDate withMonth(int month):设置月份
        //LocalDate localDate2 = localDate1.withMonth(10);
        //System.out.println("localDate2 = " + localDate2);
        //LocalDate withDayOfMonth(int day):设置月中的天数

        //LocalDate localDate3 = localDate2.withDayOfMonth(10);
        //System.out.println("localDate3 = " + localDate3);

        LocalDate localDate1 = localDate.withYear(2000).withMonth(10).withDayOfMonth(10);
        System.out.println("localDate1 = " + localDate1);
    }
    //Period计算日期之间的偏差，计算相隔多少
    private static void period() {
        LocalDate local1 = LocalDate.of(2022, 12, 12);
        LocalDate local2 = LocalDate.of(2021, 11, 11);

        Period period = Period.between(local2, local1);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
    //计算时间之间的偏差
    private static void duration() {
        LocalDateTime local1 = LocalDateTime.of(2022, 12, 12,12,12,12);
        LocalDateTime local2 = LocalDateTime.of(2021, 11, 11,11,11,11);
        Duration duration = Duration.between(local2, local1);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
    }

    //日期字符串格式化
    private static void parse() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2000-10-10 10:10:10";
        TemporalAccessor temporalAccessor = dtf.parse(time);
        //System.out.println(temporalAccessor);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println("localDateTime = " + localDateTime);
    }
}
