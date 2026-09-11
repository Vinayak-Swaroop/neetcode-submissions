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
    public int maxDepth(TreeNode root) {
        return traverse(root);
    }
    private int traverse(TreeNode node){
        if(node==null)
            return 0;
        int leftHeight = traverse(node.left);
        int rightHeight=traverse(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
