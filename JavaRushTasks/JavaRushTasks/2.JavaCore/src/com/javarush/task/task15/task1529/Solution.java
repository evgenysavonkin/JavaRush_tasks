package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner in = new Scanner(System.in);
        String res = in.nextLine();
        if (res.equals("helicopter")){
            result = new Helicopter();
        } else if (res.equals("plane")) {
            int size = in.nextInt();
            result = new Plane(size);
        }
        in.close();
    }
}
