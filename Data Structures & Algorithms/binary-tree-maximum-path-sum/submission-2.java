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
    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return maxPathSum;

    }
    private int traverse(TreeNode node){
        if(node == null)
            return 0;
        int leftMaxPath = Math.max(0,traverse(node.left));
        int rightMaxPath = Math.max(0,traverse(node.right));
        int sum = Math.max(node.val+rightMaxPath+leftMaxPath,(node.val+Math.max(rightMaxPath,leftMaxPath)));
        maxPathSum = Math.max(maxPathSum,sum);
        return node.val+Math.max(leftMaxPath,rightMaxPath);

    }
}
