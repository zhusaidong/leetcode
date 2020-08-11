package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class ThreeSumClosestTest{
	@Test
	public void testSolution(){
		ThreeSumClosest.Solution solution = new ThreeSumClosest.Solution();
		
		//Assert
		Assert.assertEquals("nums = [1,2,4,8,16,32,64,128], target = 82", 82, solution.threeSumClosest(new int[] {1,2,4,8,16,32,64,128}, 82));
		Assert.assertEquals("nums = [1,1,-1,-1,3], target = -1", -1, solution.threeSumClosest(new int[] {1,1,-1,-1,3}, -1));
		Assert.assertEquals(-57, solution.threeSumClosest(new int[] {-16,-2,17,-16,3,-7,-13,20,-4,12,5,13,-7,0,5,4,-17,-16,9,1,8,-6,0,-8,16,10,-6,9,-4,12,16,5,19,2,-9,-17,-8,-17,7,-10,2,20,-18,-20,-14,-6,6,17,-10,-8,18,-15,7,-9,13,13,-13,3,18,10,12,16,-6,-19,-6,-13,8,-5,16,5,8,-3,-9,-9,-5,14,14,-13,-18,13,15,-3,9,14,18,-14,-14,1,20,-4,-6,0,3,15,20,20,9,13,-8,-1,-2,6}, -58));
		Assert.assertEquals("nums = [0,2,1,-3], target = 1", 0, solution.threeSumClosest(new int[] {0, 2, 1, -3}, 1));
		Assert.assertEquals("nums = [0,0,0], target = 1", 0, solution.threeSumClosest(new int[] {0, 0, 0}, 1));
		Assert.assertEquals("nums = [-1,2,1,-4], target = 1", 2, solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
		
	}
}
	