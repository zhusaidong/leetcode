package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class UniquePathsIiTest{
	@Test
	public void testSolution(){
		UniquePathsIi.Solution solution = new UniquePathsIi.Solution();
		
		//Assert
		int[][] obstacleGrid = new int[][] {
				new int[] {0, 0, 0},
				new int[] {0, 1, 0},
				new int[] {0, 0, 0}
		};
		//Assert.assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
		
		obstacleGrid = new int[][] {
				new int[] {0, 1},
				new int[] {0, 0}
		};
		//Assert.assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
		
		obstacleGrid = new int[][] {
				new int[] {0, 0},
				new int[] {1, 1},
				new int[] {0, 0},
		};
		Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
	}
}
	