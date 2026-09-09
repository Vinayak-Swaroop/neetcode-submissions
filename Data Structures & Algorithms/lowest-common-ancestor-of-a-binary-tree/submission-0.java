/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Set<TreeNode> nodeSet;
    private TreeNode result;
    private boolean found = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        nodeSet = new HashSet();
        return traverse(root, p, q);
    }
    private TreeNode traverse(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null)
            return node;
        if(node==p || node==q)
            return node;
        var left = traverse(node.left,p,q);
        var right = traverse(node.right,p,q);
        if(left!=null && right !=null)
            return node;
        return left!=null?left:right;
        
    }
}