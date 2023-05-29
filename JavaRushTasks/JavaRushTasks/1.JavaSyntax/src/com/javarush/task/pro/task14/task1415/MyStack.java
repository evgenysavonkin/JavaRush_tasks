package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String s = storage.get(0);
        storage.remove(s);
        return s;
    }

    public String peek() {
        String s = storage.get(0);
        return s;
    }

    public boolean empty() {
        boolean isEmpty = storage.isEmpty();
        return isEmpty;
    }

    public int search(String s) {
        int ind = storage.indexOf(s);
        return ind;
    }
}
