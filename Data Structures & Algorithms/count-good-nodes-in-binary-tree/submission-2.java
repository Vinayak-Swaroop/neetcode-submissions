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
    private int goodNodes=0;
    public int goodNodes(TreeNode root) {
        traverse(root,root.val);
        return goodNodes;
    }
    private void traverse(TreeNode node,int maxValue){
        if(node==null)
            return;
        if(node.val>=maxValue){
            goodNodes+=1;
            maxValue=node.val;
        }
        traverse(node.left,maxValue);
        traverse(node.right,maxValue);
    }
}
