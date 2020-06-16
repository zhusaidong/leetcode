package com.zhusaidong.leetcode.libs;

/**
 * The type List node.
 *
 * @author zhusaidong <zhusaidong@gmail.com>
 */
@SuppressWarnings("unused")
public class ListNode{
	/**
	 * The Val.
	 */
	int      val;
	/**
	 * The Next.
	 */
	ListNode next;
	
	/**
	 * Instantiates a new List node.
	 */
	ListNode(){
	}
	
	/**
	 * Instantiates a new List node.
	 *
	 * @param val the val
	 */
	ListNode(int val){
		this.val = val;
	}
	
	/**
	 * Instantiates a new List node.
	 *
	 * @param val  the val
	 * @param next the next
	 */
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString(){
		return "ListNode{" + "val=" + val + ", next=" + next + '}';
	}
}
