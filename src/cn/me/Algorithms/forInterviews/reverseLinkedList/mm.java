package cn.me.Algorithms.forInterviews.reverseLinkedList;

import cn.me.Algorithms.reverse.ListNode;

public class mm {

    public static void main(String[] args) {

        cn.me.Algorithms.reverse.ListNode head = new cn.me.Algorithms.reverse.ListNode();
        head.setValue(0);
        cn.me.Algorithms.reverse.ListNode tmp = head;
        for (int i = 1; i < 10; i++) {


            cn.me.Algorithms.reverse.ListNode node = new ListNode();
            node.setValue(i);

            tmp.setNode(node);
            tmp = node;
        }
        tmp = head;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNode();
        }
        ListNode newHead = reverseList(head);
        tmp = newHead;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNode();
        }

    }

    static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode  node;
        while (head != null) {
            //1. 对之前的链表做头删
            node = head;
            head = head.getNode();

            //2. 对新链表做头插
            node.setNode( newHead);
            newHead = node;
        }
        return newHead;
    }

}
