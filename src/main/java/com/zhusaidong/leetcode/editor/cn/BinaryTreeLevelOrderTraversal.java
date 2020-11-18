package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * //给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * // 示例：
 * //二叉树：[3,9,20,null,null,15,7],
 * //
 * //     3
 * //   / \
 * //  9  20
 * //    /  \
 * //   15   7
 * // 返回其层次遍历结果：
 * // [
 * //  [3],
 * //  [9,20],
 * //  [15,7]
 * //]
 * //
 * // Related Topics 树 广度优先搜索
 * // 👍 698 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/">二叉树的层序遍历</a>
 */
public class BinaryTreeLevelOrderTraversal{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
			/**
			 * Definition for a binary tree node.
			 * public class TreeNode {
			 *     int val;
			 *     TreeNode left;
			 *     TreeNode right;
			 *     TreeNode(int x) { val = x; }
			 * }
			 */
	class Solution{
		/**
		 * 递归法
		 */
		public List<List<Integer>> levelOrder(TreeNode root){
			Map<Integer, List<Integer>> order = new HashMap<>();
			if(root == null){
				return order.values().stream().collect(Collectors.toList());
			}
			
			levelOrderInner(order, root, 0);
			
			return order.values().stream().collect(Collectors.toList());
		}
		
		private void levelOrderInner(Map<Integer, List<Integer>> order, TreeNode root, Integer level){
			if(root == null){
				return;
			}
			List<Integer> integers = order.get(level);
			if(integers == null){
				integers = new ArrayList<>();
			}
			integers.add(root.val);
			order.put(level, integers);
			
			levelOrderInner(order, root.left, level + 1);
			levelOrderInner(order, root.right, level + 1);
		}
		
		/**
		 * 循环法
		 */
		public List<List<Integer>> levelOrder1(TreeNode root){
			List<List<Integer>> order = new ArrayList<>();
			if(root == null){
				return order;
			}
			
			List<TreeNode> currentNode = new ArrayList<>();
			currentNode.add(root);
			
			while(!currentNode.isEmpty()){
				List<Integer>  orderNode = new ArrayList<>();
				List<TreeNode> newNode   = new ArrayList<>();
				currentNode.forEach(treeNode -> {
					if(treeNode != null){
						orderNode.add(treeNode.val);
						
						newNode.add(treeNode.left);
						newNode.add(treeNode.right);
					}
				});
				if(!orderNode.isEmpty()){
					order.add(orderNode);
				}
				currentNode.clear();
				currentNode.addAll(newNode);
				newNode.clear();
			}
			
			return order;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
