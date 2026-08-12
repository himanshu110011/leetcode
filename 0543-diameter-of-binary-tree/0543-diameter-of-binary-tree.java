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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
    public int diameter(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        int l = diameter(root.left);
        int r = diameter(root.right);
        sum = l+r;
        max = Math.max(max, sum);
        return Math.max(l, r)+1;
    }
}