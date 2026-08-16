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
    //initialize this as global
    int maxdiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //call the function
         helper(root);
        //return the diameter as max(left + right)
         return maxdiameter;
    }

    public int helper(TreeNode root){
        //base condition
        if(root == null){
            return 0;
        }
        //traverse entire left
        int leftnode = helper(root.left);
        //traverse entire right
        int rightnode = helper(root.right);
        //then max of diameter and left+right
        maxdiameter = Math.max(maxdiameter , (leftnode +rightnode));
        //then we want max of left and right +1;
        return (1 + Math.max(leftnode , rightnode));
        
    }

}
