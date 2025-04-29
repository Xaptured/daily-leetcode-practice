package random_ques;

import blind_75.TreeNode;

public class DiameterTree_543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int totalDiam = height(root.getLeft()) + height(root.getRight());
        int leftDiam = diameterOfBinaryTree(root.getLeft());
        int rightDiam = diameterOfBinaryTree(root.getRight());
        return Math.max(totalDiam, Math.max(leftDiam, rightDiam));
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + height(root.getLeft());
        int right = 1 + height(root.getRight());

        return Math.max(left, right);
    }
}
