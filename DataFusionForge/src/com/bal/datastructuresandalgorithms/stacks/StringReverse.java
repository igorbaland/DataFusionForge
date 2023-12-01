package com.bal.datastructuresandalgorithms.stacks;

import java.util.Stack;

public class StringReverse {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack =new Stack<>();
        //cleaner way
        for (var ch : input.toCharArray())
            stack.push(ch);

        /*a better way
            StringBuffer
                this class is used in string situations, where we have a lot of strength manipulation operations.
         */
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();

//        for (var i = 0; i < input.length(); i++)
//            stack.push(input.charAt(i));


        /*
        The problem with this approach is that we have a lot of string concatenations. What if our input is a million
        characters long. All these concatenations are going be to expensive because every time we run this statement
            a new String object is created in memory, because strings are immutable in java . We cannot modify them, if
            we modify a string, a new memory is allocated and characters are copied into that  new memory space.
         */
//        String reversed = "";
//        while(!stack.empty())
//            reversed += stack.pop();
    }

}
