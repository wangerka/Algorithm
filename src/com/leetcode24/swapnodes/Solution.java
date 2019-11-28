package com.leetcode24.swapnodes;

import com.common.ListNode;

public class Solution {
	
	/*
	 * 哨兵机制：
	 * 在链表的相关问题中，我们经常会设置一个头指针，而且这个头指针是不存任何有效数据的，只是为了操作方便，这个头指针我们就可以称之为哨兵位了。
例如我们要删除头第一个节点是时候，如果没有设置一个哨兵位，那么在操作上，它会与删除第二个节点的操作有所不同。
但是我们设置了哨兵，那么删除第一个节点和删除第二个节点那么在操作上就一样了，不用做额外的判断。当然，插入节点的时候也一样。
	 */

	
	/*
	 * 画图法：注意在连接节点的时候，最好画个图，以免把自己搞晕了
	 */
	public ListNode swapPairs(ListNode head) {
		
        ListNode guard = new ListNode(0);
        ListNode p= guard;
        p.next = head;
        
        ListNode second = new ListNode(0);
        while(p!=null && p.next!=null && p.next.next!=null){
            second = head.next;
            p.next=second;
            head.next = second.next;
            second.next = head;
            
            p= head;
            head= head.next;
        }
        
        return guard.next;
    }

}
