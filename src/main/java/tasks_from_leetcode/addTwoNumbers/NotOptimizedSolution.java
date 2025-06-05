package tasks_from_leetcode.addTwoNumbers;

import java.math.BigInteger;
import java.util.Objects;

class NotOptimizedSolution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;

        StringBuilder sumOfL1 = new StringBuilder();
        StringBuilder sumOfL2 = new StringBuilder();

        while (Objects.nonNull(listNode1)) {
            sumOfL1.append(listNode1.val);
            listNode1 = listNode1.next;
        }

        while (Objects.nonNull(listNode2)) {
            sumOfL2.append(listNode2.val);
            listNode2 = listNode2.next;
        }

        sumOfL1.reverse();
        sumOfL2.reverse();
        BigInteger sumOf1 = new BigInteger(String.valueOf(sumOfL1));
        BigInteger sumOf2 = new BigInteger(String.valueOf(sumOfL2));

        BigInteger sum = sumOf1.add(sumOf2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(sum));

        stringBuilder.reverse();
        int head = Integer.parseInt(String.valueOf(stringBuilder.charAt(0)));
        ListNode node = new ListNode(head);
        ListNode result = node;

        for (int i = 1; i < String.valueOf(sum).length(); i++) {
            node.next = new ListNode(Integer.parseInt(String.valueOf(stringBuilder.charAt(i))));
            node = node.next;
        }

        return result;
    }
}
