package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class MaximumProductSubarrayTest{
	@Test
	public void testSolution(){
		MaximumProductSubarray.Solution solution = new MaximumProductSubarray.Solution();
		
		//Assert
		Assert.assertEquals("2, 3, -2, 4=>6", solution.maxProduct(new int[] {2, 3, -2, 4}), 6);
		Assert.assertEquals("-2, 0, -1=>6", solution.maxProduct(new int[] {-2, 0, -1}), 0);
		Assert.assertEquals("-2, 2, -3=>12", solution.maxProduct(new int[] {-2, 2, -3}), 12);
	}
}
	