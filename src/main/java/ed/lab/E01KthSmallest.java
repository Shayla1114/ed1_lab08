package ed.lab;
//Shayla De León 1342925
public class E01KthSmallest {

    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode<Integer> root, int k) {
        count = 0;
        result = 0;
        inOrder(root, k);
        return result;
    }

    private void inOrder(TreeNode<Integer> node, int k) {
        if (node == null) return;

        inOrder(node.left, k);

        count++;
        if (count == k) {
            result = node.value;
            return;
        }

        inOrder(node.right, k);
    }
}