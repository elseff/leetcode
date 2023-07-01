package ru.elseff.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsertPosition(nums, target));
    }

    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle])
                return middle;
            if (target < nums[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return left;
    }

    public static int searchInsertPosition1(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
                return i;
            if (nums[i]<target)
                index++;
            else
                break;
        }
        return index;
    }
}
