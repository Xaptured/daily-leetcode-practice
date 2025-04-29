package blind_75;

public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // Swap left and right
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
