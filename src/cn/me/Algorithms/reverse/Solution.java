package cn.me.Algorithms.reverse;

import java.util.ArrayList;

public class Solution {

    public ListNode ReverseList(ListNode head) {

        ListNode tmp = head;
        ArrayList<ListNode> arr = new ArrayList();
        tmp = head;
        while(tmp!=null){
            arr.add(tmp);
            tmp=tmp.getNode();
        }

        ListNode result = new ListNode();
        tmp = result;
        for (int i=arr.size()-1;i>=0;i--){

            ListNode node = new ListNode();
            node.setValue(arr.get(i).getValue());

            tmp.setNode(node);
            tmp=node;

        }

        return result;

    }

}
