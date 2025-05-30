class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        Map<Integer,  Integer> map = new TreeMap<>();
        fillmap(root , map);
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(map);
        for(int i : map.values()){
            list.add(i);
        }
        return list;
    }
    static void fillmap(Node root , Map<Integer, Integer> map){
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
                if(!map.containsKey(hd))
                    map.put(hd , node.data);
            }
        }
    }
    static class Pair{
        int hd;
        Node node;
        Pair(int hd , Node node){
            this.node = node;
            this.hd = hd;
        }
    }
}
