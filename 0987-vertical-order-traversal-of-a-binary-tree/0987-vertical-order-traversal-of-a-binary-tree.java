class Solution {
    class Pair {
        TreeNode node;
        int row, col;

        Pair(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            map.putIfAbsent(p.col, new TreeMap<>());
            map.get(p.col).putIfAbsent(p.row, new PriorityQueue<>());

            map.get(p.col).get(p.row).offer(p.node.val);

            if (p.node.left != null)
                q.offer(new Pair(p.node.left, p.row + 1, p.col - 1));

            if (p.node.right != null)
                q.offer(new Pair(p.node.right, p.row + 1, p.col + 1));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> temp = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    temp.add(pq.poll());
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}