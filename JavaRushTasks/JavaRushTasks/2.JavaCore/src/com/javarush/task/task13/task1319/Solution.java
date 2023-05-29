package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(in.nextLine()))

        ){
            ArrayList<String> strings = new ArrayList<>();
            String inputText;
            boolean flag = true;
            while (flag){
                inputText = in.nextLine();
                if (inputText.equals("exit")){
                    strings.add(inputText);
                    flag = false;
                    break;
                } else{
                    strings.add(inputText);
                }
            }
            for (String i : strings){
                bw.write(i + "\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
