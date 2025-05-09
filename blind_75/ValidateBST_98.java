package blind_75;

public class ValidateBST_98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val>min && root.val<max) {
            return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
        } else return false;
    }
}
