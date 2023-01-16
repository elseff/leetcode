package ru.elseff.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    void twoSum_Success() {
        int[] nums = new int[]{7, 1, 4, 4, 5};
        int target = 11;

        int[] expectedArray = new int[]{0, 2};
        int[] actualArray = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}