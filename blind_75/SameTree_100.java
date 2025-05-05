package blind_75;

import java.util.ArrayList;
import java.util.List;

public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> tree1 = new ArrayList();
        List<Integer> tree2 = new ArrayList();
        preOrderTraverse(tree1, p);
        preOrderTraverse(tree2, q);
        if (tree1.equals(tree2)) return true;
        else return false;
    }

    public void preOrderTraverse(List<Integer> tree, TreeNode node) {
        if (node == null) {
            tree.add(null);
            return;
        };
        tree.add(node.val);
        preOrderTraverse(tree, node.left);
        preOrderTraverse(tree, node.right);
    }
}
