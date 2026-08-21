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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> list = new ArrayList<>();
        if(root == null) return list;
        helper(root,list,"");
        return list;
    }
    public void helper(TreeNode root, List<String> list, String s){
        s += root.val;

        if(root.left == null && root.right == null){
            list.add(s);
            return ;
        }
        s += "->";
        if(root.left != null) helper(root.left, list, s);
        if(root.right != null) helper(root.right, list, s);
       
    }
}