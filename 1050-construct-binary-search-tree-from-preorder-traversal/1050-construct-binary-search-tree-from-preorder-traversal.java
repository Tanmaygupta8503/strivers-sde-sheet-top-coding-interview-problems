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
    int ptr = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int inorder[] = new int[preorder.length];
        for(int i = 0 ; i < preorder.length ; i ++) {
            inorder[i] = preorder[i];
        }
        Arrays.sort(inorder);
        return makeBSTFromInorderAndPreorder(preorder , inorder, 0 , preorder.length - 1);
    }
    private TreeNode makeBSTFromInorderAndPreorder(int preorder[] , int inorder[], int low , int high){
        if(low > high){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ptr]);
        int mid = Arrays.binarySearch(inorder , preorder[ptr ++]);
        root.left = makeBSTFromInorderAndPreorder(preorder , inorder , low , mid - 1);
        root.right = makeBSTFromInorderAndPreorder(preorder , inorder , mid + 1 , high);
        return root;
    }
}