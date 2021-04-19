package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class FindPivotIndexTest{
	@Test
	public void testSolution(){
		FindPivotIndex.Solution solution = new FindPivotIndex.Solution();
		
		//Assert
		Assert.assertEquals(1, solution.pivotIndex(new int[] {-1, -1, -1, -1, 0, 1}));
		Assert.assertEquals(3,solution.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
		Assert.assertEquals(2,solution.pivotIndex(new int[] {1, 1, 1, 2}));
		Assert.assertEquals(2,solution.pivotIndex(new int[] {-1, -1, -1, -1, -1, 0}));
		Assert.assertEquals(-1,solution.pivotIndex(new int[] {-1, -1, -1, -1, -1, -1}));
		Assert.assertEquals(-1,solution.pivotIndex(new int[] {1, 2, 3}));
		Assert.assertEquals(2,solution.pivotIndex(new int[] {1, 3, 1, 1, 1, 1, 1}));
	}
}
	