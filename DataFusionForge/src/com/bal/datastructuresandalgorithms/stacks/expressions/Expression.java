package com.bal.datastructuresandalgorithms.stacks.expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> LEFT_BRACKETS =
            Arrays.asList('(', '<', '[', '{');
    private final List<Character> RIGHT_BRACKETS =
            Arrays.asList(')', '>', ']', '}');
    private String input;

    public Expression(String input) {
        this.input = input;
    }

    public boolean  isBalanced() {

        Stack<Character> stack = new Stack<>();

        for (var ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top =stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return LEFT_BRACKETS.contains(ch);
    }

    private boolean isRightBracket( char ch) {
        return RIGHT_BRACKETS.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return LEFT_BRACKETS.indexOf(left) == RIGHT_BRACKETS.indexOf(right);
    }
}
