package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {

        if (decimalNumber <= 0) return "";
        else {
            String binaryNum = "";
            while (decimalNumber != 0){
                binaryNum = (decimalNumber % 2) + binaryNum;
                decimalNumber /= 2;
            }
            return binaryNum;
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) return 0;
        else{
            int decimalNum = 0;
            String[] s = binaryNumber.split("");
            for (int i = 0; i < s.length; i++) {
                decimalNum = decimalNum + (Integer.parseInt(s[s.length - i - 1]) * (int)Math.pow(2, i));
            }
            return decimalNum;
        }
    }
}
