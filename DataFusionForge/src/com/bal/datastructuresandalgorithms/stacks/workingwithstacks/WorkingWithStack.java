package com.bal.datastructuresandalgorithms.stacks.workingwithstacks;

import java.util.Stack;

public class WorkingWithStack {
    /*
    Stack is generic, we can store any types of objects in this stack.
    package
        java.util

    It looks an array
        [10, 20, 30]
        But this is just for presentation
            stacks behave differently from arrays
    push, peek, pop, isEmpty
        are the standards operations performed on stacks

    But in java, this stack also has:
        1. search(), this is not common because as we told earlier, stacks are really not meant for storing a list of
        objects and looking them up quickly. we are almost never going to use this method.
     */
    public static void show() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top= stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);
    }
}
