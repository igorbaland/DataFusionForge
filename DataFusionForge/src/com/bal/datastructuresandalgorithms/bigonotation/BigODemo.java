package com.bal.datastructuresandalgorithms.bigonotation;

public class BigODemo {
    /*
    We us big O to describe the performance of an algorithm and this helps us determine if a given algorithm is scalable
    or not. Which basically means is an algorithm going to scale well as the input grows really large. Just because our
    code execute quickly on our local computer doesn't mean it's going to perform well when we give it a large data set.

    That is why use the big O Notation to describe the performance of an algorithm.
    What does this have to do with data structures?
        Certain operation can be more or less costly depending on what data structure we use. For example, accesing an
        array element by it's index is super fast.
                Array
                [][][]
        But arrays have a fixed length and if we want constantly add or remove items, they have to get resized and this
        will get costly as the size of our input grows very large. If that's what we need to do, then we have to use
        another data structured called
            Linked List
            [][] --> [][] --> [][]
        These data structure can grow or shrink very quickly, but accessing a linked list element by its index is slow.

    So that's why wee need to learn about big O Notation first, before we can talk about various data structures.

     */
}
