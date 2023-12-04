package com.bal.datastructuresandalgorithms.hashtables.working;

import java.util.HashMap;
import java.util.Map;

public class HashTableDemo {
    /*
    In Java
        map interface
            HashMap
                is the most of the time

            Key: EmployeeNumber (Integer)
            Value: Name (String)

    Difference between
        containsValue()
            O(n)
        containsKey()
            O(1)
     */
    public static void show() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mike");
        map.put(2, "John");
        map.put(3, "Marry");
        //the previous value was overwritten with a new value. In HashMap we cannot have duplicate keys.
        map.put(3, "Mariane");
        //4=null
        map.put(4, null);
        //null=null
        map.put(null, null);
        map.remove(null);
        // return value, <String> object
        var value = map.get(3);
        System.out.println(value);
        System.out.println(map);
    }



}
