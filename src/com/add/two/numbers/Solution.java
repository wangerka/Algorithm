package com.add.two.numbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1);
        ListNode start = p;
        int extra=0;
        
        while(l1 != null || l2!= null || extra!=0){
            int a = l1==null?0:l1.val;
            int b = l2==null?0:l2.val;
            int sum = a+b + extra;
            extra = sum/10;
            
            p.next = new ListNode(sum%10);
            p=p.next;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        
        return start.next;
    }
}
