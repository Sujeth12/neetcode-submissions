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
        //current node named as this root
        TreeNode current = root;

        while(true){
            //goes to right
            if(val >= current.val){
                //if not null means it contains the right values soo go through it
                if(current.right != null){
                    current = current.right;
                }
                //when  its null means u add the NEW VALUE 
                else{
                    current.right = new TreeNode(val);
                    //MAIN
                    break;
                }
            }
            else{
                // it moves to left then not null means goo through lastt
                if(current.left != null){
                    current  = current.left;
                }
                //when  its null means u add the NEW VALUE 
                else{
                    current.left = new TreeNode(val);

                    //MAIN THING
                    break;
                }
            }
        }
    return root;
    }
}