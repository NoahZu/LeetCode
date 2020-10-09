package 快慢指针遍历.q141_环形链表.f1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        if(head == null || head.next == null) {
            return false;
        }

        while(slowNode != null && fastNode != null) {
            slowNode = slowNode.next;
            if(fastNode.next == null) {
                fastNode = null;
            } else {
                fastNode = fastNode.next.next;
            }

            if(slowNode == fastNode) {
                return true;
            }
        }

        return false;

    }
}
