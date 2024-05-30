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
class Solution {
    public void travHelper(TreeNode root, List<Integer> output) {
        if (root.left != null) {
            travHelper(root.left, output);
        }
        output.add(root.val);
        if (root.right != null) {
            travHelper(root.right, output);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> numbers = new ArrayList<Integer>();
        if (root == null) {
            return numbers;
        }
        travHelper(root, numbers);
        return numbers;
    }
}