package com.bal.datastructuresandalgorithms.bigonotation.constant;

public class ConstantDemo {
    /*
    This method takes an array of integers and prints the first item on the console. It doesn't matter how big the array
    is.

    We can have an array one or one million items. All we are doing here is printing the first item. This method has a
    single operation and takes  a constant amount of time to run. We don't care about the exact execution time in
    milliseconds, because that can be different from one machine to another or even on the same machine. All we care
    about is that this methode runs in constant time and represent it using the big
        O(1)
            System.out.println(numbers[0]);
    This is the runtime complexity of this method. In this example, the size of our input doesn't matter, this method
    will always run in constant time or
        O(1)

    What if we duplicate this line? Here we have two operations,
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    both these operations run inconstant time, the runtime complexity of this method is
        O(2)
    When we are talking about the runtime complexity, we don't really care about the number of operations, we just want
    to know how much an algorithm slows down as the input  grows larger.

    In this example, whenever we have one or one million items our method runs in constant time. We can simplify this by
    writing down O(1)
        meaning constant time

     */

    public static void log(int[] numbers) {
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }
}
