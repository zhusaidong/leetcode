package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class MinCostClimbingStairsTest{
	@Test
	public void testSolution(){
		MinCostClimbingStairs.Solution solution = new MinCostClimbingStairs.Solution();
		
		//Assert
		Assert.assertEquals(solution.minCostClimbingStairs(new int[] {10, 15, 20}), 15);
		Assert.assertEquals(solution.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}), 6);
		Assert.assertEquals(solution.minCostClimbingStairs(new int[] {0, 0, 0, 1}), 0);
		Assert.assertEquals(solution.minCostClimbingStairs(new int[] {0, 1, 1, 0}), 1);
	}
}
