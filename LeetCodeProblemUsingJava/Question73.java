package LeetCodeProblemUsingJava;

import java.util.HashSet;
import java.util.Set;
//  Question 73 :  Set Matrix Zeroes
//  Link :  https://leetcode.com/problems/set-matrix-zeroes/description/

public class Question73 {

    public void setZeroes(int[][] matrix) {
          Set<Integer>row=new HashSet<>();
          Set<Integer>col=new HashSet<>();
            
            for (int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if (matrix[i][j]==0) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            for(Integer i:row){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=0;
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(Integer j:col){
                    matrix[i][j]=0;
                }
            }
    
}
}
