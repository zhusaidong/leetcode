package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class ContainerWithMostWaterTest{
	@Test
	public void testSolution(){
		ContainerWithMostWater.Solution solution = new ContainerWithMostWater.Solution();
		
		//Assert
		Assert.assertEquals(55, solution.maxArea(new int[] {5, 2, 12, 1, 5, 3, 4, 11, 9, 4}));
		Assert.assertEquals(49, solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
		Assert.assertEquals(1, solution.maxArea(new int[] {1, 1}));
		Assert.assertEquals(24, solution.maxArea(new int[] {1, 3, 2, 5, 25, 24, 5}));
	}
}
	