package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();
    public static int i = 0;

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value=value;
        if (first.next == null) {
            first.next = node;
            node.next = last;
            node.prev = first;
            last.prev = node;
            return;
        }
        (last.prev).next = node;
        node.next= last;
        node.prev=last.prev;
        last.prev = node;

        /*Node node = new Node();
        first.next = node;
        last.prev = node;
        node.value = value;*/ ////////Работает
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
