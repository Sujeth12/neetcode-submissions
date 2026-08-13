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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        //ITS AN RECURSIVE SOLUTION 
        //FIRST WHEN ITS GREATER THAN ROOT VALUE THEN MOVE RIGHT
        //MAIN IS ROOT.RIGHT AND ROOT.LEFT BECAUSE WHEN ITS NULL THEN BASE CONDITION GETS ON THEN ADDS TO IT
       if(val >root.val ){
        root.right = insertIntoBST(root.right , val);
       }
       else{
        root.left = insertIntoBST(root.left , val);
       }
    return root;
    }
}