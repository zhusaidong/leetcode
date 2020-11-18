package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.List;

/**
 * //给定一个二叉树，返回它的 后序 遍历。
 * //
 * // 示例:
 * //
 * // 输入: [1,null,2,3]
 * //   1
 * //    \
 * //     2
 * //    /
 * //   3
 * //
 * //输出: [3,2,1]
 * //
 * // 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * // Related Topics 栈 树
 * // 👍 475 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 */
public class BinaryTreePostorderTraversal{
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
		public List<Integer> postorderTraversal(TreeNode root){
			List<Integer> postOrder = new ArrayList<>();
			if(root == null){
				return postOrder;
			}
			
			postOrder.addAll(postorderTraversal(root.left));
			postOrder.addAll(postorderTraversal(root.right));
			//根节点在后面，后序
			postOrder.add(root.val);
			
			return postOrder;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
