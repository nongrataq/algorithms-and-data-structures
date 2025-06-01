package tasks_from_leetcode.middleNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        current = head;
        for (int j = 0; j < size / 2; j++) {
            current = current.next;
        }

        return current;
    }
}
