/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root != null)
            q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            Node node = q.poll();
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null) {
                q.add(node.right);
            }
            for(int i = 1 ; i < size ; i ++) {
                Node nodeNext = q.poll();
                node.next = nodeNext;
                node = nodeNext;
                if(nodeNext.left != null){
                    q.add(nodeNext.left);
                }
                if(nodeNext.right != null) {
                    q.add(nodeNext.right);
                }
            }
        }
        return root;
    }
}