package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();
    static{
        List<String> strings = null;
        try{
            strings = Files.readAllLines(Paths.get(Statics.FILE_NAME));
        } catch (IOException e){
            e.getMessage();
        }
        for (String s : strings){
            lines.add(s);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
