package 链表操作.q2_两数相加;

/**
 * 两次遍历
 * 第一次遍历：两个链表对应每个节点分别取和，若含有空节点则空节点取0，产生一个新链表。
 * 第二次遍历：对取完和的新链表遍历，判断当前的val是否大于等于10，大于或等于则其自身-10其next加1，若next为空则新建0节点。
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode intratorNode = null;
        int temp = 0;
        while(l1 != null || l2 != null) {
            int left = l1 == null ? 0 : l1.val;
            int right = l2 == null ? 0: l2.val;
            int sum = left + right + temp;
            if(sum >= 10) {
                temp = 1;
                sum -= 10;
            } else {
                temp = 0;
            }

            if(intratorNode == null) {
                ans = new ListNode(sum);
                intratorNode = ans;
            } else {
                intratorNode.next = new ListNode(sum);
                intratorNode = intratorNode.next;
            }
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(temp > 0) {
            intratorNode.next = new ListNode(temp);
        }
        return ans;
    }
}
