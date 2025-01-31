package katas.exercises;

/**
 * Kth Smallest Element in a Binary Search Tree
 *
 * Given a BST, write a function to find the Kth smallest element.
 *
 * Example:
 *
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *
 * The 3rd smallest element is 4.
 *
 * Expected time complexity is O(n), while n is the tree height.
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
public class KthSmallestElementInBST {

    public static int kthSmallest(TreeNode root, int k) {

        int[] state = new int[]{0, -1};

        kthSmallest_aux(root, k, state);
        return state[1];
    }

    private static void kthSmallest_aux(TreeNode node, int k, int[] state) {
        if (node == null) return;

        kthSmallest_aux(node.left, k, state);

        state[0]++;
        if (state[0] == k) {
            state[1] = node.val;
            return;
        }

        kthSmallest_aux(node.right, k, state);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        int k = 2;
        int kthSmallestValue = kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest element is: " + kthSmallestValue); // Output: 4
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
