package com.bal.datastructuresandalgorithms.arrays.exercisearrayclass;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int [length];
    }


    public void reverse() {
        int[] newItems = new int[count];

        for(int i = 0; i < count; i++)
            newItems[i] = items[count - i - 1];

        items = newItems;
    }

    public int max() {
        int max = 0;
        for (var item : items)
            if (item > max)
                max = item;
        return max;
    }

    public Array intersect(Array other) {
        var intersection = new Array(count);

        for(int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);
        return intersection;
    }

    public void insert (int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for(int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;

    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i++];

        count--;
    }

    public int indexOf(int item) {
        for (var i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        for (var i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
