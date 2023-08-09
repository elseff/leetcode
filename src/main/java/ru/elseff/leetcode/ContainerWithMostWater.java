package ru.elseff.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        if (n == 2)
            return (int) Math.pow(Math.min(height[0], height[1]), 2);
        int result = 0;
        while (right - left != 0) {
            int min = Math.min(height[left], height[right]);
            int difference = right - left;
            int area = min * difference;
            if (area >= result) {
                result = area;
            }
            if (height[left] == min)
                left++;
            else
                right--;
        }
        return result;
    }
}
