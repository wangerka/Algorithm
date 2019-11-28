package com.leetcode;

import com.common.ListNode;

public class LC21Merge2Lists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current=new ListNode(-1);
        ListNode result=current;
        //如果2个链表长度不一样一旦一个比完了 。另一个就不用比了
        while(l1!=null || l2!=null){
            if(l1 == null) {current.next = l2;
                            return result.next;}
            if(l2 == null) {current.next = l1;
                            return result.next;}
            //int a = l1!=null?l1.val:0;
            //int b = l2!=null?l2.val:0;
            if(l1.val<l2.val){
                //if(current!=null){
                    current.next = l1;
                    current = current.next;
                //}
                //if(l1!= null) 
                    l1= l1.next;
            } else {
                //if(current!=null) {
                    current.next = l2;
                    current = current.next;
                //}
                //if(l2 != null)  
                    l2=l2.next;
            }
        }
        return result.next;
        
    }
}
