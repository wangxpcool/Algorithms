package cn.me.test.stu2022.test1;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        ListNode head = new ListNode();
        ListNode next = new ListNode();
        head.next = next;
        ListNode next2 = new ListNode();
        next.next = next2;
        ListNode next3 = new ListNode();
        next2.next = next3;


        next3.next = head;
        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static class ListNode {
        ListNode next;


        public ListNode getNext() {
            return next;
        }

        private void setNext(ListNode next) {
            this.next = next;
        }
    }
}
