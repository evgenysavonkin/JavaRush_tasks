package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate date = LocalDate.now();
        return date;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, 9, 12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = ofExample();
        int currDay = date.getDayOfYear();
        return LocalDate.ofYearDay(2020, currDay);
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.of(2020, 9, 12);
        long epoch = date.toEpochDay();
        return LocalDate.ofEpochDay(epoch);
    }
}
