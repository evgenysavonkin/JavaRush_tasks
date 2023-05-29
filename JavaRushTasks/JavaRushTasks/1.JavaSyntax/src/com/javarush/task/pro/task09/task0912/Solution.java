package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        int firstIndOfSlash = 0;
        char[] chars = url.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ':'){
                firstIndOfSlash = i;
                break;
            }
        }
        String protocol = url.substring(0, firstIndOfSlash);
        if (protocol.equals("http") || protocol.equals("https")){
            return protocol;
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        int lastIndOfDot = url.lastIndexOf('.');
        String domain = url.substring(lastIndOfDot + 1, url.length());
        if (domain.equals("com") || domain.equals("net") || domain.equals("org") || domain.equals("ru")){
            return domain;
        } else {
            return "неизвестный";
        }
    }
}
