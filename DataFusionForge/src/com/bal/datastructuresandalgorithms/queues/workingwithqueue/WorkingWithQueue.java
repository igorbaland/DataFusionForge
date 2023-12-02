package com.bal.datastructuresandalgorithms.queues.workingwithqueue;

import java.util.*;

public class WorkingWithQueue {
    /*
    2 x implementing classes that we would use 90% of the time are
        1. ArrayDeque
            Deck is short  for double and deque. That is a queue that has
                two ends
                    we can add items from any direction
                        left or right
        Difference between
            add(E e) : boolean
                if queue == full
                    throw exception
            offer(E e) : boolean
                if queue == full
                    will not throw exception, the queue may not accept it.
        Not all implementations are resizable, some of them have a limit, so the queue can be full.

        Similar to add(E) and offer(E) we have
            poll()
                isEmpty
                    return null
            remove()
                isEmpty
                    remove with throw an exception

            peek() : E
                return null
            element() : E
                throw an exception

        2. LinkedList
            in java implements Queue interface
                we can use as a queue

    Output:
        looks like an array but behaves like a queue.
                [10, 20, 30]
          FRONT             BACK or REAR

        add
            back
        remove
            front

     */
    public static void show() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);

    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());
    }
}
