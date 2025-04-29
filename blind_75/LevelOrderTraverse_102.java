package blind_75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList();
        List<Integer> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root); queue.add(null);
        traverse(root, queue, list);
        System.out.println(list);
        List<List<Integer>> result = new ArrayList();
        List<Integer> subList = new ArrayList();
        for (int i=0;i<list.size();i++) {

            if (list.get(i) != null) {
                subList.add(list.get(i));
            } else {
                System.out.println(subList);
                List<Integer> copy = new ArrayList(subList);
                result.add(copy);
                subList.clear();
            }
        }
        System.out.println(result);
        return result;
    }

    public void traverse(TreeNode root, Queue<TreeNode> queue, List<Integer> list) {
        while (queue.size() > 0) {
            TreeNode curr = queue.poll();
            if (curr != null && curr.left != null) {
                queue.add(curr.left);
            }
            if (curr != null && curr.right != null) {
                queue.add(curr.right);
            }
            if (curr == null && !queue.isEmpty()) {
                queue.add(null);
            }
            if (curr != null) {
                list.add(curr.val);
            } else list.add(null);
        }
    }
}
