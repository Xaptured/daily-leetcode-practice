package blind_75;

public class LCAofBST_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while (current != null) {
            if ((current.val > p.val && current.val < q.val) || (current.val < p.val && current.val > q.val)) {
                return current;
            } else if (current.val < p.val && current.val < q.val) {
                current = current.right;
            } else if (current.val > p.val && current.val > q.val) {
                current = current.left;
            } else if (current.val == p.val || current.val == q.val) {
                return current;
            }
        }
        return null;
    }
}
