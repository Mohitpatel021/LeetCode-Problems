package LeetCodeProblemUsingJava;

//  Question 101. Symmetric Tree
//  Link : https://leetcode.com/problems/symmetric-tree/description/

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
class Question101 {

  public boolean dfs(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;
    return (
      (left.val == right.val) &&
      dfs(left.left, right.right) &&
      dfs(left.right, right.left)
    );
  }

  public boolean isSymmetric(TreeNode root) {
    return dfs(root.left, root.right);
  }
}
