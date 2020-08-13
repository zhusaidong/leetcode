package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.*;

public class FourSumTest{
	@Test
	public void testSolution(){
		FourSum.Solution solution = new FourSum.Solution();
		
		//Assert
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(Arrays.asList(-2, 0, 0, 2));
		lists.add(Arrays.asList(-2, -1, 1, 2));
		lists.add(Arrays.asList(-1, 0, 0, 1));
		Assert.assertEquals("1, 0, -1, 0, -2, 2", lists, solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
	}
}