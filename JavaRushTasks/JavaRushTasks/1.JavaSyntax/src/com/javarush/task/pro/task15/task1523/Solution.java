package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        OutputStream outputStream = connection.getOutputStream();
        connection.setDoOutput(true);
        byte[] buffer;
        try (InputStream inputStream = connection.getInputStream()) {
            buffer = inputStream.readAllBytes();
        }
        String str = new String(buffer);
        System.out.println(str);


    }
}

