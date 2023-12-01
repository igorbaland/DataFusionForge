package com.bal.datastructuresandalgorithms.stacks.expressions;

public class BalancedExpressionDemo {
    /*
    Balance String
        In this expression we have
            an opening or left bracket, follow by
            a closing or right bracket
                this is what we call a balance string
    What if we didn't terminate with a closing bracket
        "(1 + 2"
            now this string is not balance
    What if we have a closing an angle brackets
        "(1 + 2>"
            this string is not balance
        ")1 + 2("

        "(([1] + <2>))[a]"
            We are not necessary working with arithmetic expression, we are working with expression that include a bunch
            of characters and brackets. This can be a new programming language and we could be design the future. With
            stacks, we can change the syntax of this expression and see if this expression is
                balanced or not.

    Edge cases
    (
    (()
    )(
    (>
     */
    String str = "(1 + 2)";


}
