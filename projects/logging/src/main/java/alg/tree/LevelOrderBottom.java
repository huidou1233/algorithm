package alg.tree;

import java.util.*;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> tmp = new ArrayList<Integer>();
            int len = q.size();
            for (int i = 0; i < len; i++){
                TreeNode node = q.poll();
                tmp.add(node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
             ans.add(0, tmp);
        }
        return ans;
    }
}