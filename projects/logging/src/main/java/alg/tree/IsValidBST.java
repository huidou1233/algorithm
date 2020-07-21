package alg.tree;

public class IsValidBST {
    long lastVal = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root){
        return dfs(root);
    }

    boolean dfs(TreeNode root){
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if(root.val <= lastVal) return false;
        lastVal = (long) root.val;
        if (!isValidBST(root.right)) return false;
        return true;
    }
}
