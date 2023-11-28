package com.bal.datastructuresandalgorithms.arrays;

import java.util.Arrays;

public class IntroductionDemo {
    /*
    Arrays are built into most programming languages and we use them to store a list of item sequentially
    In this section
        Overview of array
            strengths and weaknesses of arrays

        How to use array in java

        Building an array

    Understanding arrays
    Arrays are the simplest data structures and we use them to store a list of items like a list of strings, numbers,
    objects and literally anything. These items get stored sequentially in memory. For example, if we allocate an array
    of five integers, these integers get stored in memory like this
        [10][20][30][40][50]
    Let's say the address of the first item in memory is one hundred. As we probably know integer takes four bytes. The
    second item would be stored at the memory 104, the third 108 and so on. For this reason looking up items in array is
    super fast.
allocation memory        100  104  108...       Integer > 4 bytes
                        [10]  [20] [30][40][50]
    We give our array an index and it will figure out where exactly in memory we should access.

    What do we thin is the runtime complexity of this operation?
        Lookup O(1)
            Because the calculation of the memory address is very simple. It doesn't involve any loops or complex logic.
            If we need to store the list of items and access them by their index, arrays are the optimal data
            structures for us.

    Let's look at the limitation or weaknesses arrays
    In java and many other languages arrays are
        static
            which means when we allocate them, we should specify their size and this size cannot change later. We need
            to know of time how many items we want to store in an array.
    What if we don't know? We have to make a guess. If our guess is too large,  we will waste memory, because have cells
    that are never filled. If our guess is too small, our array gets filled quickly than to add another item we will
    have to resize this array, which means we should allocate a larger array and then copy all the items in the old
    array into a new array. This operation can be costly.
    The runtime complexity of copy an arrays operation
    Let's say our array has 5 items. Now we want to add a six item. We have to allocate a new array, and copy all of
    these five items into that new array. The runtime complexity of this operation is
        Insert O(n). Linearly
        Which means, the cost of copying these items into a new array increases  linearly and indirect
        proportion to the size of the array.

    Removing an item
    Here we have a couple of different scenarios. If we want to remove the last item, that is pretty easy, we can look
    it up by index and clear the memory.
        Delete O(1)
            Which is the best case scenario. But when doing Big O analysis, we should think about the worst case
            scenario. What is the worse case scenario here?
                This is when we want to remove an item from beginning of the array. We have to shift all the items on
                the right, one step to the left to fill hole. The more items we have, the more the shifting operation
                is going to cost. For the worst case scenario, deletion is
                    O(n)
    Because arrays have a fixed size, in situation where we don't know ahead of time, how many items we want to store in
    them or when we need to add  or remove a lot of items from them, they don't perform all. In worst cases, we use
    LinkList

    int[] numbers = new int [3];
    System.out.println(numbers);
    Output: combination of a type of array followed by @ and then this value  that is generated based on the address of
    this object in memory. That is not useful. We want to see the content of this array. To do that, we are going to use
    the
        Arrays
            java.util package
                toString()
                    this method convert it to a string

     */

    public static void workingWithArray() {
        //shorter and cleaner way to initialize our array
        int[] numbers = {10, 20, 30};
//      int[] numbers = new int [3];
//        numbers[0] = 1;
//        numbers[1] = 2;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
