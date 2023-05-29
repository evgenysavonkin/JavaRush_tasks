package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        BufferedReader br = null;
        try{
            Scanner in = new Scanner(System.in);
            fileInputStream = new FileInputStream(in.nextLine());
            br = new BufferedReader(new InputStreamReader(fileInputStream));
            String text;
            while ((text = br.readLine()) != null){
                System.out.println(text);
            }
            in.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }}