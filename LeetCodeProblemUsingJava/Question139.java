package LeetCodeProblemUsingJava;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Question 139 :Word Break
// Link : https://leetcode.com/problems/word-break/description/

public class Question139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        Set<String> set = new HashSet<>(wordDict); //m
        for(int i=1;i<=s.length();i++){ //n
            for(int j=0;j<i;j++){ //n
                String word = s.substring(j,i); //n
                if(set.contains(word)&&dp[j]==true){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
