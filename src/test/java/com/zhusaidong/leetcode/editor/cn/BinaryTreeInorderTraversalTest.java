package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

import java.util.Arrays;
import java.util.Collections;

public class BinaryTreeInorderTraversalTest{
	@Test
	public void testSolution(){
		BinaryTreeInorderTraversal.Solution solution = new BinaryTreeInorderTraversal.Solution();
		
		//Assert
		Assert.assertEquals(Arrays.asList(1, 3, 2),
				solution.inorderTraversal(TreeNodeUtil.create(1, null, TreeNodeUtil.create(2, 3, null))));
		Assert.assertEquals(Collections.emptyList(), solution.inorderTraversal(TreeNodeUtil.createEmpty()));
		Assert.assertEquals(Collections.singletonList(1), solution.inorderTraversal(TreeNodeUtil.create(1)));
		Assert.assertEquals(Arrays.asList(2, 1), solution.inorderTraversal(TreeNodeUtil.create(1, 2, null)));
		Assert.assertEquals(Arrays.asList(1, 2), solution.inorderTraversal(TreeNodeUtil.create(1, null, 2)));
	}
}
