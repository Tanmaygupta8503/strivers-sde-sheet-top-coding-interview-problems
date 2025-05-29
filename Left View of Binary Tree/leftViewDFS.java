class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer>list = new ArrayList<>();
    ArrayList<Integer> leftView(Node root) {
        // code here
        leftView(root , 0);
        return list;
    }
    void leftView(Node root , int depth){
        if(root == null){
            return ;
        }
        if(list.size() > depth){
            
        }else{
            list.add(root.data);
        }
        leftView(root.left , depth + 1);
        leftView(root.right , depth + 1);
    }
}
