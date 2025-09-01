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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null){
            return true;
        }
        ListNode mid = findMid(head);
        ListNode SecondHalf = reverseList(mid.next);
        ListNode FirstHalf = head;
        while(SecondHalf != null){
            if(FirstHalf.val != SecondHalf.val){
                return false;
            }
            FirstHalf = FirstHalf.next;
            SecondHalf = SecondHalf.next;


        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}