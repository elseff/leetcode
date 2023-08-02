package ru.elseff.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int firstPointer = 0;
        int lastPointer = 0;
        while (firstPointer < nums.length) {
            while (lastPointer < nums.length) {
                if (nums[firstPointer] + nums[lastPointer] == target && firstPointer!=lastPointer) {
                    int[] result = new int[2];
                    result[0] = firstPointer;
                    result[1] = lastPointer;
                    return result;
                }
                lastPointer += 1;
            }
            firstPointer += 1;
            lastPointer = firstPointer;
        }
        return new int[0];
    }

    public static int[] improvedTwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current)) {
                return new int[]{i, map.get(current)};
            } else {
                map.put(target - current, i);
            }
        }
        return new int[0];
    }
}
