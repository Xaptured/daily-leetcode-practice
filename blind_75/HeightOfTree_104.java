package blind_75;

public class HeightOfTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return Math.max(left, right);
    }
}
