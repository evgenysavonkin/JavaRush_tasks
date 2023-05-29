package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int begin = path.indexOf("jdk");
        String before = path.substring(0, begin);
        int after = path.indexOf("/", begin);
        String afterStr = path.substring(after);
        return before + jdk + afterStr;
    }
}
