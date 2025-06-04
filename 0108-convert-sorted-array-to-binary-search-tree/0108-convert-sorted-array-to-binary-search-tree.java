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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return sortedArrayToBSTUtil(nums , 0 , n);
    }
    private TreeNode sortedArrayToBSTUtil(int nums[] , int low , int  high){
        if(low >= high) return null;
        int mid = (high + low) / 2;
        TreeNode root = new TreeNode (nums[mid]);
        root.left = sortedArrayToBSTUtil(nums , low , mid);
        root.right = sortedArrayToBSTUtil(nums , mid + 1 , high);
        return root;
    }
}