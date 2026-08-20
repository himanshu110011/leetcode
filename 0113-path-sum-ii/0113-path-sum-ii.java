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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list =  new ArrayList<>();

       dfs(list, new ArrayList<>(),root, targetSum, 0);

        return list;
    }
    void dfs(List<List<Integer>> list, List<Integer> l,TreeNode root, int targetSum, int currentSum){
         if (root == null) return;

        l.add(root.val);
        if (root.left != null) {
            dfs(list, l, root.left, targetSum, currentSum + root.val);
            l.removeLast();
        }
        if (root.right != null) {
            dfs(list, l, root.right, targetSum, currentSum + root.val);
            l.removeLast();
        }
        if (root.left == null && root.right == null && targetSum == currentSum + root.val) {
            list.add(new ArrayList<>(l));
            return;
    }
}
}