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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    Queue<TreeNode> queue = new LinkedList<>();
    //Adds the rootnodes to the queue
    queue.offer(p);
    queue.offer(q);
    //checks till empty
    while(!queue.isEmpty()){
        //deletes each element
        TreeNode first = queue.poll();
        TreeNode second = queue.poll();
        //after deleting the nodes if its same then no problem
        if(first == null && second == null){
            continue;
        }
        //if not same one is high and one is null means return false
        //and also check values
        else if(first ==  null || second == null || first.val != second.val){
            return false;
        }
        //if same means then we will make order left left and right right
        queue.offer(first.left);
        queue.offer(second.left);
        queue.offer(first.right);
        queue.offer(second.right);

    }
    return true;

        
    }
}
