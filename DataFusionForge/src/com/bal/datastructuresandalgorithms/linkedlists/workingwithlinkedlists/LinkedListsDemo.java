package com.bal.datastructuresandalgorithms.linkedlists.workingwithlinkedlists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListsDemo {
    /*

     */
    public static void show() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.indexOf(10));
//        System.out.println(list.contains(10));
    }
}
