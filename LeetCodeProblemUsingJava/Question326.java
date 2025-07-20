package LeetCodeProblemUsingJava;


// Question 326 :   Power of Three
// Link : https://leetcode.com/problems/power-of-three/description/

public class Question326 {
     public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n==0)return false;
        else return (n%3==0) && isPowerOfThree(n/3);
    }
}
