package 树的遍历.q102_二叉树的层次遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 利用队列迭代 o(n)
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i<len;i++) {
                TreeNode node = queue.pop();
                list.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
