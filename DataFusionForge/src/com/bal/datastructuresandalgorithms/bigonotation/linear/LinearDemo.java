package com.bal.datastructuresandalgorithms.bigonotation.linear;

public class LinearDemo {
    /*
    O(n)
    Here we have slightly more complex example, have a loop. We are iterating over this array and printing each item on
    the console.
    This is where the size of the input matters. If we have a single item in this array, we are going to have one print
    operation. If we have a million items, obviously we are going to have a million print operations. The cost of this
    algorithm grows linearly and in direct correlation to the size of the input.

    We represent the runtime complexity of this method
        O(n)
            where n represents the size of the input. As
                n grows, the cost of this algorithm also grows linearly. It doesn't matter what kind of loop we use to
                iterate over this array.
                Here we are using a traditional for loop, we can also use a forEach() loop
                    for (int number : numbers)
                        sout(number);
                We are still iterating over all the items in this array. We can also use a while loop or a do while loop

    The complexity of this method
        O(1 + n + 1), which we can simplify
            O(2 + n).  When we re using the Big O Notation, we drop these constants because these constants they don't
            really matter
            O(n)

                    System.out.println();   //O(1)
                    for (var i = 0; i < numbers.length; i++)    //O(n)
                        System.out.println(numbers[i]);
                    System.out.println();   //O(1)

    What when we have 2xLoops?
        for (var i = 0; i < numbers.length; i++)    O(n)
            System.out.println(numbers[i]);

        for (var i = 0; i < numbers.length; i++)    O(n)
            System.out.println(numbers[i]);

            What does it the runtime complexity of this method?
                    O(n+n)
                        O(2n)
                            O(n)
                            This another example of drop constant, because all we need here is an approximation of the
                            cost of this algorithm relative to its input size. N or 2n represent a leaner gross.

    What if our method has 2xParameters?

        for (var i = 0; i < numbers.length; i++)    //O(n)
            System.out.println(numbers[i]);

        for (var i = 0; i < names.length; i++)      //O(m)
            System.out.println(names);

        What does it the runtime complexity?
            O(n + m)
                Once again we can simplify it to O(n) because the runtime of this method increases linearly
                    O(n)
     */

    public static void log(int[] numbers, String [] names) {
        //O (n)
        for (var i = 0; i < numbers.length; i++)    //O(n)
            System.out.println(numbers[i]);

        for (var i = 0; i < names.length; i++)      //O(m)
            System.out.println(names);
    }
}
