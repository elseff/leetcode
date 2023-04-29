package ru.elseff.leetcode;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] chars = new char[str.length()];
        str.getChars(0, str.length(), chars, 0);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[(chars.length - 1) - i])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome2(int x){
        String str = String.valueOf(x);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i)!= str.charAt((str.length()-1)-i))
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));
        System.out.println(isPalindrome2(12221));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome2(1234));
    }
}
