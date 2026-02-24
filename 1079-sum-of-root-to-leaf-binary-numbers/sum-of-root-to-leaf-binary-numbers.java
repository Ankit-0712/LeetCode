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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current){
        if(node == null) return 0;

        //build binary number
        current = current * 2 + node.val;

        //if its leaf node return the value
        if(node.left == null && node.right== null){
            return current;
        }

        //otherwise return sum of left ans right subtree
        return dfs(node.left, current) + dfs(node.right, current);
    }
}