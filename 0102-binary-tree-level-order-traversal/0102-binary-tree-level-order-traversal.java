class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) return list;

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);
        que.offer(null);

        List<Integer> l = new ArrayList<>();

        while (!que.isEmpty()) {

            TreeNode curr = que.poll();
            if (curr == null) {
                list.add(l);
                l = new ArrayList<>();
                if (!que.isEmpty()) {
                    que.offer(null);
                }
            } else {
                l.add(curr.val);
                if (curr.left != null) {
                    que.offer(curr.left);
                }
                if (curr.right != null) {
                    que.offer(curr.right);
                }
            }
        }

        return list;
    }
}