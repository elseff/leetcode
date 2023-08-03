package ru.elseff.leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missing(nums));
    }

    public static int missing(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i : nums) sum -= i;
        return sum;
    }
}
