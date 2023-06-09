package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant max = Instant.MAX;
        Instant instant = Instant.ofEpochMilli(Long.MAX_VALUE);
        return instant;
    }

    static Instant getMaxFromSeconds() {
        Instant instant = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return instant;
    }

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}
