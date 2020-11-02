package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class ErWeiShuZuZhongDeChaZhaoLcofTest{
	@Test
	public void testSolution(){
		ErWeiShuZuZhongDeChaZhaoLcof.Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof.Solution();
		
		//Assert
		int[][] array = new int[][] {
				new int[] {1, 4, 7, 11, 15},
				new int[] {2, 5, 8, 12, 19},
				new int[] {3, 6, 9, 16, 22},
				new int[] {10, 13, 14, 17, 24},
				new int[] {18, 21, 23, 26, 30}
		};
		// 给定 target = 5，返回 true。
		Assert.assertTrue("target = 5，返回 true", solution.findNumberIn2DArray(array, 5));
		// 给定 target = 20，返回 false。
		Assert.assertFalse("target = 20，返回 false", solution.findNumberIn2DArray(array, 20));
		
		array = new int[][] {
		};
		Assert.assertFalse(solution.findNumberIn2DArray(array, 1));
		
		array = new int[][] {
				new int[] {1, 2, 3, 4, 5},
				new int[] {6, 7, 8, 9, 10},
				new int[] {11, 12, 13, 14, 15},
				new int[] {16, 17, 18, 19, 20},
				new int[] {21, 22, 23, 24, 25}
		};
		Assert.assertTrue("target = 19，返回 true", solution.findNumberIn2DArray(array, 19));
		
		array = new int[][] {
				new int[] {-5}
		};
		Assert.assertFalse("target = -2，返回 false", solution.findNumberIn2DArray(array, -2));
	}
}
