package LeetCodeProblemUsingJava;

import java.util.ArrayList;
import java.util.Arrays;
//  Question 345: Reverse Vowels of a String
//  Link : https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class Question345 {

    public String reverseVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));
       int i=0,j=s.length()-1;
       char[] res=s.toCharArray();
       while(i<j){
        if(vowel.contains(res[i])&& vowel.contains(res[j])){
            char temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;
            j--;
        }else if(vowel.contains(res[i])&& !vowel.contains(res[j])){
            j--;
        }else if(!vowel.contains(res[i])&& vowel.contains(res[j])){
            i++;
        }else{
            i++;
            j--;
        }
       }
       return new String(res);
    
}
}
