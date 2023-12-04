package com.bal.datastructuresandalgorithms.hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    /*
    A green Apple
        G
    Looking of items quickly
        HashTable
            in Java HashMap
                a=2
    (whitespace) =2
                g=1

    */
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for(var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }

    public char firstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for(var ch : str.toCharArray()) {
            if (set.contains(ch))
                return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
