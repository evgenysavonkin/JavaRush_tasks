package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import java.io.IOException;

public class Solution {
    public static int A = 0;

    static{
        try{
            throw new IOException();
        } catch (Exception e){
            e.printStackTrace();
        }
        //if (true) throw new RuntimeException();
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
