package alg.tree;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum){
        return helper(root, 0, sum);
    }

    public boolean helper(TreeNode root,int cur,int sum){
        if (root == null) return false;

        cur = cur + root.val;
        if (root.left == null && root.right == null){
            return cur == sum;
        } else {
            return helper(root.left, cur, sum) || helper(root.right, cur, sum);
        }
    }
}
