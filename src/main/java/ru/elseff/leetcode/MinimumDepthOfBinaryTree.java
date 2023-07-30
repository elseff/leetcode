package ru.elseff.leetcode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1,two, null);
        System.out.println(minDepth(one));
    }
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
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

    private static int minDepth(TreeNode root){
        if (root==null)
            return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth==0 || rightDepth == 0)
            return Math.max(leftDepth,rightDepth)+1;

        return Math.min(leftDepth, rightDepth)+1;
    }



}
