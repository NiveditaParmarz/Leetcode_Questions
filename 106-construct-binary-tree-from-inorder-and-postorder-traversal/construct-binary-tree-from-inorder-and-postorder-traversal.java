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
    public TreeNode buildTree(int[] inorder, int[] postorder){
        int n = inorder.length;
        return construct(inorder,0,n-1,postorder,0,n-1);
    }

    public TreeNode construct(int[]in,int is,int ie,int[]post,int ps,int pe){
        if(is > ie || ps > pe)return null;
        TreeNode root = new TreeNode(post[pe]);
        int idx = 0;
        for(int i = is; i <= ie; i++){
            if(in[i]==post[pe]){
                idx = i;
                break;
            }
        }

        int count = idx-is;

        root.left = construct(in,is,idx-1,post,ps,ps+count-1);
        root.right = construct(in,idx+1,ie,post,ps+count,pe-1);
        return root;
    }
}