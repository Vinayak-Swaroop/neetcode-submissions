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
    private boolean unequal;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p,q);
        return !unequal;
    }
    private void traverse(TreeNode node1,TreeNode node2){
        if((node1==null && node2==null) || unequal)
            return;
        if(node1==null || node2 ==null || node1.val!=node2.val){
            unequal = true;
            return;
        }
        traverse(node1.left,node2.left);
        traverse(node1.right,node2.right);
    }
}
