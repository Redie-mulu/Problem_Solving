package September;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class N_aryTree {

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        if(root == null) return list;
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            list.add(node.val);
            Collections.reverse(node.children);

            for(Node child : node.children) {
                stack.add(child);
            }
        }
        return list;
    }

}
