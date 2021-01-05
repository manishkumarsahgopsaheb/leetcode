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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null)
            return list;
        
        // traversing the left subtree
        postorderTraversal(root.left);
        
        // traversing the right subtree
        postorderTraversal(root.right);
        
        // traversing the root element
        list.add(root.val);
        
        return list;
    }
}
