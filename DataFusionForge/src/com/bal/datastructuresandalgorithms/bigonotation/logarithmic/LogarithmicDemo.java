package com.bal.datastructuresandalgorithms.bigonotation.logarithmic;

public class LogarithmicDemo {
    /*
    O(log n)
    Another growth rate we are going to talk about is the
        logarithmic growth
            which we are going to show with a big
                O(log n)
    Here is the logarithmic curve. Compare this with a linear curve, as we can see the linear grows at the same rate,
    but the logarithmic curve slows down at some point. An Algorithm that runs in logarithmic time is more efficient
    and more scalable that an algorithm that runs in linear or poor value time.

    Let's say we have an array of sorted number from one to ten and we want to find the number 10.
        1. One way is to iterate over loop to find 10. It's called linear search, because its runs in linear time.
        In the worst case scenario, if the number we are looking for is at the end of an array, we have to inspect every
        cell in this array to find a target number. The more items we have, the longer this operation is going to take.
            The runtime of this algorithm increases linearly and in direct proportion with the size of our array. Now,

        BINARY SEARCH
        2. Another searching algorithm called
            binary search, and this algorithm runs in
                logarithmic time. It's much faster than the linear search.
        Assuming that our array is sorted, we start of by looking at the middle item. If this item smaller or greater
        than the value we are looking for. It's smaller, our target number in this case 10. must be in the right
        partition of this array. We don't need to inspect any of the items in the left partition and with this we can
        narrow down our search by half.
        In the right partition, again we are look at the middle item, is it smaller or greater, we ignore the items on
        the left and focus on the items on the right.
        In every step, we are essentially narrowing down our search by half. With this algorithm if we have one million
        items in this array, we can find a target a maximum of 19 comparison. We don't have to inspect  every time in
        our array.
            This is logarithmic in action
                                            BINARY SEARCHING
                                          [1][2][3][4][5][6][7][8][9][10]
                                                         [6][7][8][9][10]
                                                                  [9][10]
                                                                     [10]
                                         1_000_000 items / 19 comparison

    We have logarithmic growth in algorithms where we reduce our work by half in every step.
     */
}
