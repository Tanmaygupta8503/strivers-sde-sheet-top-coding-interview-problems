class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<Pair>> map = new TreeMap<>();
        fillMap(root, map);
        List<List<Integer>> result = new ArrayList<>();
        for (List<Pair> pairs : map.values()) {
            pairs.sort((a, b) -> {
                if (a.level == b.level) return a.val - b.val;
                return a.level - b.level;
            });
            List<Integer> col = new ArrayList<>();
            for (Pair p : pairs) {
                col.add(p.val);
            }
            result.add(col);
        }
        return result;
    }

    class Pair {
        int level;
        int val;
        Pair(int level, int val) {
            this.level = level;
            this.val = val;
        }
    }

    class NodeState {
        int hd;
        int level;
        TreeNode node;
        NodeState(int hd, int level, TreeNode node) {
            this.hd = hd;
            this.level = level;
            this.node = node;
        }
    }

    private void fillMap(TreeNode root, Map<Integer, List<Pair>> map) {
        Queue<NodeState> q = new LinkedList<>();
        q.add(new NodeState(0, 0, root));
        while (!q.isEmpty()) {
            NodeState state = q.poll();
            int hd = state.hd;
            int level = state.level;
            TreeNode node = state.node;
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(new Pair(level, node.val));
            if (node.left != null) q.add(new NodeState(hd - 1, level + 1, node.left));
            if (node.right != null) q.add(new NodeState(hd + 1, level + 1, node.right));
        }
    }
}
