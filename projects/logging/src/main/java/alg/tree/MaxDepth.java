package alg.tree;

public class MaxDepth {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node node: root.children){
            int depth = maxDepth(node);
            max = Math.max(max, depth);
        }
        return max + 1;
    }
}
