package com.leetcode24.swapnodes;

import com.common.ListNode;

public class Solution {
	
	/*
	 * �ڱ����ƣ�
	 * ���������������У����Ǿ���������һ��ͷָ�룬�������ͷָ���ǲ����κ���Ч���ݵģ�ֻ��Ϊ�˲������㣬���ͷָ�����ǾͿ��Գ�֮Ϊ�ڱ�λ�ˡ�
��������Ҫɾ��ͷ��һ���ڵ���ʱ�����û������һ���ڱ�λ����ô�ڲ����ϣ�������ɾ���ڶ����ڵ�Ĳ���������ͬ��
���������������ڱ�����ôɾ����һ���ڵ��ɾ���ڶ����ڵ���ô�ڲ����Ͼ�һ���ˣ�������������жϡ���Ȼ������ڵ��ʱ��Ҳһ����
	 */

	
	/*
	 * ��ͼ����ע�������ӽڵ��ʱ����û���ͼ��������Լ�������
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
