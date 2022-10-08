package September;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevel {

}

//  Definition for a binary tree node.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> storage = new LinkedList<>();
        storage.add(root);

        while (!storage.isEmpty()) {
            int len = storage.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i< len; i++) {
                TreeNode node = storage.poll();
                if(node != null) {
                    level.add(node.val);
                    storage.add(node.left);
                    storage.add(node.right);
                }
            }
            if(!level.isEmpty()) result.add(level);

        }
        return result;
    }

    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        while (root !=  null) {
            List<Integer> element = new LinkedList<>();
            element.add(root.val);

        }

    }*/
}
