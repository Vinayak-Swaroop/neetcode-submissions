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
    int globalK;
    int kthSmallest;
    public int kthSmallest(TreeNode root, int k) {
        globalK = k;
        traverse(root);
        return kthSmallest;
    }
    private void traverse(TreeNode node){
        if(node==null || globalK==0)
            return;
        traverse(node.left);
        globalK--;
        if(globalK==0){
            kthSmallest=node.val;
        }
        traverse(node.right);
    }
}
