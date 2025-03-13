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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        sequence(root1, array1);
        sequence(root2, array2);

        return array1.equals(array2);

    }

    private void sequence(TreeNode root, List<Integer> arr){
        if(root==null) return;
        if(root.left==null && root.right==null)    arr.add(root.val);
        sequence(root.left, arr);
        sequence(root.right, arr);

    }
}