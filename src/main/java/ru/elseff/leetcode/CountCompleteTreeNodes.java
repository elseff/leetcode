package ru.elseff.leetcode;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        one.left = two;
        TreeNode three = new TreeNode(3);
        one.right = three;
        two.left = new TreeNode(4);
        two.right = new TreeNode(5);
        three.left = new TreeNode(6);
        System.out.println(countNodes(one));
    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

