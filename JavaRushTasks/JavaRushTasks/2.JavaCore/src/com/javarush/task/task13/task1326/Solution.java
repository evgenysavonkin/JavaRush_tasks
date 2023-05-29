package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try(FileInputStream fileInputStream = new FileInputStream(in.nextLine());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))
        )
        {
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            while (bufferedReader.ready()){
                integerArrayList.add(Integer.parseInt(bufferedReader.readLine()));
            }
            integerArrayList.stream().filter(x -> x % 2 == 0).sorted().forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
