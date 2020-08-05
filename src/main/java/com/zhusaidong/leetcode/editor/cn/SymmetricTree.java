package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定一个二叉树，检查它是否是镜像对称的。
 * //
 * //
 * //
 * // 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * //
 * //     1
 * //   / \
 * //  2   2
 * // / \ / \
 * //3  4 4  3
 * //
 * //
 * //
 * //
 * // 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * //
 * //     1
 * //   / \
 * //  2   2
 * //   \   \
 * //   3    3
 * //
 * //
 * //
 * //
 * // 进阶：
 * //
 * // 你可以运用递归和迭代两种方法解决这个问题吗？
 * // Related Topics 树 深度优先搜索 广度优先搜索
 * // 👍 895 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/symmetric-tree/">对称二叉树</a>
 */
public class SymmetricTree{
	public static void main(String[] args){
		Solution solution = new SymmetricTree()
				.new Solution();
		
		TreeNode tree1 = TreeNodeUtil.create(1, TreeNodeUtil.create(2, 3, 4), TreeNodeUtil.create(2, 4, 3));
		System.out.println(solution.isSymmetric(tree1));
		TreeNode tree2 = TreeNodeUtil.create(1, TreeNodeUtil.create(2, null, 3), TreeNodeUtil.create(2, null, 3));
		System.out.println(solution.isSymmetric(tree2));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 * int val;
	 * TreeNode left;
	 * TreeNode right;
	 * TreeNode(int x) { val = x; }
	 * }
	 */
	class Solution{
		public boolean isSymmetric(TreeNode root){
			if(root == null){
				return true;
			}
			return isSymmetric(root.left, root.right);
		}
		
		public boolean isSymmetric(TreeNode left, TreeNode right){
			if(left == null && right == null){
				return true;
			}
			if(left == null || right == null){
				return false;
			}
			return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
