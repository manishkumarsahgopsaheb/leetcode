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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        List<List<Integer>> node_list = new ArrayList<>();
        
        if(root==null)
            return node_list;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            
            List<Integer> batch = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++)
            {
                TreeNode poll = queue.poll();
                
                if(poll.left!=null)
                {
                    queue.offer(poll.left);
                }
                if(poll.right!=null)
                {
                    queue.offer(poll.right);
                }
                batch.add(poll.val);
            }
            node_list.add(batch);
        }
        
        return node_list;
        }
}
