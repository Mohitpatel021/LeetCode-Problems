package LeetCodeProblemUsingJava;

public class Question189 {

  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public void reverse(int[] num, int start, int end) {
    while (start < end) {
      int temp = num[start];
      num[start] = num[end];
      num[end] = temp;
      start++;
      end--;
    }
  }
}
