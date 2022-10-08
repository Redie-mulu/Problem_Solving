package August.Leet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MaximumDepthOfBinaryTree {
    public class TreeNode {
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

    class Solution {

        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }

        // bfs tree traversal
        public int maxDepth2(TreeNode root) {
            if (root == null) return 0;
            int level = 0;
            Queue<TreeNode> bfsQueue = new LinkedList<>();

            bfsQueue.add(root);
            while (root != null) {
                for (int i = 0; i < bfsQueue.size(); i++) {
                    TreeNode node = bfsQueue.remove();
                    if (node.left != null) bfsQueue.add(node.left);
                    if (node.right != null) bfsQueue.add(node.right);
                }
                level++;
            }
            return level;
        }
        // dfs tree traversal
        /*public  int maxDepth(TreeNode root) {
            if(root == null) return 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(root.val);
            while (!stack.isEmpty()) {
//                node, d
            }
        }*/
    }
}


