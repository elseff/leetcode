package ru.elseff.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon   "));
    }

    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (length > 0)
                    return length;
            } else length++;
        }
        return length;
    }

}
