package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * //根据一棵树的前序遍历与中序遍历构造二叉树。
 * // 注意:
 * //你可以假设树中没有重复的元素。
 * <p>
 * // 例如，给出
 * // 前序遍历 preorder = [3,9,20,15,7]
 * // 中序遍历 inorder = [9,3,15,20,7]
 * // 返回如下的二叉树：
 * //     3
 * //   / \
 * //  9  20
 * //    /  \
 * //   15   7
 * <p>
 * // Related Topics 树 深度优先搜索 数组
 * // 👍 770 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">从前序与中序遍历序列构造二叉树</a>
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal{
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
		public TreeNode buildTree(int[] preorder, int[] inorder){
			List<Integer> preOrder = Arrays.stream(preorder).boxed().collect(Collectors.toList());
			List<Integer> inOrder  = Arrays.stream(inorder).boxed().collect(Collectors.toList());
			
			return buildTree(preOrder, inOrder);
		}
		
		public TreeNode buildTree(List<Integer> preOrder, List<Integer> inOrder){
			if(inOrder.size() == 0){
				return null;
			}
			if(inOrder.size() == 1){
				Integer root = inOrder.remove(0);
				preOrder.remove(root);
				return new TreeNode(root);
			}
			
			//前序第一个必为根节点
			Integer root      = preOrder.remove(0);
			int     rootIndex = inOrder.indexOf(root);
			if(rootIndex == -1){
				return null;
			}
			
			List<Integer> left  = new ArrayList<>(inOrder.subList(0, rootIndex));
			List<Integer> right = new ArrayList<>(inOrder.subList(rootIndex + 1, inOrder.size()));
			
			TreeNode treeNode = new TreeNode(root);
			
			treeNode.left = buildTree(preOrder, left);
			treeNode.right = buildTree(preOrder, right);
			
			return treeNode;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
