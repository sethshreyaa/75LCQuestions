class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        // Count paths starting from the current node
        int count = countPathsFromNode(root, targetSum, 0);

        // Recur for left and right subtrees
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    private int countPathsFromNode(TreeNode node, int targetSum, long sumSoFar) {
        if (node == null) return 0;

        sumSoFar += node.val;
        int count = (sumSoFar == targetSum) ? 1 : 0;

        count += countPathsFromNode(node.left, targetSum, sumSoFar);
        count += countPathsFromNode(node.right, targetSum, sumSoFar);

        return count;
    }
}
