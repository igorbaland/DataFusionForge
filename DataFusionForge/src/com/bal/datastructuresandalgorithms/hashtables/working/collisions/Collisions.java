package com.bal.datastructuresandalgorithms.hashtables.working.collisions;

public class Collisions {
    /*
    Two distinct keys generate the same hash value

        key1 --->
                    hash function   ---> address
        key2 --->

    2 ways to handle collisions
        1. to have each cell in our array pointed to a linkedList, if we have a collision, we are simply add the new
            item at the end of the linkListed. That is what we call
                chaining, because we are chaining these items
        2. open addressing,
            we are finding a new address to store the second value. There are different an open addressing algorithms
            and  we are going look at them over few section.

     */
}
