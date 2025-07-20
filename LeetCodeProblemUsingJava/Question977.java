package LeetCodeProblemUsingJava;

// Question 977 : Squares of a Sorted Array
// Link : https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class Question977 {
    public int[] sortedSquares(int[] nums) {
        int[]res= new int[nums.length];
        int l=0,r=nums.length-1,index=nums.length-1;

        while (l<=r){
            if(nums[l]*nums[l]>nums[r]*nums[r]){
                res[index]=nums[l]*nums[l];
                l++;
                index--;
            }else{
                res[index]=nums[r]*nums[r];
                r--;
                index--;
            }
        }
        return res;
    }

}
