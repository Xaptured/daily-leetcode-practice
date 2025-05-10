package blind_75;

import java.util.PriorityQueue;

public class KSmallestElementBST_230 {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue();
        fillQueue(root, queue);
        while (k-1>0) {
            queue.poll();
            k--;
        }
        return queue.poll();
    }

    public void fillQueue(TreeNode root, PriorityQueue<Integer> queue) {
        if (root == null) return;
        fillQueue(root.left, queue);
        queue.add(root.val);
        fillQueue(root.right, queue);
    }
}
