public class IntersectionOfTwoLinkedList {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = 0;
        int lenB = 0;


        ListNode a = headA;
        ListNode b = headB;


        while (a != null) {
            lenA++;
            a = a.next;
        }


        while (b != null) {
            lenB++;
            b = b.next;
        }


        a = headA;
        b = headB;


        while (lenA > lenB) {
            a = a.next;
            lenA--;
        }

        while (lenB > lenA) {
            b = b.next;
            lenB--;
        }


        while (a != b) {
            a = a.next;
            b = b.next;
        }


        return a;
    }

    public static void main(String[] args) {


        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        // List B
        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;


        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}