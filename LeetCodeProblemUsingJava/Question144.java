package LeetCodeProblemUsingJava;

import java.util.ArrayList;
import java.util.List;

//  Question 144: Binary Tree Preorder Traversal
//  Link : https://leetcode.com/problems/binary-tree-preorder-traversal/description

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
class Question144 {
    public void preOrder(TreeNode root,List<Integer> result){
        if(root==null) return;
        result.add(root.val);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
         preOrder(root,result);
         return result;
    }
}
