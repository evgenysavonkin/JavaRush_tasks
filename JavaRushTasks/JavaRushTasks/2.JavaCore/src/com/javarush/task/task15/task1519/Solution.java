package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String text = br.readLine();
            if (text.equals("exit")){
                break;
            } else{
                if (text.matches("^\\-{0,1}\\d{0,}$")){
                    int num = Integer.parseInt(text);
                    if (num > 0 && num < 128){
                        short s = (short) num;
                        print(s);
                    } else if (num <= 0 || num >= 128) {
                        print(num);
                    }
                }else if (text.equals(".")){
                    print(text);
                } else if (text.contains(".")){
                //else if (text.matches("^\\d{0,}\\.{1}\\d{0,}")) {
                    double d = 0;
                    try {
                        d = Double.parseDouble(text);

                    } catch (Exception e){
                        print(text);
                        continue;
                    }
                    print(d);
                } else{
                    print(text);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
