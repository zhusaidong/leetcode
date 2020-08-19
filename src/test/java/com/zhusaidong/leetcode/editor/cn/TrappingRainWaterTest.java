package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class TrappingRainWaterTest{
	@Test
	public void testSolution(){
		TrappingRainWater.Solution solution = new TrappingRainWater.Solution();
		
		//Assert
		Assert.assertEquals("[5,2,1,2,1,5]=>14", 14, solution.trap(new int[] {5, 2, 1, 2, 1, 5}));
		Assert.assertEquals("[5,4,1,2]=>1", 1, solution.trap(new int[] {5, 4, 1, 2}));
		//^型
		Assert.assertEquals("[2,3,2]=>0", 0, solution.trap(new int[] {2, 3, 2}));
		//V型
		Assert.assertEquals("[2,0,2]=>2", 2, solution.trap(new int[] {2, 0, 2}));
		Assert.assertEquals("[0,1,0,2,1,0,1,3,2,1,2,1]=>6", 6,
				solution.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
	}
}
	