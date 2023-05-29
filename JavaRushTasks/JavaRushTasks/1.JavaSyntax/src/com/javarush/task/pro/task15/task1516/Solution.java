package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String url = in.nextLine();
            if (Files.isRegularFile(Path.of(url))){
                System.out.println(url + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(url))) {
                System.out.println(url + THIS_IS_DIR);
            } else break;
        }


    }
}

