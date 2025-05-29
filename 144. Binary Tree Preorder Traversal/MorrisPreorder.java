class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        return morrisPreOrder(root);
    }
    private List<Integer> morrisPreOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null) {
                // then it is last node
                list.add(curr.val);
                // then move to right
                curr = curr.right;
            }
            else{
                //there is left node then move to right most node
                TreeNode prev = curr.left;
                // check if the prev.right is not null and prev.right != curr may be due to thread making
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    // make the pointer to curr
                    // the current is node
                    list.add(curr.val);
                    prev.right = curr; 
                    curr = curr.left;
                }
                else{
                    // remove the thread
                    prev.right = null;
                    // move to rightn node as left is visited
                    curr = curr.right;
                }
            }
        }
        return list;
    }
}
