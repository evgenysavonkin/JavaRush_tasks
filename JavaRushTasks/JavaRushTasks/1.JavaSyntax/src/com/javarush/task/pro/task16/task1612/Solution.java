package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> set = new HashSet<>();
        for (var pair : sourceMap.entrySet()){
            LocalDate key = pair.getKey();
            List<LocalTime> values = pair.getValue();
            Iterator<LocalTime> iterator = values.iterator();
            while (iterator.hasNext()){
                LocalDateTime time = LocalDateTime.of(key, iterator.next());
                set.add(time);
                iterator.remove();
            }
        }
        return set;

    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}