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
    int kthSmallest = -1;
    int globalK = -1;
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList();
        globalK = k;
        inorder(root);
        return kthSmallest;
    }
    private void inorder(TreeNode node){
        if(node == null || globalK==0)
            return;
        inorder(node.left);
        if(globalK==1){
            kthSmallest = node.val;
            globalK=0;
            return;
        }
        globalK--;
        inorder(node.right);
    }
}
