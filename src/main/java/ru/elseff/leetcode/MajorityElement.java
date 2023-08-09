package ru.elseff.leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3,2};
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
            else if (nums[i]==result) {
                count++;
            }else {
                count--;
            }
        }
        return result;
    }


}
