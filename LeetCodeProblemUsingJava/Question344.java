package LeetCodeProblemUsingJava;

//   Question 344 :  Reverse String
//  Link : https://leetcode.com/problems/reverse-string/description/

public class Question344 {

  public void reverseString(char[] s) {
    int start = 0;
    int end = s.length - 1;

    while (start <= end) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
  }
}
