package LeetCodeProblemUsingJava;

import java.util.Stack;

// Question 2108 : Min Stack
// Link : https://leetcode.com/problems/min-stack/description/

public class Question155 {

  Stack<Integer> stack;
  Stack<Integer> min_stack;

  public Question155() {
    this.stack = new Stack<>();
    this.min_stack = new Stack<>();
  }

  public void push(int val) {
    stack.push(val);
    if (!min_stack.isEmpty()) {
      min_stack.push(Math.min(val, min_stack.peek()));
    } else {
      min_stack.push(val);
    }
  }

  public void pop() {
    stack.pop();
    min_stack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min_stack.peek();
  }
}
