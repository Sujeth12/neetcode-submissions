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
    int maxdiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

         helper(root);

         return maxdiameter;
    }

    public int helper(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftnode = helper(root.left);

        int rightnode = helper(root.right);

        maxdiameter = Math.max(maxdiameter , (leftnode +rightnode));

        return (1 + Math.max(leftnode , rightnode));
        
    }

}
