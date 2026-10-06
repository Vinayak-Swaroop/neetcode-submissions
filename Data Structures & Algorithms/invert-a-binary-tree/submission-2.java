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
    public TreeNode invertTree(TreeNode root) {
        traverse(root);
        return root;
    }
    private TreeNode traverse(TreeNode node){
        if(node == null)
            return node;
        TreeNode temp = node.left;
        node.left=traverse(node.right);
        node.right=traverse(temp);
        return node;
    }
}
