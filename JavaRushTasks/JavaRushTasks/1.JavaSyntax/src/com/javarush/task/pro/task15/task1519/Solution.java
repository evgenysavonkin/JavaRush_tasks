package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        DirectoryStream<Path> directoryStream = null;
        try{
            directoryStream = Files.newDirectoryStream(sourceDirectory);
            for (Path path : directoryStream){
                if (Files.isRegularFile(path)){
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                } else continue;
            }
        } catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        } finally {
            directoryStream.close();
        }
    }
}

