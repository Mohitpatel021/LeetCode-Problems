package LeetCodeProblemUsingJava;

import java.util.LinkedList;
import java.util.Queue;


// Question 225 : Implement Stack using Queues
// Link : https://leetcode.com/problems/implement-stack-using-queues/description/


public class Question225 {
    private Queue<Integer> q;
    public Question225() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
