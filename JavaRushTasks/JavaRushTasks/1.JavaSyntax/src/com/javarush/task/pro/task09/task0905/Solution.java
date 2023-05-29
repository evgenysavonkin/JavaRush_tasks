package com.javarush.task.pro.task09.task0905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 500;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) return 0;
        else {
            ArrayList<Integer> ost = new ArrayList<>();
            while (decimalNumber != 0) {
                int tmp = decimalNumber % 8;
                ost.add(tmp);
                decimalNumber /= 8;
            }
            Collections.reverse(ost);
            String numStr = "";
            for (int i = 0; i < ost.size(); i++) {
                numStr += String.valueOf(ost.get(i));
            }
            return Integer.parseInt(numStr);
        }
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) return 0;
        else {
            ArrayList<Integer> ost = new ArrayList<>();
            String a = String.valueOf(octalNumber);
            String[] arr = a.split("");
            for (int i = 0; i < arr.length; i++) {
                ost.add(Integer.parseInt(arr[i]));
            }
            Collections.reverse(ost);
            int sum = 0;
            for (int i = 0; i < ost.size(); i++) {
                sum += ost.get(i) * (int)Math.pow(8, i);
            }
            return sum;
        }
    }
}
