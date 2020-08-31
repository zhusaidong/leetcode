package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class CircularArrayLoopTest{
	@Test
	public void testSolution(){
		CircularArrayLoop.Solution solution = new CircularArrayLoop.Solution();
		
		//Assert
		Assert.assertTrue("1,1,2", solution.circularArrayLoop(new int[] {1, 1, 2}));
		Assert.assertFalse("[-8,-1,1,7,2]", solution.circularArrayLoop(new int[] {-8, -1, 1, 7, 2}));
		Assert.assertFalse("[-2,-3,-9]", solution.circularArrayLoop(new int[] {-2, -3, -9}));
		Assert.assertTrue("3,1,2", solution.circularArrayLoop(new int[] {3, 1, 2}));
		Assert.assertTrue("2,-1,1,2,2", solution.circularArrayLoop(new int[] {2, -1, 1, 2, 2}));
		Assert.assertFalse("-1,2", solution.circularArrayLoop(new int[] {-1, 2}));
		Assert.assertFalse("-2,1,-1,-2,-2", solution.circularArrayLoop(new int[] {-2, 1, -1, -2, -2}));
		Assert.assertFalse("-1,-2,-3,-4,-5", solution.circularArrayLoop(new int[] {-1, -2, -3, -4, -5}));
	}
}
	