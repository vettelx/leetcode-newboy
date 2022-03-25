package tree;

/**
 * LeetCode110 Balanced Binary Tree
 *
 * @author qiang.xu
 * @since 2022/3/22
 */
public class LeetCode110 {

    /**
     * Top-down
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    /**
     * bottom-up
     * better than top-down
     *
     * @param root
     * @return
     */
    public boolean isBalanced2(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private int dfsHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDfsHeight = dfsHeight(root.left);
        if (leftDfsHeight == -1) {
            return -1;
        }
        int righDfsHeight = dfsHeight(root.right);
        if (righDfsHeight == -1) {
            return -1;
        }

        if (Math.abs(leftDfsHeight - righDfsHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftDfsHeight, righDfsHeight);
    }

}
