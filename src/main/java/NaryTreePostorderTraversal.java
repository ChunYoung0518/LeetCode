import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {

// Definition for a Node.
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
};


    class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> res = new ArrayList<>();
            recersive(root, res);
            return res;

        }

        private void recersive(Node root, List<Integer> list) {
            if(null == root){
                return;
            }
            if(root.children != null && root.children.size() != 0) {
                for(Node child : root.children) {
                    recersive(child, list);
                }
            }
            list.add(root.val);

        }
    }
}
