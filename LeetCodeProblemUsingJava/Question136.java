package LeetCodeProblemUsingJava;

// Question 136 :  Single Number
// Link : https://leetcode.com/problems/single-number/description/

public class Question136 {

    public int singleNumber(int[] nums) {
        int s=nums[0];
        for(int i =1;i<nums.length;i++){
            s^=nums[i];
        }
        return s;
    }
}