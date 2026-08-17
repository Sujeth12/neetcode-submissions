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
    public int goodNodes(TreeNode root) {
        return helper(root , Integer.MIN_VALUE);
    }
    public int helper(TreeNode root , int curmax){
        if(root == null){
            return 0;
        }
        int rootanswer = 0;

        if(root.val >= curmax){
            rootanswer = 1;
            curmax=root.val;
        }
        int l = helper(root.left , curmax);
        int r = helper(root.right , curmax);
        return l + r + rootanswer;


    }
}
