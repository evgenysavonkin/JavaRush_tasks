package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
/*        String s = "12312. 4324,. 412";
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ',' && chars[i] != '.' && chars[i] != ' '){
                System.out.print(chars[i]);
            }
        }*/
        try (Scanner in = new Scanner(System.in);
        ) {
            var input = Files.readAllLines(Paths.get(in.nextLine()));
            for (String unit : input) {
                for (int i = 0; i < unit.length(); i++) {
                    if (unit.charAt(i) != '\u002e' && unit.charAt(i) != '\u002c' && unit.charAt(i) != '\u0020') {
                        System.out.print(unit.charAt(i));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

