package com.bal.datastructuresandalgorithms.linkedlists.typeoflinkedlists;

public class TypeLinkedLists {
    /*
    2xTypes of linked lists
        1. Singly
            Every node has a reference or a pointer to the next node.
            [][]-->[][]-->[][]
                Delete from the end
                    O(n)
        2. Doubly
            Each node also has a reference to it's previous node.
            [][]-->[][]-->[][]
                <--    <--
                Benefit
                Delete from the end
                    O(n)
                Cost
                    each node have an extra field to hold the address of a precious node.
                        Take more space
                            But this can be negligible for the performance will get when removing an item from the end

    Both singly and doubly lists can be circular which means the last node will reference the first node.
        What is the benefit of circular reference?
            We can use this lists, when we need a circle.
                For example, imagine we want to build a music player. We give it a playlist and it play each song in the
                list. After it reaches the last song it will start over, that is where we have a circle.


     */
}
