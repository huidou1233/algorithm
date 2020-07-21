package alg.tree;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorder(Node root){
        dfs(root);
        return res;
    }

    public void dfs(Node root) {
        if (root == null)
            return;
        for (Node node: root.children)
            dfs(node);
        res.add(root.val);
    }
}
