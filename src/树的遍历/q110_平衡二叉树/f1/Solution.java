package 树的遍历.q110_平衡二叉树.f1;

/**
 * 从顶至底遍历 o(n^2)
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(!isBalanced(root.left)) {
            return false;
        }
        if(!isBalanced(root.right)) {
            return false;
        }
        if(Math.abs(height(root.left) - height(root.right))  > 1 ) {
            return false;
        }
        return true;
    }

    int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}
