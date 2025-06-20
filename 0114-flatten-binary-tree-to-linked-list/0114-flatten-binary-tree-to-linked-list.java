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
    public void flatten(TreeNode root) {
        if(root == null){
            return ;
        }
        flatten(root.left);
        flatten(root.right);
        var left = root.left;
        var right = root.right;
        root.left = null;
        root.right = left;
        TreeNode curr = root;
        while(curr.right != null) {
            curr = curr.right;
        }
        curr.right = right;
    }
}