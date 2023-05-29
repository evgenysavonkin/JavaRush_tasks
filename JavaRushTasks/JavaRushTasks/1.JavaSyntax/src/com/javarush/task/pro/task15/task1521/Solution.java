package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String image = "https://vk.com/im?peers=c113_385079616_c160&sel=c151&z=photo236333668_457246124%2Fmail2138947";
        URL url = new URL(image);
        InputStream input = url.openStream();

        Path path = Path.of("c:\\Cube.jpg");
        Files.copy(input, path);
    }
}