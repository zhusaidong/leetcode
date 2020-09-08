package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayIiTest{
	private void assertEquals(int[] nums, int[] rightNums){
		RemoveDuplicatesFromSortedArrayIi.Solution solution = new RemoveDuplicatesFromSortedArrayIi.Solution();
		
		String origin  = Arrays.toString(nums);
		int[]  newNums = new int[solution.removeDuplicates(nums)];
		System.arraycopy(nums, 0, newNums, 0, newNums.length);
		Assert.assertEquals(origin, Arrays.toString(rightNums), Arrays.toString(newNums));
	}
	
	@Test
	public void testSolution(){
		//Assert
		this.assertEquals(new int[] {1, 1, 1, 2, 2, 2, 3, 3}, new int[] {1, 1, 2, 2, 3, 3});
		this.assertEquals(new int[] {1, 1, 1}, new int[] {1, 1});
		this.assertEquals(new int[] {1, 1, 1, 2, 2, 3}, new int[] {1, 1, 2, 2, 3});
		this.assertEquals(new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3}, new int[] {0, 0, 1, 1, 2, 3, 3});
		this.assertEquals(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5});
		this.assertEquals(new int[] {1}, new int[] {1});
	}
}
