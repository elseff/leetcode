package ru.elseff.leetcode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode one = new TreeNode(1, two, three);

        System.out.println(myMaxDepth(one));
    }

    public static int myMaxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null)
            return Math.max(myMaxDepth(root.left), myMaxDepth(root.right)) + 1;
        else if (root.left != null)
            return myMaxDepth(root.left) + 1;
        else
            return myMaxDepth(root.right) + 1;
    }

    public static int fastestMaxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(fastestMaxDepth(root.left), fastestMaxDepth(root.right)) + 1;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
