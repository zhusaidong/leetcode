package com.zhusaidong.leetcode.libs;

/**
 * List node工具，调试时使用，提交代码时需要删除，避免错误
 *
 * @author zhusaidong <zhusaidong@gmail.com>
 */
@SuppressWarnings("unused")
public class ListNodeUtil{
	/**
	 * Create list node.
	 *
	 * @param numbers the numbers
	 *
	 * @return the list node
	 */
	public static ListNode create(int... numbers){
		ListNode listNode = new ListNode();
		ListNode pointer  = listNode;
		int      length   = numbers.length;
		for(int i = 0; i < length; i++){
			pointer.val = numbers[i];
			if(i < length - 1){
				pointer = pointer.next = new ListNode();
			}
		}
		return listNode;
	}
	
	/**
	 * Print list node.
	 *
	 * @param listNode the list node
	 */
	public static void print(ListNode listNode){
		StringBuilder sb      = new StringBuilder();
		ListNode      pointer = listNode;
		while(pointer != null){
			sb.append("[").append(pointer.val).append("|-]->");
			pointer = pointer.next;
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
}
