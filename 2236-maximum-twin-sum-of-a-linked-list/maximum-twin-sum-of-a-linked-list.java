/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;

        // Find the middle using slow (turtle) and fast (hare) pointer
        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        // Reverse second half of the list
        ListNode middle = reverse(turtle);
        ListNode curr = head;
        int maxSum = 0;

        // Compute max twin sum
        while (middle != null) {
            maxSum = Math.max(maxSum, curr.val + middle.val);
            curr = curr.next;
            middle = middle.next;
        }
        return maxSum;
    }

    // Recursive function to reverse a linked list
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head; // Base case

        ListNode reversedHead = reverse(head.next);
        head.next.next = head; // Reverse link
        head.next = null; // Break original link

        return reversedHead; // Return new head of reversed list
    }
}