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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(root, list);

        return buildBst(list,0,list.size()-1);
    }

    public void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public TreeNode buildBst(List<Integer> list, int l, int r){
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildBst(list, l, mid-1);
        root.right = buildBst(list, mid+1,r );

        return root;
    }
}