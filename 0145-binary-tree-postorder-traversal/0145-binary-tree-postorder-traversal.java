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
    public void helper(TreeNode root , List<Integer> nums){
        if(root==null) return;
        helper(root.left , nums);
        helper(root.right , nums);
        nums.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> num = new ArrayList<>(); 
        helper(root,num);
        return num;
    }
}