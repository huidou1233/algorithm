package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer>  result = new LinkedList<Integer>();
        TreeNode node = root;
        while (node != null) {
            if (node.left == null){
                result.add(node.val);
                node = node.right;
            } else {
                TreeNode prenode = node.left;
                while ((prenode.right != null) && (prenode.right != node)){
                    prenode = prenode.right;
                }
                if (prenode.right == null){
                    result.add(node.val);
                    prenode.right = node;
                    node = node.left;
                } else {
                    prenode.right = null;
                    node = node.right;
                }
            }
        }
        return result;
    }
}
