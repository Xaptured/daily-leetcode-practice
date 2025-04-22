package blind_75;

public class ReorderList_143 {
    public void reorderList(ListNode head) {
        ListNode current = head;
        while (current.next != null && current.next.next != null) {
            shuffle(current);
            current = current.next.next;
        }

    }

    public void shuffle(ListNode tempHead) {
        ListNode current = tempHead;
        while (current.next.next != null) {
            current = current.next;
        }
        ListNode tempNode = current.next;
        current.next = null;
        tempNode.next = tempHead.next;
        tempHead.next = tempNode;
    }
}
