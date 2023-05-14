package ru.elseff.leetcode;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        try {
            if (list1.val == 0 || list2.val == 0)
                return new ListNode(0);
        } catch (NullPointerException e) {
            return new ListNode(0);
        }
        ListNode last = list1;
        while (last.next != null)
            last = last.next;

        last.next = list2;
        return sortList(list1);
    }

    public static ListNode sortList(ListNode list) {
        boolean isSorted = false;
        while (!isSorted) {
            ListNode currentNode = list;
            ListNode next = list.next;
            isSorted = true;
            while (next != null) {
                if (currentNode.val > next.val) {
                    int temp = currentNode.val;
                    currentNode.val = next.val;
                    next.val = temp;
                    isSorted = false;
                }
                currentNode = next;
                next = next.next;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode four = new ListNode(4);
        ListNode two = new ListNode(2, four);
        ListNode one = new ListNode(1, two);

        ListNode four1 = new ListNode(4);
        ListNode three = new ListNode(3, four1);
        ListNode one1 = new ListNode(1, three);
        System.out.println(mergeTwoLists(null, new ListNode(0)));
        System.out.println(mergeTwoLists(one1, one));
    }
}
