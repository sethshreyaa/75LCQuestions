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
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countGoodNodes(TreeNode root, int max){
        if(root==null) return 0;

        int count=0;
        if(root.val >= max) count=1;

        max = Math.max(max, root.val);

        count = count + countGoodNodes(root.left, max);
        count = count + countGoodNodes(root.right, max);

        return count;
    }
}