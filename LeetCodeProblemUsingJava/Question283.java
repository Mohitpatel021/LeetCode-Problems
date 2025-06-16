package LeetCodeProblemUsingJava;


//  Question 283 :  Move Zeroes
//  Link : https://leetcode.com/problems/move-zeroes/description/

public class Question283 {

  public void moveZeroes(int[] nums) {
    int zero = 0;
    int non_zeros = 0;
    while (non_zeros < nums.length) {
      if (nums[zero] == 0 && nums[non_zeros] == 0) {
        non_zeros++;
      } else {
        int temp = nums[non_zeros];
        nums[non_zeros] = nums[zero];
        nums[zero] = temp;
        zero++;
        non_zeros++;
      }
    }
  }
}
