package October;


import java.util.*;

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
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> listNode = new ArrayDeque<>();
        listNode.offer(root);
        List<Double> answer = new ArrayList<>();


        while (!listNode.isEmpty()) {
            Queue<TreeNode> smallList = new ArrayDeque<>();
            double len = 0;
            double sum = 0;
            while (!listNode.isEmpty()) {
                TreeNode node = listNode.poll();
                sum += node.val;
                len += 1;
                if(node.left != null) {
                    smallList.offer(root.left);
                }
                if(node.right != null) {
                    smallList.offer(root.right);
                }
            }
            answer.add(sum/len);
            listNode = smallList;
        }
        return answer;


    }
}