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
    private int leastDifferenceNode;
    private double leastDifference;
    public int closestValue(TreeNode root, double target) {
        leastDifferenceNode = root.val;
        leastDifference = Math.abs(target-root.val);
        closest(root,target);
        return leastDifferenceNode;
    }
    private void closest(TreeNode node, double target){
        if(node==null)
            return;
        double difference = Math.abs(target-node.val);
        if(difference<leastDifference){
            leastDifferenceNode = node.val;
            leastDifference = difference;
        }
        if(target<node.val)
            closest(node.left,target);
        else
            closest(node.right,target);
    }
}
