package ru.elseff.leetcode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode fifth = new ListNode(3);
        ListNode fourth = new ListNode(3, fifth);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(1, third);
        ListNode first = new ListNode(1, second);
        System.out.println(deleteDuplicates(first));
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }

        return head;
    }


    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
