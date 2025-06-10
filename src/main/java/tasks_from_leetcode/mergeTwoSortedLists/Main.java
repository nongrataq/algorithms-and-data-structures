package tasks_from_leetcode.mergeTwoSortedLists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(solution.mergeTwoLists(head1, head2));
    }
}
