package LeetCodeProblemUsingJava;

// Question 2108 : Find First Palindromic String in the Array
// Link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

public class Question2108 {

  public String firstPalindrome(String[] words) {
    for (String s : words) {
      int i = 0;
      int j = s.length() - 1;
      while (i <= j) {
        if (s.charAt(i) == s.charAt(j)) {
          i++;
          j--;
        } else break;
      }
      if (i > j) {
        return s;
      }
    }
    return "";
  }
}
