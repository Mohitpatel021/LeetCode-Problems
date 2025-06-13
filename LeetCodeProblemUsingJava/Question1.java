package LeetCodeProblemUsingJava;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    int i = 0;
    Map<Integer, Integer> response = new HashMap<>();
    while (i <= nums.length) {
      if (response.containsKey(target - nums[i])) {
        result[0] = response.get(target - nums[i]);
        result[1] = i;
        break;
      } else {
        response.put(nums[i], i);
      }
      i++;
    }
    return result;
  }
}
