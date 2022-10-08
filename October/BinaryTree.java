package October;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BinaryTree {

//
//    public static void main(String[] args) {
//        List<Integer> temp1 =  new ArrayList<>();
//        temp1.size()
//    }
}
/*
*
*
* /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*class Solution {
    List<Integer> temp1 =  new ArrayList<>();
    List<Integer> temp2 = new ArrayList();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if(p == null && q = null) return true;
        if(temp1.size() != temp2.size()) return false;
        for(int i = 0; i < temp1.size(); i++) {
            if(temp1.get(i) != temp2.get(i)) return false;
        }
        return true;

    }
    public List<Integer> firstTree(TreeNode p) {
        // if(p == null) return temp1;
        temp1.add(p.val);
        if(p.left != null) {
            firstTree(p.left);
        }
        if(p.left == null) temp1.add(null);
        if(p.right != null) {
            firstTree(p.right);
        }

        return temp1;
    }
    public List<Integer> secondTree(TreeNode q) {
        if(q == null) return temp2;
        temp1.add(q.val);
        if(q.left != null) {
            secondTree(q.left);
        }
        if(q.left == null) temp2.add(null);
        if(q.right != null) {
            secondTree(q.right);
        }

////        return temp2;
//    }
//}*/