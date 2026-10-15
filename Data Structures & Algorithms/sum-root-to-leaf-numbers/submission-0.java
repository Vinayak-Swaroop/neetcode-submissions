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
    private int currentNum;
    public int sumNumbers(TreeNode root) {
        List<Integer> numbers = new ArrayList();
        traverse(root,numbers);
        int sum=0;
        for(int num:numbers)
            sum+=num;
        return sum;
    }
    private void traverse(TreeNode node,List<Integer> numbers){
        if(node == null){
            return;
        }
        currentNum = currentNum*10 +node.val;
        if(node.left==null && node.right==null)
            numbers.add(currentNum);
        traverse(node.left,numbers);
        traverse(node.right,numbers);
        currentNum = (currentNum - node.val)/10;
    }
}