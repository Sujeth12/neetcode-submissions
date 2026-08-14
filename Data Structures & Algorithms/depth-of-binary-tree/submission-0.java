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
    public int maxDepth(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null){
            return 0;
        }
        //level order means first in first out so use queue
        //first push root node to queue
        Queue<TreeNode> queue = new LinkedList<>();
        //pushed
        queue.offer(root);
        //loop until queue becomes empty
        while(!queue.isEmpty()){
            //we need to add list of integers to list
            List<Integer> dummy = new ArrayList<>();
            //MAIN USE CASE FOR THIS DEFINE LENGTH
            //IF U DELETE ONE NODE THEN CHECK ITS LEFT FIRST THEN RIGHT
            int levelsize = queue.size();
            for(int i = 0; i< levelsize ; i++){
                //DELETE AND ADD TO THE SMALL LIST
                TreeNode current = queue.poll();

                dummy.add(current.val);
                //CHECK IF DELETED ELEMTNT HAS LEFT CHILDS AND RIGHT CHILDS
                //ORDER WIILL BE LEFT TO RIGHT
                if(current.left != null){
                    //ADD TO QUEUE LEFT NODE
                    queue.offer(current.left);
                }

                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            list.add(dummy);
        }
        return list.size();

        
        
    }
}
