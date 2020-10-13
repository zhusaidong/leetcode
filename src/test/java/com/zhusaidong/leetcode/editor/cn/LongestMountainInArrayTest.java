package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.*;

public class LongestMountainInArrayTest{
	private void testEquals(int[] a, int right){
		LongestMountainInArray.Solution solution = new LongestMountainInArray.Solution();
		
		Assert.assertEquals(right + "," + Arrays.toString(a), right, solution.longestMountain(a));
	}
	
	@Test
	public void testSolution(){
		//Assert
		this.testEquals(new int[] {2, 1, 4, 7, 3, 2, 5}, 5);
		this.testEquals(new int[] {2, 2, 2}, 0);
		this.testEquals(new int[] {1, 2, 7, 4, 5, 6, 7, 6, 5, 7, 3, 2, 1}, 6);
		this.testEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0);
		this.testEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, 0);
		this.testEquals(new int[] {2, 3, 3, 2, 0, 2}, 0);
		this.testEquals(new int[] {0,0,1,0,0,1,1,1,1,1}, 3);
	}
}
