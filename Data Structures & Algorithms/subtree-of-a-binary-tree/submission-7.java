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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traverse(root,subRoot);
    }
    private boolean traverse(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null)
            return true;
        else if(root==null || subRoot == null)
            return false;
        else if(isSameTree(root,subRoot))
            return true;
        else
        return traverse(root.left,subRoot) || traverse(root.right,subRoot);
        
    }
    private boolean isSameTree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot == null)
            return true;
        if(root == null || subRoot == null || root.val != subRoot.val)
            return false;
        return isSameTree(root.left,subRoot.left) && isSameTree(root.right,subRoot.right);
    }
}
