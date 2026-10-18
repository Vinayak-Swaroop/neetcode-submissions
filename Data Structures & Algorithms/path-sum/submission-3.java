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
    private boolean hasPathSum;
    private int currentSum;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        currentSum = 0;
        hasPathSum = false;
        traverse(root,targetSum);
        return hasPathSum;
    }
    private void traverse(TreeNode node, int targetSum){
        if(node==null)
            return;
        currentSum+=node.val;
        if(node.left==null && node.right == null && targetSum==currentSum)
            hasPathSum=true;
        traverse(node.left,targetSum);
        traverse(node.right,targetSum);
        currentSum-=node.val;
    }
}