package com.zhusaidong.leetcode.libs;

/**
 * Node
 *
 * @author zhusaidong
 */
@SuppressWarnings("unused")
public class Node{
	/**
	 * 值
	 */
	public int val;
	/**
	 * 左节点
	 */
	public Node left;
	/**
	 * 右节点
	 */
	public Node right;
	/**
	 * 下个节点
	 */
	public Node next;
	
	/**
	 * 构造方法
	 */
	public Node(){
	}
	
	/**
	 * 构造方法
	 *
	 * @param val 值
	 */
	public Node(int val){
		this.val = val;
	}
	
	/**
	 * 构造方法
	 *
	 * @param val   值
	 * @param left  左节点
	 * @param right 右节点
	 * @param next  下个节点
	 */
	public Node(int val, Node left, Node right, Node next){
		this.val = val;
		this.left = left;
		this.right = right;
		this.next = next;
	}
}
