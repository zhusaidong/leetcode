package com.zhusaidong.leetcode.libs;

/**
 * The type Cycle linked list.
 *
 * @author zhusaidong
 */
public class CycleLinkedList{
	/**
	 * Create list node.
	 *
	 * @param head the head
	 * @param pos  the pos
	 *
	 * @return the list node
	 */
	public static ListNode create(ListNode head, int pos){
		if(pos < 0){
			return head;
		}
		
		ListNode tail    = head;
		ListNode pointer = null;
		while(tail.next != null){
			pos--;
			tail = tail.next;
			if(pos == -1){
				pointer = tail;
			}
		}
		tail.next = pointer;
		
		return head;
	}
}
