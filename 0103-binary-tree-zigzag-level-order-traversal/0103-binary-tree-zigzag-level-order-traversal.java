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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null)  return list;

        Queue <TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        int level = 0;

        while(!que.isEmpty()){
            int size =  que.size();

            List <Integer> l = new ArrayList<>();

            for(int i = 0; i < size; i++){
            TreeNode curr = que.poll();
            if(level % 2 != 0) l.add(0, curr.val);
            else l.add(curr.val);
            if(curr.left != null) que.offer(curr.left);
            if(curr.right != null) que.offer(curr.right);
            }
            level++;
            list.add(l);
        }
        return list;
    }
}