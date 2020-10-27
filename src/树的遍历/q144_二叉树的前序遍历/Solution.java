package 树的遍历.q144_二叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归法 o(n)
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result  = new ArrayList<Integer>();
        if(root == null) {
            return result;
        }
    
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
