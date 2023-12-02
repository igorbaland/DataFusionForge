package com.bal.datastructuresandalgorithms.queues.workingwithqueue;

import java.util.PriorityQueue;

public class PriorityQueuesDemo {
    /*
    1. Arrays
    2. Heap
     */
    public static void show() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
