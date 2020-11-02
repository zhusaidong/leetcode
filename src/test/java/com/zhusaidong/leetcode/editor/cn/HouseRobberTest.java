package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class HouseRobberTest{
	@Test
	public void testSolution(){
		HouseRobber.Solution solution = new HouseRobber.Solution();
		
		//Assert
		Assert.assertEquals(4, solution.rob(new int[] {1, 2, 3, 1}));
		Assert.assertEquals(12, solution.rob(new int[] {2, 7, 9, 3, 1}));
		Assert.assertEquals(4, solution.rob(new int[] {2, 3, 2}));
		Assert.assertEquals(4, solution.rob(new int[] {2, 1, 1, 2}));
		Assert.assertEquals(2, solution.rob(new int[] {2, 1}));
	}
}