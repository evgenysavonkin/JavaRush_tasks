package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {
    private static final String[] languages = new String[]{"Java", "Kotlin", "Go", "Javascript",
    "Typescript", "Python", "PHP", "C++"};

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            map.put(i, languages[i]);
        }
        return map;
/*        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;*/
    }

}
