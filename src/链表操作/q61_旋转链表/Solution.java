package 链表操作.q61_旋转链表;

/**
 * 先连接成环再找断点 o(n)
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) {
            return head;
        }

        //连成环并计算出节点个数
        int nodeCount = 0;
        ListNode currentNode = head;
        ListNode oldTail = null;
        while(currentNode != null) {
            currentNode = currentNode.next;
            nodeCount ++;
            
            if(oldTail ==  null && currentNode.next == null) {
                oldTail = currentNode;
            }
        }
        oldTail.next = head;
        
        ListNode newTail = head;
        int newPosition = nodeCount - k % nodeCount;
        while(newPosition > 1) {
            newTail = newTail.next;
            newPosition --;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;

    }
}
