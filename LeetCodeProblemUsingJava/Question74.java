package LeetCodeProblemUsingJava;

//  Question 74 :  Search a 2D Matrix
//  Link :  https://leetcode.com/problems/search-a-2d-matrix/description/

public class Question74 {

  public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int top = 0, bottom = rows - 1;
    int mid_row = -1;
    while (top <= bottom) {
      mid_row = (top + bottom) / 2;
      if (target > matrix[mid_row][matrix[0].length - 1]) {
        top = mid_row + 1;
      } else if (target < matrix[mid_row][0]) {
        bottom = mid_row - 1;
      } else {
        break;
      }
    }
    int l = 0, r = cols - 1;
    while (l <= r) {
      int mid = (l + r) / 2;
      if (target == matrix[mid_row][mid]) {
        return true;
      } else if (target < matrix[mid_row][mid]) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }

    return false;
  }
}
