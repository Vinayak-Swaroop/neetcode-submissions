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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traverse(root,p,q);
    }
    private TreeNode traverse(TreeNode node, TreeNode target1, TreeNode target2) {
        if(node==null)
            return null;
        if (target1.val < node.val && target2.val < node.val)
            return traverse(node.left, target1, target2);
        else if (target1.val > node.val && target2.val > node.val)
            return traverse(node.right, target1, target2);
        else
            return node;
    }
}
