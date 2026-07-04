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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int lh=countleft(root);
        int rh=countright(root);

        if(lh==rh){
            return (1<<lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    private int countleft(TreeNode root){
        int height=0;
        while(root!=null){
            height++;
            root=root.left;
        }
        return height;
    }
    private int countright(TreeNode root){
        int height=0;
        while(root!=null){
            height++;
            root=root.right;
        }
        return height;
    }
}