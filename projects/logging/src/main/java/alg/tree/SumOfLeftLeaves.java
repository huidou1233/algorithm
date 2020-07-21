package alg.tree;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root){
        return helper(root, false);
    }

    public int helper(TreeNode root, boolean flag){
        if (root == null){
            return 0;
        }
        if (flag && root.left == null && root.right == null){
            return root.val;
        }
        int leftSum = helper(root.left, true);

        int rightSum = helper(root.right, false);

        return leftSum + rightSum;
    }
}
