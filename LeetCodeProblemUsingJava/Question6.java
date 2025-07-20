package LeetCodeProblemUsingJava;

import java.util.ArrayList;
import java.util.List;


//  Question 6: Zigzag Conversion
//  Link : https://leetcode.com/problems/zigzag-conversion/description/

class Quedtion6 {
    public String convert(String s, int numRows) {
        if(numRows==1|| numRows>=s.length()){
            return s;
        }
       List<Character>[] rows=new ArrayList[numRows];

        int idx=0,d=1;
       for(int i=0;i<numRows;i++){
        rows[i]=new ArrayList<>();
       }
       for(char c:s.toCharArray()){
         rows[idx].add(c);
         if (idx==0){
            d=1;
         }else if(idx==numRows-1){
            d=-1;
         }
         idx+=d;
       }
       StringBuilder result=new StringBuilder();
       for(List<Character>row:rows){
            for(char c:row){
                result.append(c);
            }
       }
       return result.toString();
    }
}