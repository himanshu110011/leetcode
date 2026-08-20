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
    public boolean findTarget(TreeNode root, int k) {
      
    List<Integer> list = new ArrayList<>();
        helper(root, list);
        int l = 0;
        int r = list.size()-1;
        while(l<r){
        if(list.get(l) + list.get(r) == k) return true;
        else if(list.get(l) + list.get(r) < k) l++;
        else r--;
        }
        return false;
    }
    void helper(TreeNode root, List<Integer> list){
         if(root == null) return ;
         helper(root.left, list);
         list.add(root.val);
         helper(root.right,  list);
    }
     
}