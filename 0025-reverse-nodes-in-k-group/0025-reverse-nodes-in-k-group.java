class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {
            ListNode kthNode = prevGroup;

            for (int i = 0; i < k; i++) {
                kthNode = kthNode.next;

                if (kthNode == null) {
                    return dummy.next;
                }
            }

            ListNode nextGroup = kthNode.next;
            ListNode prev = nextGroup;
            ListNode current = prevGroup.next;

            while (current != nextGroup) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            ListNode temp = prevGroup.next;
            prevGroup.next = kthNode;
            prevGroup = temp;
        }
    }
}