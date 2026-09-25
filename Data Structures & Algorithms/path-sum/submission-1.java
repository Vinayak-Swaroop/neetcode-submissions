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
    private int sum =0 ;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root,targetSum);
    }
    private boolean traverse(TreeNode node,int target){
        if(node==null)
            return false;
        sum+=node.val;
        if(target==sum && node.left==null && node.right==null)
            return true;
        if(traverse(node.left,target) || traverse(node.right,target))
            return true;
        sum-=node.val;
        return false;
    }
}