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
        if(root == null){
            return root;
        }

        if(key > root.val){
            root.right = deleteNode(root.right , key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left , key);
        }
        else{
            //if root.val == key
            //NO CHILD CASE JUST RETURN NULL 
            if(root.right == null && root.left == null){
                return null;
            }
            //only one child there means do this
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            else{
                //IF TWO CHILDS THERE MEANS WE NEED TO FIND
                //TOTAL LEFT SIDE FIND MAX
                //TOTAL RIGHT SIDE FIND MINIMUM
                
                TreeNode node = findMax(root.left); //has max from left

                //then change the value of root node
                //in example 3 changes with 4

                root.val = node.val;

                //after that we have two 4's right so we need to delete it
                //call the recursive left again 
                //MAIN
                //instead of key place node.val
                root.left = deleteNode(root.left , node.val);

            }
        }

    return root;
    }
    public TreeNode findMax(TreeNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;

    }
}