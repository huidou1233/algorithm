package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class Preorder {
    private List<Integer> result;
    public List<Integer> preorder(Node root) {
        result = new LinkedList<Integer>();
        dfs(root);
        return result;
    }

    public void dfs(Node root){
        if (root == null) return;
        result.add(root.val);
        for (Node node : root.children)
            dfs(node);
    }
}
