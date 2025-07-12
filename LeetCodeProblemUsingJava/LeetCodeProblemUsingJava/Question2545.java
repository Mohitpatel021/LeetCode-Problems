package LeetCodeProblemUsingJava;

import java.util.Arrays;
//  Question 2545: Sort the Students by Their Kth Score
//  Link :  https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/

public class Question2545 {
      public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(s1,s2)-> Integer.compare(s2[k],s1[k]));
        return score;
    }
}
