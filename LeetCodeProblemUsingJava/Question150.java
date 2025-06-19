package LeetCodeProblemUsingJava;

import java.util.Stack;

// Question 150 : Evaluate Reverse Polish Notation
// Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/

public class Question150 {

  public int evalRPN(String[] tokens) {
    Stack<Integer> res = new Stack<>();
    for (String s : tokens) {
      if (s.equals("+")) {
        res.add(res.pop() + res.pop());
      } else if (s.equals("-")) {
        int a = res.pop();
        int b = res.pop();
        res.add(b - a);
      } else if (s.equals("*")) {
        res.add(res.pop() * res.pop());
      } else if (s.equals("/")) {
        int a = res.pop();
        int b = res.pop();
        res.add((int) b / a);
      } else {
        res.push(Integer.parseInt(s));
      }
    }
    return res.pop();
  }
}
