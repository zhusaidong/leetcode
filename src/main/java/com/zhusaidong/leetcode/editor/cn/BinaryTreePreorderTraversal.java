package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.List;

/**
 * //给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //输入：root = [1,null,2,3]
 * //输出：[1,2,3]
 * //
 * //
 * // 示例 2：
 * //
 * //
 * //输入：root = []
 * //输出：[]
 * //
 * //
 * // 示例 3：
 * //
 * //
 * //输入：root = [1]
 * //输出：[1]
 * //
 * //
 * // 示例 4：
 * //
 * //
 * //输入：root = [1,2]
 * //输出：[1,2]
 * //
 * //
 * // 示例 5：
 * //
 * //
 * //输入：root = [1,null,2]
 * //输出：[1,2]
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 树中节点数目在范围 [0, 100] 内
 * // -100 <= Node.val <= 100
 * //
 * //
 * //
 * //
 * // 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 * // Related Topics 栈 树
 * // 👍 454 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 */
public class BinaryTreePreorderTraversal{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
			/**
			 * Definition for a binary tree node.
			 * public class TreeNode {
			 *     int val;
			 *     TreeNode left;
			 *     TreeNode right;
			 *     TreeNode() {}
			 *     TreeNode(int val) { this.val = val; }
			 *     TreeNode(int val, TreeNode left, TreeNode right) {
			 *         this.val = val;
			 *         this.left = left;
			 *         this.right = right;
			 *     }
			 * }
			 */
	class Solution{
		public List<Integer> preorderTraversal(TreeNode root){
			List<Integer> preorder = new ArrayList<>();
			if(root == null){
				return preorder;
			}
			
			//根节点在前，叫前序
			preorder.add(root.val);
			preorder.addAll(preorderTraversal(root.left));
			preorder.addAll(preorderTraversal(root.right));
			
			return preorder;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
