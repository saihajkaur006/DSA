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
    private void recursive(TreeNode root,List<Integer>arr){
        if(root==null) return;
        arr.add(root.val);
        recursive(root.left,arr);
        recursive(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        recursive(root,arr);
        return arr;
    }
}