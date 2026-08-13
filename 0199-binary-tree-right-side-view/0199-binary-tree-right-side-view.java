class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);

        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 1; i <= size; i++) {
                TreeNode curr = que.poll();
                if (i == size) {
                    list.add(curr.val);
                }
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