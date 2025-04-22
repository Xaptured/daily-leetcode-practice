package blind_75;

public class RemoveNodeFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }
        if (size == 1) return null;

        int toDeleteIndex = size + 1 - n;
        // if (toDeleteIndex<0) toDeleteIndex = 0;
        current = head;
        int counter = 1;
        while (current != null) {
            if (counter == toDeleteIndex-1) {
                if (current.next != null)
                    current.next = current.next.next;
                break;
            } else if (toDeleteIndex == 1) {
                head = current.next;
                break;
            } else {
                counter++;
                current = current.next;
            }
        }
        return head;
    }
}
