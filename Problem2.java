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
 //TC: O(n)
 //SC:O(h)
class Solution {
    private int moves;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    private int dfs(TreeNode root){
        if(root == null) return 0;
        int extra = root.val - 1;
        extra += dfs(root.left);
        extra += dfs(root.right);
        moves += Math.abs(extra);
        return extra;
    }
}
