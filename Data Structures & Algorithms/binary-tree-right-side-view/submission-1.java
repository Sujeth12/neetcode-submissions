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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            //INITIALIZE THE LAST VALUE
            int last = 0;

            for(int i = 0 ; i< level; i++){
                TreeNode current = queue.poll();
                //MAIN IT WILL STORES THE LAST VALUE AFTER THE LOOP ENDS
                //main it will adds the last elemet with eachlevel
                if(i == level - 1){
                last = current.val;
                }

                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            list.add(last);
        }
        return list;
        
    }
}
