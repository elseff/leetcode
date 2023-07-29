package ru.elseff.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        if (x == 0)
            return x;
        StringBuilder result = new StringBuilder();
        if (x < 0) {
            result.append("-");
            x = Math.abs(x);
        }
        while (x > 0) {
            result.append(x % 10);
            x /= 10;
        }
        try {
            return Integer.parseInt(result.toString());
        }catch (NumberFormatException e){
            return 0;
        }
    }

}
