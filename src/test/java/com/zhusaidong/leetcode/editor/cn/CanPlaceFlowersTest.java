package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class CanPlaceFlowersTest{
	@Test
	public void testSolution(){
		CanPlaceFlowers.Solution solution = new CanPlaceFlowers.Solution();
		
		//Assert
		Assert.assertTrue("[0,0,1,0,0], n =1", solution.canPlaceFlowers(new int[] {0,0,1,0,0}, 1));
		/*
		Assert.assertTrue("[0], n =1", solution.canPlaceFlowers(new int[] {0}, 1));
		Assert.assertFalse("[0], n =2", solution.canPlaceFlowers(new int[] {0}, 2));
		Assert.assertTrue("[0,0], n =1", solution.canPlaceFlowers(new int[] {0, 0}, 1));
		Assert.assertFalse("[0,0], n =2", solution.canPlaceFlowers(new int[] {0, 0}, 2));
		Assert.assertTrue("[1,0,0,0,1], n = 1", solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
		Assert.assertFalse("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
		Assert.assertTrue("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {0, 0, 1, 0, 1}, 1));
		Assert.assertFalse("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {0, 1, 0, 0, 1}, 1));
		Assert.assertFalse("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {1, 0, 1, 0, 1}, 1));
		Assert.assertFalse("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {0, 1, 0, 1, 0}, 1));
		Assert.assertTrue("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {0, 1, 0, 0, 0}, 1));
		Assert.assertTrue("[1,0,0,0,1], n = 2", solution.canPlaceFlowers(new int[] {1,0,0,0,1,0,0}, 2));
		*/
	}
}
	