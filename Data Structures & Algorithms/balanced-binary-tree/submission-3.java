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
    private boolean unbalanced;
    public boolean isBalanced(TreeNode root) {
        traverse(root);
        return !unbalanced;
    }
    private int traverse(TreeNode node){
        if(node==null)
            return 0;
        var leftHeight = traverse(node.left);
        var rightHeight = traverse(node.right);
        if(Math.abs(rightHeight-leftHeight)>1)
            unbalanced=true;
        return 1+Math.max(leftHeight,rightHeight);
    }

}
