package com.javarush.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Если ресурсов много
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (Scanner scanner = new Scanner(System.in)){
            fileName = scanner.nextLine();
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

