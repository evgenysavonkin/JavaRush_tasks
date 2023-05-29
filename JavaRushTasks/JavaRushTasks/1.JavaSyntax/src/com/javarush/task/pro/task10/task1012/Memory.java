package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
/*        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                int pos = 0;
                while (pos < array.length){
                    if (array[pos] != null){
                        String buff = array[i];
                        array[i] = array[pos];
                        array[pos] = buff;
                    }
                    pos++;
                }
            }
        }*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == null){
                    String buff = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buff;
                }
            }
        }
    }
}
