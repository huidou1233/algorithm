package alg.tree;

public class RangeSumBST {
    int ans;
    public int rangeSumBST(TreeNode node, int L, int R){
        ans = 0;
        dfs(node, L, R);
        return ans;
    }

    private void dfs(TreeNode node, int l, int r) {
        if (node != null) {
            if (l <= node.val && node.val <= r) {
                ans += node.val;
            }
            if (l < node.val) {
                dfs(node.left, l, r);
            }

            if (node.val < r) {
                dfs(node.right, l, r);
            }
        }
    }
}
