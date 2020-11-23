package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNode;
import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

public class PathSumTest{
	@Test
	public void testSolution(){
		PathSum.Solution solution = new PathSum.Solution();
		
		//Assert
		/*
		 *      5
		 *     / \
		 *    4   8
		 *   /   / \
		 *  11  13  4
		 * /  \      \
		 *7    2      1
		 */
		TreeNode tree = TreeNodeUtil.create(5, TreeNodeUtil.create(4, TreeNodeUtil.create(11, 7, 2), null),
				TreeNodeUtil.create(8, TreeNodeUtil.create(13), TreeNodeUtil.create(4, null, 1)));
		Assert.assertTrue(solution.hasPathSum(tree, 22));
	}
}
	