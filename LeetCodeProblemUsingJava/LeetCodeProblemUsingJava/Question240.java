package LeetCodeProblemUsingJava;


//  Question 240: Search a 2D Matrix II
//  Link : https://leetcode.com/problems/search-a-2d-matrix-ii/description/

class Quedtion240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=(matrix.length)-1,column=0;
        while (row>=0 && column <matrix[0].length){
            System.out.printf("row=%d, col=%d%n", row, column);
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]<target){
                column++;
            }else row--;
        }

        return false;
    }
}