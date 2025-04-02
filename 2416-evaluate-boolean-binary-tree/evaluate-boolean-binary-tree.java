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
    public boolean evaluateTree(TreeNode root) {
        if(root.val==0)return false;
        if(root.val==1)return true;


        if(root.left==null){ //means it's a leaf node (read question)
            //leaf node's value can be true or false only.
            return root.val==1; //will give true or false 
        }


        boolean a = evaluateTree(root.left);
        boolean b = evaluateTree(root.right);

        if(root.val==2)return a||b;
        return a&&b;
    }
}