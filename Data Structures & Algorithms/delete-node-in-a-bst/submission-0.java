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
    public TreeNode deleteNode(TreeNode root, int key) {
        return remove(root,key);
    }
    private TreeNode minValueNode(TreeNode node){
        TreeNode curr = node;
        while(curr.left!=null)
            curr = curr.left;
        return curr;
    }
    private TreeNode remove(TreeNode node,int key){
        if(node == null)
            return null;
        if(key>node.val)
            node.right = remove(node.right,key);
        else if(key<node.val)
            node.left = remove(node.left,key);
        else{
            if(node.left==null)
                return node.right;
            else if(node.right ==null)
                return node.left;
            else{
                TreeNode minNode = minValueNode(node.right);
                node.val = minNode.val;
                node.right = remove(node.right,minNode.val);
                return node;
            }
        }
        return node;
    }
}