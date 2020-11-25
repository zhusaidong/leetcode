package com.zhusaidong.leetcode.libs;

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
	 * @param root the root
	 *
	 * @return the tree node
	 */
	public static TreeNode create(Integer root){
		return create(root, null, null);
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
	public static TreeNode create(Integer root, Object left, Object right){
		TreeNode treeNode = new TreeNode(root);
		treeNode.left = getNode(left);
		treeNode.right = getNode(right);
		
		return treeNode;
	}
	
	/**
	 * Get tree node.
	 *
	 * @param obj the obj
	 *
	 * @return the tree node
	 */
	private static TreeNode getNode(Object obj){
		if(obj == null){
			return null;
		}
		if(obj instanceof TreeNode){
			return (TreeNode)obj;
		}
		if(obj instanceof Integer){
			return new TreeNode((int)obj);
		}
		return null;
	}
}
