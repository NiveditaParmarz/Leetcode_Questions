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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)return true;
        if(root == null)return false;
        
        
        if(isSameTree(root,subRoot)==true)return true;

        boolean foundInLeft = isSubtree(root.left,subRoot);
        boolean foundInRight = isSubtree(root.right,subRoot);

        return foundInLeft || foundInRight;

    }

    public boolean isSameTree(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return false;

        if(root1.val!=root2.val)return false;

        boolean left = isSameTree(root1.left,root2.left);
        boolean right = isSameTree(root1.right,root2.right);

        return left && right;
    }
}