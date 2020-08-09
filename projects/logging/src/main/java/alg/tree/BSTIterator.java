package alg.tree;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        this._leftMostInorder(root);
    }

    private void _leftMostInorder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode topMostNode = this.stack.pop();
        if (topMostNode.right != null) {
            this._leftMostInorder(topMostNode.right);
        }
        return topMostNode.val;
    }

    public boolean hasNext() {
        return this.stack.size() > 0;
    }

}
