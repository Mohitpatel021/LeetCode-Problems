package LeetCodeProblemUsingJava;

import java.util.Stack;

// Question 232 : Implement Queue using Stacks
// Link : https://leetcode.com/problems/implement-queue-using-stacks/description/

public class Question232 {
   
    private Stack<Integer> input;
    private Stack<Integer> output;

    public Question232() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

}
