package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNode;
import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

public class MaximumDepthOfBinaryTreeTest{
	@Test
	public void testSolution(){
		MaximumDepthOfBinaryTree.Solution solution = new MaximumDepthOfBinaryTree.Solution();
		
		//Assert
		TreeNode node = TreeNodeUtil.create(3, TreeNodeUtil.create(9), TreeNodeUtil.create(20, 15, 7));
		Assert.assertEquals(3, solution.maxDepth(node));
	}
}
	