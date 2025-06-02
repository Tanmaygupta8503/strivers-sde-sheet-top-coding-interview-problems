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
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    int dfs(TreeNode root){
        if(root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int val = Math.max(root.val , /* alone root */
                  Math.max(root.val + left + right, /* left + root + right */
                  Math.max(root.val + left , root.val + right))); /* left + root or root + right */
        maxSum = Math.max(maxSum , val);
        return Math.max(root.val , /* alone root */
               Math.max(root.val + left , right + root.val)); /* left sum with root or right sum with root */
    }
}