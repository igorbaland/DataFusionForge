package com.bal.datastructuresandalgorithms.bigonotation.quadratic;

public class QuadraticDemo {
    /*
    O(n^2)

    Here we have nested loops. This is the algorithm that we use for printing all combinations of items in array.

    What does it runtime complexity here?
        In our outer loop, we are iterating over our input array1. O(n)
            In each iteration, we are iterating over all items in array2. O(n)
                Complexity of this method
                    O(n * n) or
                        O(n ^ 2)
                            We say this algorithm runs in
                                Quadratic time.
    As we can see in diagram. Algorithms that run in
        O(n ^ 2) Quadratic time, is slower than algorithms that run in  O(n) linear time

    Of course this depends of the size of the input. If we are dealing  with an array let's say 50 items, we are not
    going to see any differences. But as our input grows larger and larger, algorithms that run in O(n ^ 2) squared get
    slower and slower.

    What if we had another loop before or after this loop.
        for(var number : numbers)           //O(n)
            System.out.println(number);

        for(var first : numbers)            //O(n)
            for(var second: numbers)        //O(n)
                System.out.println(first + ", " + second);

        What is the runtime complexity of this method?
            O(n + n ^ 2)
                Once again we can simplify this. The square of number is always greater than the number of itself. In
                this expression n^2 always goes the n. Use big O notation to understand how much the cost of algorithm
                increases. All we need is an approximation not an exact value. here we can drop n and conclude that this
                method runs
                    O(n ^ 2)

    Another example wit 3* nested loops
    The runtime complexity is now
        O(n ^ 3)
            As we can imagine, this algorithm gets far a slower than an algorithm with O(n ^ 2)

     */
    public static void log(int[] numbers) {
        for(var first : numbers)            //O(n)
            for(var second: numbers)        //O(n)
                for(var third: numbers)     //O(n)
                System.out.println(first + ", " + second + ", " + third);
    }

}
