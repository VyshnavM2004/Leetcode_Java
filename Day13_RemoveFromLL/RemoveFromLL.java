public class RemoveFromLL {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    public static ListNode removeElements(ListNode head, int val) {


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.val == val) {

                prev.next = curr.next;
            } else {

                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        head = removeElements(head, 6);

        System.out.println("After Removing 6:");
        printList(head);
    }
}