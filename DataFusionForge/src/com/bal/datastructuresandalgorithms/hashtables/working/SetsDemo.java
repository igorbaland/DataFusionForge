package com.bal.datastructuresandalgorithms.hashtables.working;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    /*
    In java and many others languages, we have a data structure that is similar to HashMap or HashTables
        but slightly different
            Map(HashMap), that basically map key -> value
            Sets: only have keys, they don't have values
                What is the point?
                    they are actually very useful in solving a lot of problems because sets just like maps don't allow
                    duplicate keys.
                    [1, 2, 3, 3, 2, 1]
                    We wont to remove this duplicate, all we have to do
                        get it item and set it to
                        a Set
                            most of the time we use
                                HashSet
     */
    public static void show() {
        Set<Integer> set = new HashSet<>();
        int[] numbers = { 1, 2, 3, 3, 2, 1, 4};
        for (var number : numbers)
            set.add(number);
        System.out.println(set);
    }
}
