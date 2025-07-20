package LeetCodeProblemUsingJava;
// Question 509: Fibonacci Number
// Link : https://leetcode.com/problems/fibonacci-number/description/

class Question509 {
    public int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 2) + fib(n - 1);
    }
}
