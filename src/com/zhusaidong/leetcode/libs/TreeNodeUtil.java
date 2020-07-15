package com.zhusaidong.leetcode.libs;

import java.util.*;

/**
 * Tree node工具，调试时使用，提交代码时需要删除，避免错误
 *
 * @author zhusaidong <zhusaidong@gmail.com>
 */
@SuppressWarnings("unused")
public class TreeNodeUtil{
	/**
	 * Create empty tree node.
	 *
	 * @return the tree node
	 */
	public static TreeNode createEmpty(){
		return null;
	}
	
	/**
	 * Create tree node.
	 *
	 * @param root  the root
	 * @param left  the left
	 * @param right the right
	 *
	 * @return the tree node
	 */
	public static TreeNode create(Integer root, Integer left, Integer right){
		return create(root, left == null ? null : new TreeNode(left), right == null ? null : new TreeNode(right));
	}
	
	/**
	 * Create tree node.
	 *
	 * @param root  the root
	 * @param left  the left
	 * @param right the right
	 *
	 * @return the tree node
	 */
	public static TreeNode create(Integer root, TreeNode left, TreeNode right){
		TreeNode treeNode = new TreeNode(root);
		treeNode.left = left;
		treeNode.right = right;
		
		return treeNode;
	}
}
