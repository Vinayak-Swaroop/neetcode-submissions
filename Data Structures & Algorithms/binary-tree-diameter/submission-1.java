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
    private int max=-1;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return max;
    }
    private int getDiameter(TreeNode node){
        if(node == null)
            return 0;
        int leftHeight = getDiameter(node.left);
        int rightHeight = getDiameter(node.right);
        int diameter = rightHeight + leftHeight;
        if(diameter>max)
            max = diameter;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
