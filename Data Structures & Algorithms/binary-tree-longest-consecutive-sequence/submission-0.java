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
    private int max=0;
    public int longestConsecutive(TreeNode root) {
        traverse(root,root.val,1);
        return max;
    }
    private void traverse(TreeNode node,int prev,int currentPath){
        if(node==null){
            max = Math.max(currentPath,max);
            return;
        }  
        if(node.val==prev+1){
            traverse(node.left,node.val,currentPath+1);
            traverse(node.right,node.val,currentPath+1);
        }
        else{
            max = Math.max(currentPath,max);
            traverse(node.left,node.val,1);
            traverse(node.right,node.val,1);
        }
    }
}
