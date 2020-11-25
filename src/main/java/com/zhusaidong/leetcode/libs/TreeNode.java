package com.zhusaidong.leetcode.libs;

import java.util.*;

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
	public TreeNode(int x){
		val = x;
	}
	
	@Override
	public String toString(){
		List<Integer> treeList = new ArrayList<>();
		toPrint(this, treeList);
		return String.valueOf(treeList);
	}
	
	/**
	 * Print.
	 *
	 * @param treeNode the tree node
	 * @param treeList the tree list
	 */
	private void toPrint(TreeNode treeNode, List<Integer> treeList){
		treeList.add(treeNode.val);
		if(treeNode.left == null && treeNode.right == null){
			return;
		}
		
		if(treeNode.left == null){
			treeList.add(null);
		}else{
			this.toPrint(treeNode.left, treeList);
		}
		
		if(treeNode.right == null){
			treeList.add(null);
		}else{
			this.toPrint(treeNode.right, treeList);
		}
	}
}
