package LeetCodeProblemUsingJava;

//  Question 145: Binary Tree Postorder Traversal
//  Link : https://leetcode.com/problems/binary-tree-postorder-traversal/description

import java.util.ArrayList;
import java.util.List;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Question145 {
    public List<Integer> post(TreeNode root,List<Integer>result){
        if(root==null)return result; 
        post(root.left,result);
        post(root.right,result);
        result.add(root.val);
        return result;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        return post(root,result);
    }
}
