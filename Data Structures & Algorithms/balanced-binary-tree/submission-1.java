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
    private boolean unbalanced = false;
    public boolean isBalanced(TreeNode root) {
        isBalancedRec(root);
        return !unbalanced;
    }
    private int isBalancedRec(TreeNode node){
        if(node == null)
            return 0;
        int leftHeight = isBalancedRec(node.left);
        int rightHeight = isBalancedRec(node.right);
        if(Math.abs((leftHeight-rightHeight))>1)
            unbalanced = true;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
