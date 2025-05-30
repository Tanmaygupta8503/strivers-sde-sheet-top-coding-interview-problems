class Solution {
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        Map<Integer,  Integer> map = new TreeMap<>();
        fillmap(root , map);
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(map);
        for(int i : map.values()){
            list.add(i);
        }
        return list;
    }
    class Pair{
        int hd;
        Node node;
        Pair(int hd , Node node){
            this.node = node;
            this.hd = hd;
        }
    }
    void fillmap(Node root , Map<Integer, Integer> map){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0 , root));
        int level = -1;
        while(!q.isEmpty()){
            level ++;
            int size = q.size();
            while(size-- > 0){
                var q_item = q.poll();
                var node = q_item.node;
                int hd = q_item.hd;
                if(node.left != null) {
                    q.add(new Pair(hd - 1 , node.left));
                }
                if(node.right != null) {
                    q.add(new Pair(hd + 1 , node.right));
                }
                map.put(hd , node.data);
            }
        }
    }
}
