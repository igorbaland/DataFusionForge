package com.bal.datastructuresandalgorithms.arrays.dynamicarrays;

import java.util.ArrayList;

public class DynamicArraysDemo {
    /*
    We learned how to build a dynamic array from scratch.
    Java has two implementations of dynamic arrays
        1. Vector
            - will grow by 100% in size, every time it gets full.
            - all the methods are synchronized. Only a single thread can access this method.
        2. ArrayList
            - will only grow 50% of its size
            - methods are asynchronise
    Both these classes are declared in the java.util package. But they are slightly different.
     */
    public static void demo() {
        ArrayList<Integer> list = new ArrayList<>();

    }
}
