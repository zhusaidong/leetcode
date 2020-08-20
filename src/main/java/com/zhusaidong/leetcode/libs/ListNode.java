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
	public int      val;
	/**
	 * The Next.
	 */
	public ListNode next;
	
	/**
	 * Instantiates a new List node.
	 */
	public ListNode(){
	}
	
	/**
	 * Instantiates a new List node.
	 *
	 * @param val the val
	 */
	public ListNode(int val){
		this.val = val;
	}
	
	/**
	 * Instantiates a new List node.
	 *
	 * @param val  the val
	 * @param next the next
	 */
	public ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString(){
		StringBuilder sb      = new StringBuilder();
		ListNode      pointer = this;
		while(pointer != null){
			sb.append("[").append(pointer.val).append("|-]->");
			pointer = pointer.next;
		}
		sb.append("null");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object object){
		if(this == object){
			return true;
		}
		if(object == null || getClass() != object.getClass()){
			return false;
		}
		ListNode listNode = (ListNode)object;
		return this.toString().equals(listNode.toString());
	}
}
