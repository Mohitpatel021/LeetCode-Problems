package LeetCodeProblemUsingJava;

// Question 125 : Valid Palindrome
// Link : https://leetcode.com/problems/valid-palindrome/description/

public class Question125 {

  public boolean isPalindrome(String res) {
    res = res.toLowerCase().replaceAll("[^a-z0-9]", "");

    int i = 0;
    int j = res.length() - 1;
    while (i < j) {
      if (res.charAt(i) != res.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
