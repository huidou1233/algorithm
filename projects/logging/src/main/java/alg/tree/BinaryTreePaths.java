package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> paths = new LinkedList<String>();
        construct_paths(root, "", paths);
        return paths;
    }

    public void construct_paths(TreeNode root, String path, List<String> paths){
        if (root != null){
            path += Integer.toString(root.val);
            if ((root.left == null) && (root.right== null)) {
                paths.add(path);
            } else {
                path += "->";
                construct_paths(root.left,path, paths);
                construct_paths(root.right, path, paths);
            }
        }
    }
}
