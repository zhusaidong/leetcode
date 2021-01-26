package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class NumberOfEquivalentDominoPairsTest{
	@Test
	public void testSolution(){
		NumberOfEquivalentDominoPairs.Solution solution = new NumberOfEquivalentDominoPairs.Solution();
		
		//Assert
		//162533
		int[][] dominoes = {
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
				{1, 2}, {2, 1}, {3, 4}, {5, 6},
		};
		Assert.assertEquals("dominoes = [ [1,2],[2,1],[3,4],[5,6] ] => 1", solution.numEquivDominoPairs(dominoes), 1);
	}
}
	