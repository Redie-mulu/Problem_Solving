package October;

public class MinimumDept {
    int min = Integer.MIN_VALUE;

    public int minDepth(TreeNode root) {
        if (root.right == null && root.left == null) return 1;
        return Math.min(minDepth(root.left), minDepth(root.right));

    }
   /* public int minDepth2(TreeNode root) {
        if (root == null) return 0;
        int len = 1;
        while (root.left != null || root.right != null) {
            if (root.right != null) {
                return len + minDepth(root.right);
            }
            if (len < min) min = len;
            if (root.left != null) {
                return 1 + minDepth(root.left);
            }
        }


    }*/
}

/*
*  List<Integer> temp = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return temp;
        if(root.left != null) {
            inorderTraversal(root.left);
        }
        temp.add(root.val);

        if(root.right != null) {
            inorderTraversal(root.right);
        }

    }*/
//*  public int minDepth2(TreeNode root) {
//        if (root == null) return 0;
//        int len = 1;
//        while (root.left != null || root.right != null) {
//            if (root.right != null) {
//                return len + minDepth(root.right);
//            }
//            if (len < min) min = len;
//            if (root.left != null) {
//                return 1 + minDepth(root.left);
//            }
//        }
//
//
//    }