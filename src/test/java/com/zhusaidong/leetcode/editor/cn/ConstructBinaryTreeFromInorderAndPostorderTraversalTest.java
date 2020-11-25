package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest{
	@Test
	public void testSolution(){
		ConstructBinaryTreeFromInorderAndPostorderTraversal.Solution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal.Solution();
		
		//Assert
		//Assert.assertEquals(TreeNodeUtil.create(3, 9, TreeNodeUtil.create(20, 15, 7)).toString(), solution.buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9, 15, 7, 20, 3}).toString());
		Assert.assertEquals(TreeNodeUtil.create(3, TreeNodeUtil.create(1, null, 2), TreeNodeUtil.create(4)).toString(),
				solution.buildTree(new int[] {1, 2, 3, 4}, new int[] {2, 1, 4, 3}).toString());
	}
}
	