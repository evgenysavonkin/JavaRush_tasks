package com.javarush.task.pro.task09.task0908;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
/*        String zero = "0";
        String buff = "";
        String resHex = "";
        int isHex = 0;
        if ((binaryNumber == null || binaryNumber.equals("")) || (!binaryNumber.matches("^[0-1]*$"))) return "";
        else{
            if (binaryNumber.length() % 4 != 0){
                while (binaryNumber.length() % 4 != 0){
                    binaryNumber = zero + binaryNumber;
                }
            }
            int count = 1;
            while (count <= binaryNumber.length()){

                if (count == 4){
                    buff = binaryNumber.substring(0, count);
                    StringBuilder sb = new StringBuilder(buff);
                    String revBuff = sb.reverse().toString();//биты в правильном порядке
                    String [] revBuffArr = revBuff.split("");
                    for (int i = 0; i < revBuffArr.length; i++) {// 1 0 0 1
                        isHex += Integer.parseInt(revBuffArr[i]) * Math.pow(2, i);
                    }
                    resHex += Character.toString(HEX.charAt(isHex));
                    count++;
                }
                if (binaryNumber.length() % count == 4 *//**//*&& count != 1 && count != 2 && count !=3 && count != 6*//**//*){
                    isHex = 0;
                    int begin = count - 4;
                    buff = binaryNumber.substring(begin, count);
                    StringBuilder sb = new StringBuilder(buff);
                    String revBuff = sb.reverse().toString();//биты в правильном порядке
                    String [] revBuffArr = revBuff.split("");
                    for (int i = 0; i < revBuffArr.length; i++) {
                        isHex += Integer.parseInt(revBuffArr[i]) * Math.pow(2, i);
                    }
                    resHex += Character.toString(HEX.charAt(isHex));
                    count++;
                }
                if (binaryNumber.length() == count){
                    isHex = 0;
                    int begin = count - 4;
                    buff = binaryNumber.substring(begin, count);
                    StringBuilder sb = new StringBuilder(buff);
                    String revBuff = sb.reverse().toString();//биты в правильном порядке
                    String [] revBuffArr = revBuff.split("");
                    for (int i = 0; i < revBuffArr.length; i++) {
                        isHex += Integer.parseInt(revBuffArr[i]) * Math.pow(2, i);
                    }
                    if (isHex == 0){
                        resHex += "0";
                    }
                    //resHex += Character.toString(HEX.charAt(isHex));
                    count++;
                }
                count++;
            }
            return resHex;*//*
        int decimal = 0;
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }

        int maxIdx = binaryNumber.length() - 1; // вычисляем индекс самого правого символа
        for (int i = 0; i < binaryNumber.length(); i++) {
            char currChar = binaryNumber.charAt(maxIdx - i); // получаем самый правый символ
            //в текущем витке цикла
            int currNum = Character.getNumericValue(currChar); // переводим его в целое число
            decimal = decimal + currNum * (int) Math.pow(2, i); // формула из условия
        }
        return decimal;

        }*/
        //напишите тут ваш код

        if (binaryNumber == null)
            return "";

        char[] array = binaryNumber.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '0' && array[i] != '1')
                return "";
        }

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        String[] ar = new String[binaryNumber.length() / 4];
        int a = 0;
        while (a != ar.length)  {
            for (int i = 0; i < binaryNumber.length(); i += 4) {
                ar[a] = binaryNumber.substring(i, i + 4);
                ++a;
            }
        }

        String array2 = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals("0000"))
                ar[i] = "0";
            else if (ar[i].equals("0001"))
                ar[i] = "1";
            else if (ar[i].equals("0010"))
                ar[i] = "2";
            else if (ar[i].equals("0100"))
                ar[i] = "4";
            else if (ar[i].equals("1000"))
                ar[i] = "8";
            else if (ar[i].equals("0011"))
                ar[i] = "3";
            else if (ar[i].equals("0101"))
                ar[i] = "5";
            else if (ar[i].equals("1001"))
                ar[i] = "9";
            else if (ar[i].equals("1010"))
                ar[i] = "a";
            else if (ar[i].equals("1100"))
                ar[i] = "c";
            else if (ar[i].equals("0110"))
                ar[i] = "6";
            else if (ar[i].equals("0111"))
                ar[i] = "7";
            else if (ar[i].equals("1011"))
                ar[i] = "b";
            else if (ar[i].equals("1101"))
                ar[i] = "d";
            else if (ar[i].equals("1110"))
                ar[i] = "e";
            else if (ar[i].equals("1111"))
                ar[i] = "f";
            array2 = array2 + ar[i];
        }

        return array2;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        if ((hexNumber == null || hexNumber.equals("")) && !hexNumber.matches("^[0-9a-f]*$")) return "";
        else{
            String binary = "";
            String [] binArr = hexNumber.split("");
            for (int i = 0; i < binArr.length; i++) {
                if (binArr[i].matches("^[1-9]*$")){
                    String binary1 = "";
                    int binInt = Integer.parseInt(binArr[i]);
                    while (binInt != 0){
                        binary1 = (binInt % 2) + binary1;
                        binInt /= 2;
                    }
                    binary += binary1;
                }
                if (binArr[i].matches("^[a-f]*$")){
                    String binary2 = "";
                    ArrayList<Integer> ost = new ArrayList<>();
                    int resInt = HEX.indexOf(binArr[i]);
                    while (resInt != 0){
                        binary2 = (resInt % 2) + binary2;
                        resInt /= 2;
                    }
                    binary += binary2;
                }
                if (binArr[i].equals("0")){
                    String binary3 = "";
                    binary3 += "0000";
                    binary += binary3;
                }

            }
            return binary;
/*        if (hexNumber == null)
            return "";

        String a = "";
        String b = "";

        char[] array = hexNumber.toCharArray();

        for (int i = 0; i < array.length; i++) {
            a = Character.toString(array[i]);
            if (a.equals("0"))
                a = "0000";
            else if (a.equals("1"))
                a = "0001";
            else if (a.equals("2"))
                a = "0010";
            else if (a.equals("3"))
                a = "0011";
            else if (a.equals("4"))
                a = "0100";
            else if (a.equals("5"))
                a = "0101";
            else if (a.equals("6"))
                a = "0110";
            else if (a.equals("7"))
                a = "0111";
            else if (a.equals("8"))
                a = "1000";
            else if (a.equals("9"))
                a = "1001";
            else if (a.equals("a"))
                a = "1010";
            else if (a.equals("b"))
                a = "1011";
            else if (a.equals("c"))
                a = "1100";
            else if (a.equals("d"))
                a = "1101";
            else if (a.equals("e"))
                a = "1110";
            else if (a.equals("f"))
                a = "1111";
            else    {
                return "";
            }
            b = b + a;
        }
        return b;*/
    

    }
}}
