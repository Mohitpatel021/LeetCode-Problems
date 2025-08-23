package LeetCodeProblemUsingJava;


//  Question 100. Same Tree
//  Link : https://leetcode.com/problems/same-tree/description/

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
class Question100 {
    public boolean dfs(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null ||q==null) return false;
        return (p.val==q.val && dfs(p.left,q.left) && dfs(p.right,q.right));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return dfs(p,q);
    }
}
