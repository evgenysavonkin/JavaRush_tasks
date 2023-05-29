package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static Random r = new Random();
    static{
        int counter = 0;
        String input = "";
        while (counter < 5){
            double d = r.nextDouble();
            input += String.valueOf(r.nextInt());
            labels.put(d, input);
            counter++;
        }
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
