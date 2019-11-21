package com.remove.node.from.end;

import com.common.ListNode;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sta = new ListNode(0);
		ListNode fast = sta;
		ListNode slow = sta;

		fast.next = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return sta.next;

	}
}
