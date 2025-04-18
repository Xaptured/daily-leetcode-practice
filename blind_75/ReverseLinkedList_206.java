package blind_75;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList();

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        current = head;
        for (int i = list.size() - 1; i >= 0; i--) {
            current.val = list.get(i);
            current = current.next;
        }

        return head;
    }
}
