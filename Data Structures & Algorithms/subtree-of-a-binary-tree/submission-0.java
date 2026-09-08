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
    private boolean isSubtree = false;
    private boolean unequal = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        traverse(root,subRoot);
        return isSubtree;
    }
    private boolean areEqual(TreeNode node1,TreeNode node2){
        unequal = false;
        checkEquality(node1,node2);
        return !unequal;
    }
    private void traverse(TreeNode node1,TreeNode node2){
        if(node1==null)
            return;
        if(areEqual(node1,node2)){
            isSubtree=true;
            return;
        }
        traverse(node1.left,node2);
        traverse(node1.right,node2);
        
    }
    private void checkEquality(TreeNode node1,TreeNode node2){
        if((node1==null && node2==null)||unequal)
            return;
        if(node1==null || node2==null || node1.val!=node2.val){
            unequal = true;
            return;
        }
        checkEquality(node1.left,node2.left);
        checkEquality(node1.right,node2.right);
    }
}
