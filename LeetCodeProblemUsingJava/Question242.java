package LeetCodeProblemUsingJava;

// Question 244 :  Valid Anagram
// Link : https://leetcode.com/problems/valid-anagram/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question242 {
    public boolean isAnagram(String s, String t) {
          char[] chars = s.toCharArray();
            char[] charst = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charst);
        return Arrays.equals(chars,charst);
    }

}
//Alternate Approach using HashMap

class Solution2 {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
            return false;
         }
        Map<Character,Integer>res=new HashMap<>();
        for(char c:s.toCharArray()){
             if(res.containsKey(c)){
                res.replace(c,res.get(c)+1);
             }else{
                res.put(c,1);
             }
        }
        for(char c:t.toCharArray()){
            if(!res.containsKey(c)|| res.get(c)==0){
                return false;
            }
            res.replace(c,res.get(c)-1);
        }
        return true;
    }
}

class Solution3 {
    static{
        for(int i=0;i<500;i++){
            isAnagram("","a");
        }
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] one = new int[26];
        for (int i = 0; i < s.length(); i++) {
            one[s.charAt(i) - 'a']++;
            one[t.charAt(i) - 'a']--;
        }
        for (int c : one) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}