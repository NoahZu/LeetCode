package 树的遍历.q94_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归 o(n)
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) {
            return result;
        }
        if(root.left != null) {
            result.addAll(inorderTraversal(root.left));
        }
        result.add(root.val);
        if(root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}
