package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

import javax.print.attribute.standard.MediaSize;

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
