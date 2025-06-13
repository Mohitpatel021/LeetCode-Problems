package LeetCodeProblemUsingJava;

public class Question11 {

  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max_area = 0;
    while (left < right) {
      //If work like  Length*breadth
      //Length is the distance between left and right
      //Breadth is the minimum of the two heights
      int area = Math.min(height[left], height[right]) * (right - left);
      max_area = Math.max(area, max_area);
      if (height[left] > height[right]) {
        right--;
      } else if (height[left] < height[right]) {
        left++;
      } else {
        right--;
        left++;
      }
    }
    return max_area;
  }
}
