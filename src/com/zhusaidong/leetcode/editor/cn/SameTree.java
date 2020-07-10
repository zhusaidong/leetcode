package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定两个二叉树，编写一个函数来检验它们是否相同。
 * //
 * // 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * //
 * // 示例 1:
 * //
 * // 输入:       1         1
 * //          / \       / \
 * //         2   3     2   3
 * //
 * //        [1,2,3],   [1,2,3]
 * //
 * //输出: true
 * //
 * // 示例 2:
 * //
 * // 输入:      1          1
 * //          /           \
 * //         2             2
 * //
 * //        [1,2],     [1,null,2]
 * //
 * //输出: false
 * //
 * //
 * // 示例 3:
 * //
 * // 输入:       1         1
 * //          / \       / \
 * //         2   1     1   2
 * //
 * //        [1,2,1],   [1,1,2]
 * //
 * //输出: false
 * //
 * // Related Topics 树 深度优先搜索
 * // 👍 394 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/same-tree/">相同的树</a>
 */
public class SameTree{
	public static void main(String[] args){
		Solution solution = new SameTree()
				.new Solution();
		
		TreeNode tree1 = TreeNodeUtil.create(1, 2, 3);
		TreeNode tree2 = TreeNodeUtil.create(1, 2, 3);
		System.out.println(solution.isSameTree(tree1, tree2));
		
		TreeNode tree3 = TreeNodeUtil.create(1, 2, null);
		TreeNode tree4 = TreeNodeUtil.create(1, null, 2);
		System.out.println(solution.isSameTree(tree3, tree4));
		
		TreeNode tree5 = TreeNodeUtil.create(1, tree1, tree2);
		TreeNode tree6 = TreeNodeUtil.create(1, tree3, tree4);
		System.out.println(solution.isSameTree(tree5, tree6));
		
		TreeNode tree7 = TreeNodeUtil.createEmpty();
		TreeNode tree8 = TreeNodeUtil.createEmpty();
		System.out.println(solution.isSameTree(tree7, tree8));
		
		TreeNode tree9  = TreeNodeUtil.create(12, -60, null);
		TreeNode tree10 = TreeNodeUtil.create(12, 72, null);
		System.out.println(solution.isSameTree(tree9, tree10));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public boolean isSameTree(TreeNode p, TreeNode q){
			return isSameTreeNode(p, q);
		}
		
		private boolean isSameTreeNode(TreeNode p, TreeNode q){
			if(!isSameTreeVal(p, q)){
				return false;
			}
			
			if(p == null){
				return true;
			}
			
			if(!(p.left == null && q.left == null) && !isSameTreeNode(p.left, q.left)){
				return false;
			}
			
			if(p.right == null && q.right == null){
				return true;
			}else{
				return isSameTreeNode(p.right, q.right);
			}
		}
		
		private boolean isSameTreeVal(TreeNode p, TreeNode q){
			return (p == null && q == null) || (p != null && q != null && p.val == q.val);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
