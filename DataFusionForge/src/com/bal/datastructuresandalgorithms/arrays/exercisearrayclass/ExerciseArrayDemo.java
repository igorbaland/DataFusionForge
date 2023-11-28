package com.bal.datastructuresandalgorithms.arrays.exercisearrayclass;

public class ExerciseArrayDemo {
    /*
    As we learned, arrays in java are static, which means they have a fixed size and this size cannot be changed
     */

    public static void show() {
        Array numbers = new Array(2);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
//        numbers.insert(40);
        numbers.intersect(new Array(3));
//        System.out.println(numbers.indexOf(100));
//        numbers.print();
    }
}
