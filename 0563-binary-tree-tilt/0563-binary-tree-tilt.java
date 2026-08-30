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
    int ans = 0;
    public int findTilt(TreeNode root) {
         sum(root);
        return ans;
    }

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        ans += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}