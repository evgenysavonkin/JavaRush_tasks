package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.List;

public class MinMaxUtil {
    public static List<Integer> ints = new ArrayList<>();
    public static int min(int x, int x1){
        return Math.min(x, x1);
    }
    public static int min(int x, int x1, int x2){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        int min = x;
        for (int i : ints){
            if (min > i) min = i;
        }
        ints.clear();
        return min;
    }
    public static int min(int x, int x1, int x2, int x3){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        ints.add(x3);
        int min = x;
        for (int i : ints){
            if (min > i) min = i;
        }
        ints.clear();
        return min;
    }
    public static int min(int x, int x1, int x2, int x3, int x4){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        ints.add(x3);
        ints.add(x4);
        int min = x;
        for (int i : ints){
            if (min > i) min = i;
        }
        ints.clear();
        return min;
    }
    public static int max(int x, int x1){
        return Math.max(x, x1);
    }
    public static int max(int x, int x1, int x2){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        int max = x;
        for (int i : ints){
            if (i > max) max = i;
        }
        ints.clear();
        return max;
    }
    public static int max(int x, int x1, int x2, int x3){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        ints.add(x3);
        int max = x;
        for (int i : ints){
            if (i > max) max = i;
        }
        ints.clear();
        return max;
    }
    public static int max(int x, int x1, int x2, int x3, int x4){
        ints.add(x);
        ints.add(x1);
        ints.add(x2);
        ints.add(x3);
        ints.add(x4);
        int max = x;
        for (int i : ints){
            if (i > max) max = i;
        }
        ints.clear();
        return max;
    }
}
