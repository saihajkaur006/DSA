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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inmap= new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        return buildhelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inmap);
    }
    private TreeNode buildhelper(int[] inorder,int ist,int iend,int[]postorder,int pst,int pend,Map<Integer,Integer> inmap){
        if(postorder.length!=inorder.length) return null;

        if(pst>pend || ist>iend) return null;

        TreeNode root= new TreeNode(postorder[pend]);
        int inroot=inmap.get(postorder[pend]);
        int numsleft=inroot-ist;

        root.left=buildhelper(inorder,ist,inroot-1,postorder,pst,pst+numsleft-1,inmap);
        root.right=buildhelper(inorder,inroot+1,iend,postorder,pst+numsleft,pend-1,inmap);
        return root;
    }
}