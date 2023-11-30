package com.bal.datastructuresandalgorithms.linkedlists;

public class WhatAreLinkedLists {
    /*
    We use linked lists
      to store a list of objects
        in sequence
    But unlike  arrays, linked lists can
      grow and shrink automatically

      [10][] --> [20][] --> [30][]
      As we can see here, a linked lists consists of a group  of notes in sequence. Each note holds two pieces of data,
        1. piece
            value
        2. piece
            address
            [10][address]
            of next node in the list. We say each node points to or references the next node. That's why we refer to
            these structures as linked lists, because these notes are linked together.
    We call the first note HEAD and the last TAIL
        HEAD                    TAIL
       [10][] --> [20][] --> [30][]

    Type complexity of various operations
        Let's say we want to find out if our list contains a given number. We have to traverse the list, starting from
        the head to tail.
        LOOKUP by
            value O(n)
                Because the value of what we are looking for may be stored in the last node. That is our worst case
                scenario

            index O(n)
                unlike arrays, where items are stored sequentially, the nodes of a linked lists can be all over the
                place in memory, they may not be exact to each other. That's why each node needs to keep a reference to
                the next node. For this reason, unlike arrays, we cannot quickly look up an item by it's index. We have
                to traverse the list until we find that item. In the worst case scenario, that item can be end of the
                list.
            insert
                from  the end
                    O(1)
                it depends where we want to insert item. If we want to insert a new item at the end, we simply create
                a new node and have the last node or the tail point it. We should a reference to the last node somewhere
                We don't have to traverse the list every time. We need to tell the tail a references  this new node.
                Inserting a new item at the end is an
                    At the end O(1)
                         [10][] --> [20][] --> [30][]
                                                    TAIL [][]

                at the beginning
                    O(1)
                we should have a reference to the Head of the first node. To insert a new item at the beginning of the
                list, we create a new node, link it to the first node and then change the head to point to this new node.
                It is very fast. Unlike arrays we don't have to copy or shift items around. We simply update the links
                or references .

                in the middle
                    O(n)
                first we need to find the node that's of O(n) operation, then we have to update the links which is an
                    O(1) operation. inserting an item in the middle is an O(n).
            delete from the
                beginning
                    O(1)
                    Deleting the first item is super fast. We simply set the head to point to the second node. That is
                    1 operation. We should also remove the link from the previous head, it doesn't reference the second
                    node anymore.
                        Why? Because if we don't do this , Java's garbage collector thinks this item is still
                    used. It won't remove it from the memory. That is why we should unlink this object from the second
                    object
                end
                    O(n)
                    This one is a bit tricky. We can easily get the tail, but we need to know the previous node, so we
                    can have the tail point to that node.
                        How can we do that? We have to traverse the list from the head all the way to the tail. as soon
                        as we get to the node before the last node, we keep a reference to it as the previous node. The
                        we will unlink this node from the last node. Finally have the tail point to the previous node.
                        So the runtime complexity here is O(n), because we have to traverse the list all the way until
                        the end.
                middle
                    O(n)
                    We have to traverse the list to find out the node, as well as the previous node. we should link the
                    previous node to the node after this node and then remove this link. This object  get from memory
                    by java's garbage collector.

     */
}
