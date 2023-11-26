package com.bal.datastructuresandalgorithms.bigonotation.spacecomplexity;

public class SpaceComplexityDemo {
    /*
    Space complexity
    We have seen how we can use the big O notation to describe the runtime  complexity of our algorithms.
    In ideal world, we want our algorithms to be super fast and scalable, and take minimum amount of memory. But
    unfortunately, that hardly if ever happens. It's like asking for ferari fo 10 dollars. It just doesn't happen. Most
    of the time, we have to do a trade between
        saving time and saving space.
    There are times when we have more space, so we can use that  to optimize an algorithm to make it faster and more
    scalable. But there are also times where  you have limited space, like when we build an app for a small mobile
    device. In those situations we have to optimize for the space, because scalability is not a big factor. Only one
    user is going to use our application at that moment, not a million users.

    We need a way to talk about how much space an algorithm requires and that is where we use the big O notation again
        O(x)

    We have a greet method that takes an area of string and print a "hi" message for every name in this array. In this
    method we have declared a loop variable and this is independent  of the signs of the input. Whatever our input array
    has 10 or one million items, this method will only allocate some additional memory for this loop variable. It takes
        O(1) space.

        What if we declare a string array like
            String[] copy = new String[name.length];
            The length of this array is equal to the length of our input array. If our input array has a thousand items,
            this array will also have a 1000 items.

            What is the complexity of this method?
                O(n)
                    the more space we have in our method is going to take. And this is indirect proportion to the size
                    of our input array. That's why we have
                        O(n)
    By the way, when we talk about space complexity, we only look at the additional space that we should allocate
    relative to the size of the input. We always have the input of size n, we don't count it. We just analyze how much
    extra space we need to allocate for this algorithm.

     */
    public static void greet(String[] names) {
        String[] copy = new String[names.length];

        for (var i = 0; i < names.length; i++)
            System.out.println("Hi " + names[i]);
    }
}
