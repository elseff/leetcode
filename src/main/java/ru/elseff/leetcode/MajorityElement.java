package ru.elseff.leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3,2,2,3,4,4,4,4,4};
        System.out.println(majority(nums));
    }

    public static int majority(int[] nums) {
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count==0){
                result = nums[i];
                count++;
            }
            else if (nums[i]==count) {
                count++;
            }else {
                count--;
            }
        }
        return result;
    }
}
