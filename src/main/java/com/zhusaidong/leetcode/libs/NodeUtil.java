package com.zhusaidong.leetcode.libs;

/**
 * Node
 *
 * @author zhusaidong
 */
@SuppressWarnings("unused")
public class NodeUtil{
	/**
	 * Create empty tree node.
	 *
	 * @return the tree node
	 */
	public static Node createEmpty(){
		return null;
	}
	
	/**
	 * Create tree node.
	 *
	 * @param root the root
	 *
	 * @return the tree node
	 */
	public static Node create(Integer root){
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
	public static Node create(Integer root, Object left, Object right){
		Node node = new Node(root);
		node.left = getNode(left);
		node.right = getNode(right);
		
		return node;
	}
	
	/**
	 * Get tree node.
	 *
	 * @param obj the obj
	 *
	 * @return the tree node
	 */
	private static Node getNode(Object obj){
		if(obj == null){
			return null;
		}
		if(obj instanceof Node){
			return (Node)obj;
		}
		if(obj instanceof Integer){
			return new Node((int)obj);
		}
		return null;
	}
}
