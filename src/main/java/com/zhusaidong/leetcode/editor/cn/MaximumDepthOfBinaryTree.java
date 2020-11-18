package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定一个二叉树，找出其最大深度。
 * //
 * // 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * //
 * // 说明: 叶子节点是指没有子节点的节点。
 * //
 * // 示例：
 * //给定二叉树 [3,9,20,null,null,15,7]，
 * //     3
 * //   / \
 * //  9  20
 * //    /  \
 * //   15   7
 * // 返回它的最大深度 3 。
 * // Related Topics 树 深度优先搜索
 * // 👍 740 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/">二叉树的最大深度</a>
 */
public class MaximumDepthOfBinaryTree{
	/*
	 
	 */
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
		public int maxDepth(TreeNode root){
			if(root == null){
				return 0;
			}
			
			return levelDepth(root, 1);
		}
		
		private Integer levelDepth(TreeNode node, Integer level){
			if(node == null){
				return level - 1;
			}
			return Math.max(levelDepth(node.left, level + 1), levelDepth(node.right, level + 1));
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
