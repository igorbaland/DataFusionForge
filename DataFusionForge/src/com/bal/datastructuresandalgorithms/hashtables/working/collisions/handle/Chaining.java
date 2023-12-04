package com.bal.datastructuresandalgorithms.hashtables.working.collisions.handle;

public class Chaining {
    /*
    Handle collision
        Chaining
            which involves using a linkedList to store multiple items at the same array index.

    Real example
    Let's say the size of our hashTable is five.
    We refer to the cells as
        Bucket or
        Slots
            Initially, all our buckets are null or empty. Now we want to store this key value pair in a HashTable
            key=6
            value=A
            We pass the key to ou hash function. Our HashFunction will return the reminder of division of 6 by five,
            which is one. We should store this value at index one.
            key=8
            V=B

                0 []
                1 [] -> A -> C
                2 []
                3 [] -> B
                4 []
     */
}
