package com.bal.datastructuresandalgorithms.hashtables.working;

public class HashFunctionDemo {
    /*
    hashFunctions is a function that gets value and maps it to a different  kind of value, which we call a hash value,
    hash code or just hash. In the context of data structures, a hash function maps a key value to an index value.
    map.put(1, "Max");
    items[1] = "Max";
    What is with very large number?
        map.put(123456, "Max");
            and we only have 100 employees. We don't want to create a super large array. Let's say our array has a
            capacity of 100 items.
            We should map the key number between 0 - 99.
            How can we do this? range 0 - 99
                We use the modulus operator, we calculate division of key and size our array

            The simplest implementation of a hash function.
                public static int hash(int number) {
                    return number % 100;
                }
                    Output: 56
                    We should store value="Max" on index 56

    What is when our keys are Strings?
         map.put("12345-A", "Max");
            How can we convert this to an index?
                Every character in computers is represented by a number internally. we can get the numeric
                representation of each character, add them all together and then we have a big number.
                public static int hash(String key) {
                    int hash = 0;
                    for (var ch : key.toCharArray())
                        hash += ch;
                    return hash;
                }
                The hash of this long string is 419. But our array has a limit of 100 items.
                    return hash % 100;
                        at index 19 we should store this employee

    This is a super simplified  implementation. There is so many algorithms for calculating hashes. These algorithms are
    used in cryptography. For example, when storing people's password, we don't want to store them in plain text. We
    pass them to hash function. And this hash function will generate a long, complicated string based on the password.
    Sometimes like this 543478dgdhgh6545hjlzu. This will be hash value

     */

    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }
}
