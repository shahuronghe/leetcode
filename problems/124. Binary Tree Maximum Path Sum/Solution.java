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
    
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }
    
    public int maxSum(TreeNode node){
        if(node == null) return 0;
        
        int left = Math.max(maxSum(node.left), 0);
        int right = Math.max(maxSum(node.right), 0);
        
        int sum = left + right + node.val;
        
        max = Math.max(max, sum);
        
        return node.val + Math.max(left, right);
    }
}