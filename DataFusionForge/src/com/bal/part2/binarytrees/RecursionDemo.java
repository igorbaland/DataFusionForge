package com.bal.part2.binarytrees;

public class RecursionDemo {
    /*
    Recursion is a powerful programming technic for implementing repetition, jus like loops, but it works a bit
    differently

    Let's say, we want to calculate the factorial of number.
        Factorial is a math concept.
            4! = 4 x 3 x 2 x 1
            factorial of 3
            3! = 3 x 2 x 1

    Recursion is another approach for implementing repetition in our code, but without using a loop
            4! = 4 x 3!
            n! = n x (n - 1)!

            in this method
                factorialRecursion
                    we are calling the  method itself
                        this called
                            RECURSION
    Recursion happens, when a function or a method calls itself. We referred to this method as a
        recursive method

    The problem with this implementation, we have a cycle. Because we are going to repetitively call this factorial
    method forever.
    public static int factorialRecursion(int n) {
        return n * factorialRecursion(n -1);
    }
        factorialRecursion(3)
            3 x f(2)
                2 x factorialRecursion(1)
                                        1 x factorialRecursion(0)   is going to go forever
     Mathematically speaking, we can only calculate factorial for positive numbers, we don't have factorial of negative
     one or negative 2.
        What is factorial of 0?
            that is 1

            if (n == 0)
                return 1;
                It is what we call
                    base condition
                        which is basically the way to terminate the recursion. Without the base condition, the recursion
                        is going to go forever
    JVM
        uses a stack to manage this. Every time we have a recursive call, java is going to keep track of the value of
        these variables in a stack.
     */

    public static int factorialRecursion(int n) {
        if(n == 0)
            return 1;
        var result = n * factorialRecursion(n -1);
        System.out.println(result);
        return result;
    }

    public static int factorial(int n) {
        //iteration factoring, because we are using a loop
        var factorial = 1;
        for(var i = n; i > 1; i--)
            factorial *= i;
        return factorial;
    }
}
