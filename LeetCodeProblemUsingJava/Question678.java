package LeetCodeProblemUsingJava;

// Question 678 : Valid Parenthesis String
// Link : https://leetcode.com/problems/valid-parenthesis-string/description/
public class Question678 {
  public boolean checkValidString(String s) {
    int min = 0, max = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        min++;
        max++;
      } else if (c == ')') {
        min = Math.max(min - 1, 0);
        max--;
      } else {
        min = Math.max(min - 1, 0);
        max++;
      }
      if (max < 0) return false;
    }
    return min == 0;
  }
}
