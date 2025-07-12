package LeetCodeProblemUsingJava;

// Question 167 :  Two Sum II - Input Array Is Sorted
// Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class Question167 {

  public int[] twoSum(int[] numbers, int target) {
    int[] arr = new int[2];
    int start = 0;
    int end = numbers.length - 1;
    while (start < end) {
      int sum = numbers[start] + numbers[end];
      if (sum == target) {
        arr[0] = ++start;
        arr[1] = ++end;
        break;
      } else if (sum < target) {
        start++;
      } else {
        end--;
      }
    }
    return arr;
  }
}
