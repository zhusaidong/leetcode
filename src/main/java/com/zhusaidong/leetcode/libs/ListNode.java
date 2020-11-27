package com.zhusaidong.leetcode.libs;

/**
 * List node
 *
 * @author zhusaidong
 */
@SuppressWarnings("unused")
public class ListNode{
	/**
	 * 值
	 */
	public int val;
	/**
	 * 下个节点
	 */
	public ListNode next;
	
	/**
	 * 构造方法
	 */
	public ListNode(){
	}
	
	/**
	 * 构造方法
	 *
	 * @param val 值
	 */
	public ListNode(int val){
		this.val = val;
	}
	
	/**
	 * 构造方法
	 *
	 * @param val  值
	 * @param next 下个节点
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
