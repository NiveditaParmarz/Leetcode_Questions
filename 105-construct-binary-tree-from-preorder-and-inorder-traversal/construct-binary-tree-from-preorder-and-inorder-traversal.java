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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return construct(preorder,0,n-1,inorder,0,n-1);
    }
    
    public TreeNode construct(int[] pre, int ps, int pe, int in[], int is, int ie){
        if(ps > pe || is > ie){ //base case
            return null;
        }

        TreeNode root = new TreeNode(pre[ps]);

        int idx = 0;
        for(int i = is; i <= ie; i++){
            if(in[i]==pre[ps]){
                idx = i;
                break;
            }
        }

        int count = idx - is;

        root.left = construct(pre,ps+1,ps+count,in,is,idx-1);
        root.right = construct(pre,ps+count+1,pe,in,idx+1,ie);

        return root;


    }

}