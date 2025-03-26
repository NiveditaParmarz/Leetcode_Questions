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
    int greater = 0; //summing all the nodes, this will be the result.
    public TreeNode bstToGst(TreeNode root) {
        int greater = 0;
        reverseInorder(root);
        return root;
    }
    public void reverseInorder(TreeNode root){
        if(root==null)return;

        reverseInorder(root.right);
        greater = greater + root.val; //updating the greater variable, usmei curr node ki value add kardi (last right node ki sabse pehle karenge).
        root.val = greater; //updating the node's value as the value we have accumulated till now.
        reverseInorder(root.left);
    }
}