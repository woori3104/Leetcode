/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode DeleteDuplicates(ListNode head) {
        // 현재 노드선언
        ListNode current = head;
        while (current != null && current.next != null) {
            // 다음 노드의 값이 현재노드의 값과 같을때 
            if (current.next.val == current.val) {
                // 현재 노드를 다음 다음 노드와 연결
                current.next = current.next.next;
            } else {
                // 같지않다면 현재노드를 다음노드로 변경
                current = current.next;
            }
        }
        return head;
    }
}