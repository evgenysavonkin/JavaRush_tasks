package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(in.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(in.nextLine()));
             )
        {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0){
                int read = inputStream.read();
                int read2 = inputStream.read();
            }
        } catch(Exception e){
            e.printStackTrace();
        }

}
}

