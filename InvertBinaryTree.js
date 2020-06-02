/*Invert a binary tree
Input:
     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:
     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/
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
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root) {
        if (root == null)
            return;

        if (root.left != null && root.right != null) {
            invert(root.left);
            invert(root.right);
        }
        else if (root.left != null && root.right == null) {
            invert(root.left);
        }
        else if (root.right != null && root.left == null) {
            invert(root.right);
        }
        else if (root.right == null && root.left == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}