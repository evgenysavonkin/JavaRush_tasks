package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] elementsGrowen = new String[(capacity * 3)/2];
        capacity = elementsGrowen.length;
        for (int i = 0; i < elementsGrowen.length; i++) {
            if (i >= elements.length){
                elementsGrowen[i] = null;
            }
            else{
            elementsGrowen[i] = elements[i];
            }

        }
        elements = elementsGrowen;
    }

}
