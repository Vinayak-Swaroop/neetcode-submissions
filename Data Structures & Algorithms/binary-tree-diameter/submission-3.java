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
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return maxDiameter-1;
    }
    private int getDiameter(TreeNode node){
        if(node == null)
            return 0;
        int leftHeight = getDiameter(node.left);
        int rightHeight = getDiameter(node.right);
        int diameter = 1 + leftHeight + rightHeight;
        maxDiameter = Math.max(diameter,maxDiameter);
        return 1 + Math.max(leftHeight,rightHeight);
    }
}
