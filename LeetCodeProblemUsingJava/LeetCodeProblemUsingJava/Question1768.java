package LeetCodeProblemUsingJava;

//  Question 392 : Merge Strings Alternately
//  Link :  https://leetcode.com/problems/merge-strings-alternately/description/

public class Question1768 {

  public String mergeAlternately(String word1, String word2) {
    int i = 0, j = 0;
    StringBuilder res = new StringBuilder("");
    while (i < word1.length() && j < word2.length()) {
      res.append(word1.charAt(i++)).append(word2.charAt(j++));
    }
    if (i < word1.length()) {
      res.append(word1.substring(i));
    } else if (j < word2.length()) {
      res.append(word2.substring(j));
    }
    return res.toString().trim();
  }
}
