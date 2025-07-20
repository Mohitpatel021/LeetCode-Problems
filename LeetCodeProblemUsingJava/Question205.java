package LeetCodeProblemUsingJava;

import java.util.HashMap;
import java.util.Map;

// Question : 205. Isomorphic Strings
// Link : https://leetcode.com/problems/isomorphic-strings/description/
public class Question205 {

  public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> res = new HashMap<>();
    Map<Character, Character> res2 = new HashMap<>();
    int i = 0, j = 0;
    while (i < s.length() && j < t.length()) {
      char char1 = s.charAt(i);
      char char2 = t.charAt(j);
      if (res.containsKey(char1) && !res.get(char1).equals(char2)) {
        return false;
      }
      if (res2.containsKey(char2) && !res2.get(char2).equals(char1)) {
        return false;
      } else {
        res.put(char1, char2);
        res2.put(char2, char1);
        i++;
        j++;
      }
    }
    return true;
  }
}
