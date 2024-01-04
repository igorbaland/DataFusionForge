package com.bal.part2.heaps.fromscratch;

import java.util.Arrays;

public class MaxHeap {
    /*
    Heapify
    transforming an array into a heap in place
     */
    public static void demo() {
        int[] numbers = { 5, 3, 8, 4, 1, 2 };
        System.out.println(getKthLargest(
                numbers, 0));
//        heapify(numbers);
//        System.out.println(Arrays.toString(numbers));
    }

    public static void heapify(int[] array) {
        //fewer recursion, optimization heapify
        var lastParentIndex = array.length / 2 - 1;
        for (var i = lastParentIndex; i >= 0; i--)
            heapify(array, i);
    }

    public static int getKthLargest(int[] array, int k) {
        if (k < 1 || k > array.length)
            throw new IllegalArgumentException();

        var heap = new Heap();
        for (var number : array)
            heap.insert(number);

        for (var i = 0; i < k - 1; i++)
            heap.remove();

        return heap.max();
    }

    private static void heapify(int[] array, int index) {
        var largerIndex = index;

        var leftIndex = index * 2 + 1;
        if (leftIndex <  array.length &&
                array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;

        var rightIndex = index * 2 + 2;
        if (rightIndex < array.length &&
            array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex)
            return;

        swap(array, index, largerIndex);
        heapify(array, largerIndex);

    }

    public static void swap(int[] array, int first, int second) {
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
