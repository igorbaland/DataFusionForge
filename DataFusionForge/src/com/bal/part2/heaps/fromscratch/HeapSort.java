package com.bal.part2.heaps.fromscratch;

import java.util.Arrays;

public class HeapSort {
    public static void demo() {
        int [] numbers = { 5, 3, 10, 1, 4, 2 };
        var heap = new Heap();
        for (var number : numbers)
            heap.insert(number);
//        while(!heap.isEmpty())
//            System.out.println(heap.remove());
//        for(var i = 0; i < numbers.length; i++)
//            numbers[i] = heap.remove();
        for (var i = numbers.length - 1; i >= 0; i--)
            numbers[i] = heap.remove();
        System.out.println(Arrays.toString(numbers));

    }
}
