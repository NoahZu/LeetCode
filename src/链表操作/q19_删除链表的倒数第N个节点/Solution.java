package 链表操作.q19_删除链表的倒数第N个节点;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
        if(head.next == null && n == 0) {
            return head;
        }
        if(head.next == null && n == 1) {
            return null;
        }

        ListNode preTargetNode = null;
        boolean preTagetMoveFloag = false;

        ListNode currentNode = head;
        int moveCount = 0;

        while(currentNode != null) {
            currentNode = currentNode.next;
            moveCount++;

            if(preTagetMoveFloag) {
                preTargetNode = preTargetNode.next;
            }

            if(moveCount - 1 == n) {
                preTagetMoveFloag = true;
                preTargetNode = head;
            }
        }
        if(preTargetNode == null) {
            head = head.next;
        } else if(preTargetNode.next != null) {
            preTargetNode.next = preTargetNode.next.next;
        }
  
        return head;
    }
}
