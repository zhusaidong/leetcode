package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class UniquePathsTest{
	@Test
	public void testSolution(){
		UniquePaths.Solution solution = new UniquePaths.Solution();
		
		//Assert
		Assert.assertEquals(3, solution.uniquePaths(3, 2));
		Assert.assertEquals(28, solution.uniquePaths(7, 3));
	}
}
	