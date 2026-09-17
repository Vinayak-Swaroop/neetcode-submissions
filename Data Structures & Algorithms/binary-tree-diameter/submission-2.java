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
    private int maxDiamter;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxDiamter;
    }
    private int traverse(TreeNode node){
        if(node==null)
            return 0;
        var leftHeight = traverse(node.left);
        var rightHeight = traverse(node.right);
        int diamteter = leftHeight+rightHeight;
        if(diamteter>maxDiamter)
            maxDiamter=diamteter;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
