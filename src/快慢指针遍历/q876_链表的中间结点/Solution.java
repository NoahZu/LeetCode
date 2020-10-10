package 快慢指针遍历.q876_链表的中间结点;

/**
 * 快慢指针法 o(n)
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode endNode = head;
        ListNode middleNode = head;

        while(endNode != null && endNode.next != null) {
            endNode = endNode.next.next;
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}
