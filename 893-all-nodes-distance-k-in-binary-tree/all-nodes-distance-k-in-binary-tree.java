/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode , TreeNode> parentMap=new HashMap<>() ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null){
                parentMap.put(node.left,node);
                queue.add(node.left);
            }
            if(node.right!=null){
                parentMap.put(node.right,node);
                queue.add(node.right);
            }
        }
        List<Integer>result = new ArrayList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.add(target);
        visited.add(target);
        int currentDist=0;
        while(!queue.isEmpty()){
            
            if(currentDist==k){
                while(!queue.isEmpty()){
                    result.add(queue.poll().val);

                }
                return result;
            }
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode nodex=queue.poll();
                if(nodex.left!=null && !visited.contains(nodex.left)){
                    queue.add(nodex.left);
                    visited.add(nodex.left);
                }
                if(nodex.right!=null && !visited.contains(nodex.right)){
                    queue.add(nodex.right);
                    visited.add(nodex.right);
                }
                if(parentMap.containsKey(nodex) && !visited.contains(parentMap.get(nodex))){
                    queue.add(parentMap.get(nodex));
                    visited.add(parentMap.get(nodex));
                }
            }
            currentDist++;
        }
        return result;
    }
}