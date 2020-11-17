package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class MinimumPathSumTest{
	@Test
	public void testSolution(){
		MinimumPathSum.Solution solution = new MinimumPathSum.Solution();
		
		//Assert
		int[][] grid = new int[][] {
				new int[] {1, 3, 1},
				new int[] {1, 5, 1},
				new int[] {4, 2, 1}
		};
		Assert.assertEquals(7, solution.minPathSum(grid));
		
		grid = new int[][] {
				new int[] {1, 2, 3},
				new int[] {4, 5, 6},
				};
		Assert.assertEquals(12, solution.minPathSum(grid));
	}
}
