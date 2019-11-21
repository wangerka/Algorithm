package com.demos;

import com.common.ListNode;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		printNode(n1);
	}
	
	public static void printNode(ListNode node){
		while(node.next != null){
			System.out.print(node.val+"->");
			node = node.next;
		}
		System.out.println(node.val);
	}

}
