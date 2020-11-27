package com.zhusaidong.leetcode.libs;

import java.util.*;

/**
 * Tree node
 *
 * @author zhusaidong
 */
@SuppressWarnings("unused")
public class TreeNode{
	/**
	 * 值
	 */
	public int val;
	/**
	 * 左节点
	 */
	public TreeNode left;
	/**
	 * 右节点
	 */
	public TreeNode right;
	
	/**
	 * 构造方法
	 */
	TreeNode(){
	}
	
	/**
	 * 构造方法
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
	 * 打印
	 *
	 * @param treeNode tree node
	 * @param treeList tree list
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
