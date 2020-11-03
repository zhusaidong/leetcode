package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class HouseRobberIiTest{
	@Test
	public void testSolution(){
		HouseRobberIi.Solution solution = new HouseRobberIi.Solution();
		
		//Assert
		Assert.assertEquals(solution.rob(new int[] {2, 3, 2}), 3);
		Assert.assertEquals(solution.rob(new int[] {1, 2, 3, 1}), 4);
		Assert.assertEquals(solution.rob(new int[] {1, 1, 3, 6, 7, 10, 7, 1, 8, 5, 9, 1, 4, 4, 3}), 41);
		Assert.assertEquals(solution.rob(new int[] {2, 2, 4, 3, 2, 5}), 10);
	}
}
