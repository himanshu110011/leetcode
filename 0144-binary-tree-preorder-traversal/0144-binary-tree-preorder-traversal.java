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
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> l=new ArrayList<>();
     ans(root,l);
     return l;
    }
    public void ans(TreeNode root,List<Integer>l){
        if(root==null) return;
        l.add(root.val);
        ans(root.left,l);
        ans(root.right,l);
 
    }
}