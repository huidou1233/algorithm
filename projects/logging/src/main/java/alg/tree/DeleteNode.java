package alg.tree;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            if (root.left != null && root.right != null){
                TreeNode node = root.right;
                while (node.left != null) {
                    node = node.left;
                }
                node.left = root.left;
                return root.right;
            }
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    TreeNode getMax(TreeNode node) {
        while (node.right != null) node = node.right;
        return node;
    }
}
