package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.*;

public class SortColorsTest{
	@Test
	public void testSolution(){
		SortColors.Solution solution = new SortColors.Solution();
		
		int[] nums;
		
		//Assert
		nums = new int[] {0};
		solution.sortColors(nums);
		Assert.assertEquals("2,0,1", Arrays.toString(new int[] {0}), Arrays.toString(nums));
	}
}