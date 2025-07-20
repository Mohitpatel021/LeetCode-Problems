package LeetCodeProblemUsingJava;

//  Question 392 : Merge Strings Alternately
//  Link :  https://leetcode.com/problems/merge-strings-alternately/description/

public class Question1672 {

  public int maximumWealth(int[][] accounts) {
    int max_w = 0;
    for (int i = 0; i < accounts.length; i++) {
      int sum = 0;
      for (int j = 0; j < accounts[0].length; j++) {
        System.out.println(accounts[i].length);
        sum += accounts[i][j];
      }
      max_w = Math.max(max_w, sum);
    }
    return max_w;
  }
}
