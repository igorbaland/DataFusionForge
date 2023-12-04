package com.bal.datastructuresandalgorithms.hashtables.working.collisions.handle;

public class OpenAddressing {
    /*
    Another strategy for handling collisions, we call it
        Open Addressing
            with this approach, we don't store values and linkedLists, we store them directly in a
                array cells or slots
    Just in Chaining we have a HashTable with five slots, and we want to store this key-value-pair.
        K=6
        V=A
            our hash function is going to return one. We should store this key-value-pair at the slot with index 1
                [1]
        K=8
        V=B
            [3]
        K=11
        V=C
            [1], but this already stored in index 1. We have collision. To solve this, we  have to look another empty
            slot. This is call
                Probing, which means searching. We have to search fo another location. And this is the reason
                    why this approach is called
                        Open Address
                            Because the address of a key-value-pair is not determined by the hash function. We have to
                            search for another empty slot.
    We have three searching or probing algorithms
        1. Linear probing
            With this algorithm, we start the current slot. If It's full, we are going to the nex slot or until we find
            an empty slot
                0 []
                1 [6,A]
     K=11       2 []    <-11, C
     V=C        3 [8,B]
                4 []
            What if we can't find any empty slots?
                That means our table is full and this is one of the drawbacks of using the open addressing strategy.
                With chaining strategy, we don't have this problem, because our linkedList can grow automatically.

            Formula for linear probing
                hash(key) + i, until we find an empty slot

            The problem with linear probing
            0[]
            1[6,A]      |
            2[11,C]     |Cluster
            3[8, B]     |
            4[] <- 16D
                These 3 items stored next to each other, form cluster. Next time we want to add a new key-value-pair
                where the key falls in this range, our probing is going to take a longer, we have to pass all these items
                in the cluster and ad the new item at the end of the cluster. As result, our cluster will get bigger
                and again, this will make future probing slower.

        2. Quadratic Probing
            To solve the problem with linear robing, we can use quadratic probing. Quadratic means - square
            Formula for quadratic probing
                hash(key) + i²
            How it solves our problem?
                Linear probing          Quadratic probing
                    hash(key) + 1       hash(key) + i²
                    1                   1
                    2                   4
                    3                   9
                    4                   16
                    5                   25

                hash(key) + i² % table_size
                    The quadratic probing solves the clustering problem, but we have another problem. Because we are
                    doing the jump to find an empty slot and we may end with an infinite loop
                    1[]
                    4[]
                    9[]
                    1[]
                    4[]
                    9[]


        3. Double Hashing
            Problem of quadratic Probing, this is where double hashing comes to the rescue. With this algorithm instead
            of i², we use the separate independent hash function to calculate the number of steps. Here is popular
            second hash function
                hash2(key) = prime - (key % prime)
                    This prime we have here should be a prime number smaller then the size of our table. Experts have
                    figured out that this formula works well. Here is how we can calculate the index using the double
                    hashing algorithm
                        hash1(key) + i * hash2(key)) % table_size
                        We start with an initial hash value
                            (hash1(key)
                        Now we need to calculate the steps
                            i * hash2(key))
                                (Linear: i)
                                (Quadratic: i²)
                                (Double: i * hash2)
                        Finally we should apply the modules operator
                            % table_size
                                to reduce the result

            hash1(key) = key % table_size

            hash2(key) = prime - (key % prime)
                the prime should be a prime number smaller than the table size. In this example we should use 3
                    has2(key) = 3 - (key % 3)

            index = (hash1 + i*hash2) % size
                calculating index

        0[]
        1[] 6,A
        2[]
        3[] 8,B
        4[]
        11,C we have a collisions
            hash2(11) = 3 - (11 % 3) = 1
                index = (1 + 1*1) % 5 = 2
                    11,C we should store at index 2
        What is when the slots are full? Then we increment i until we find a new empty location. This is how
            double hashing works.
        In this example we have a cluster. This is why we are working with a small array. For a larger array, we will
        see that this key-value-pairs will be spread out.


     */
}
