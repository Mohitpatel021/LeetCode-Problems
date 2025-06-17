package LeetCodeProblemUsingJava;

import java.util.Stack;

//   Question 20 :  Valid Parantheses
//  Link : https://leetcode.com/problems/valid-parentheses/

public class Question20 {

  class Solution {
    static {
      for (int i = 0; i < 500; i++) {
        isValid("()");
      }
    }

    public static boolean isValid(String s) {
      Stack<Character> res = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
          res.push(s.charAt(i));
        } else {
          if (res.empty()) return false;
          char c = res.peek();
          if (c == '[' && s.charAt(i) != ']') return false; else if (
            c == '(' && s.charAt(i) != ')'
          ) return false; else if (c == '{' && s.charAt(i) != '}') return false;
          res.pop();
        }
      }
      return res.empty();
    }
  }
}
