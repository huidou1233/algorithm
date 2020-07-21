package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new LinkedList<Integer>();
        traverse(root, vals);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int v: vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }

    public void traverse(TreeNode root, List<Integer> vals){
        if (root == null) return;
        traverse(root.left, vals);
        vals.add(root.val);
        traverse(root.right, vals);
    }
}
