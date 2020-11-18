package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreePreorderTraversalTest{
	@Test
	public void testSolution(){
		BinaryTreePreorderTraversal.Solution solution = new BinaryTreePreorderTraversal.Solution();
		
		//Assert
		Assert.assertEquals(Arrays.asList(1, 2, 3),
				solution.preorderTraversal(TreeNodeUtil.create(1, null, TreeNodeUtil.create(2, 3, null))));
		Assert.assertEquals(Collections.emptyList(), solution.preorderTraversal(TreeNodeUtil.createEmpty()));
		Assert.assertEquals(Collections.singletonList(1), solution.preorderTraversal(TreeNodeUtil.create(1)));
		Assert.assertEquals(Arrays.asList(1, 2), solution.preorderTraversal(TreeNodeUtil.create(1, 2, null)));
		Assert.assertEquals(Arrays.asList(1, 2), solution.preorderTraversal(TreeNodeUtil.create(1, null, 2)));
	}
}
	