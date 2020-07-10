package com.zhusaidong.leetcode.libs;

/**
 * The type Tree node.
 *
 * @author zhusaidong <zhusaidong@gmail.com>
 */
@SuppressWarnings("unused")
public class TreeNode{
	/**
	 * The Val.
	 */
	public int      val;
	/**
	 * The Left.
	 */
	public TreeNode left;
	/**
	 * The Right.
	 */
	public TreeNode right;
	
	/**
	 * Instantiates a new Tree node.
	 */
	TreeNode(){
	}
	
	/**
	 * Instantiates a new Tree node.
	 *
	 * @param x the x
	 */
	TreeNode(int x){
		val = x;
	}
}
