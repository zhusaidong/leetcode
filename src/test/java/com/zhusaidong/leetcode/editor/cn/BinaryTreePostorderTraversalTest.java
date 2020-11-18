package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

import java.util.Arrays;

public class BinaryTreePostorderTraversalTest{
	@Test
	public void testSolution(){
		BinaryTreePostorderTraversal.Solution solution = new BinaryTreePostorderTraversal.Solution();
		
		//Assert
		Assert.assertEquals(Arrays.asList(3, 2, 1),
				solution.postorderTraversal(TreeNodeUtil.create(1, null, TreeNodeUtil.create(2, 3, null))));
	}
}
	