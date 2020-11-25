package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * //根据一棵树的中序遍历与后序遍历构造二叉树。
 * //
 * // 注意:
 * //你可以假设树中没有重复的元素。
 * //
 * // 例如，给出
 * //
 * // 中序遍历 inorder = [9,3,15,20,7]
 * //后序遍历 postorder = [9,15,7,20,3]
 * //
 * // 返回如下的二叉树：
 * //
 * //     3
 * //   / \
 * //  9  20
 * //    /  \
 * //   15   7
 * //
 * // Related Topics 树 深度优先搜索 数组
 * // 👍 405 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">从中序与后序遍历序列构造二叉树</a>
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal{
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
		public TreeNode buildTree(int[] inorder, int[] postorder){
			List<Integer> inOrder   = Arrays.stream(inorder).boxed().collect(Collectors.toList());
			List<Integer> postOrder = Arrays.stream(postorder).boxed().collect(Collectors.toList());
			
			//System.out.println(inOrder);
			//System.out.println(postOrder);
			/*
			 * 中序遍历 inorder = [9,3,15,20,7] 左根右
			 * 后序遍历 postorder = [9,15,7,20,3] 左右根
			 * 返回如下的二叉树：
			 *     3
			 *    / \
			 *   9  20
			 *     /  \
			 *    15   7
			 */
			/*
			 * 中序遍历 inorder = [1,2,3,4] 左根右
			 * 后序遍历 postorder = [2,1,4,3] 左右根
			 * 返回如下的二叉树:[3,1,4,null,2]
			 *    3
			 *   / \
			 *  1   4
			 *  \
			 *   2
			 */
			
			return buildTree(inOrder, postOrder);
		}
		
		public TreeNode buildTree(List<Integer> inOrder, List<Integer> postOrder){
			//System.out.println("=====================");
			if(inOrder.size() == 0){
				return null;
			}
			if(inOrder.size() == 1){
				Integer root = inOrder.remove(0);
				postOrder.remove(root);
				return new TreeNode(root);
			}
			
			//后序最后一项为根节点
			int rootNode = postOrder.remove(postOrder.size() - 1);
			//System.out.println("rootNode=" + rootNode);
			//System.out.println("postOrder=" + postOrder);
			int rootIndex = inOrder.indexOf(rootNode);
			//System.out.println("rootIndex=" + rootIndex);
			if(rootIndex == -1){
				return null;
			}
			
			TreeNode treeNode = new TreeNode(rootNode);
			
			List<Integer> left = new ArrayList<>(inOrder.subList(0, rootIndex));
			//System.out.println("left=" + left);
			List<Integer> right = new ArrayList<>(inOrder.subList(rootIndex + 1, inOrder.size()));
			//System.out.println("right=" + right);
			
			treeNode.right = buildTree(right, postOrder);
			treeNode.left = buildTree(left, postOrder);
			
			return treeNode;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
