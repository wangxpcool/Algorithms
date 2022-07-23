package cn.me.Algorithms.reverse;

public class mai {


    public static void main(String[] args) {


        ListNode head = new ListNode();
        head.setValue(0);
        ListNode tmp = head;
        for (int i = 1; i < 10; i++) {


            ListNode node = new ListNode();
            node.setValue(i);

            tmp.setNode(node);
            tmp = node;
        }
        tmp = head;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNode();
        }

        Solution solution = new Solution();
        ListNode sss = solution.ReverseList(head);
        tmp = sss;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNode();
        }

    }

}
