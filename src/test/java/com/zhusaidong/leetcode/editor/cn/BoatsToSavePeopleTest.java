package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.*;

public class BoatsToSavePeopleTest{
	private void assertEquals(int[] people, int limit, int expected){
		BoatsToSavePeople.Solution solution = new BoatsToSavePeople.Solution();
		
		Assert.assertEquals(
				String.format("people = %s, limit = %s, expected = %s", Arrays.toString(people), limit, expected),
				expected, solution.numRescueBoats(people, limit));
	}
	
	@Test
	public void testSolution(){
		//Assert
		
		this.assertEquals(new int[] {1, 2}, 3, 1);
		this.assertEquals(new int[] {3, 2, 2, 1}, 3, 3);
		this.assertEquals(new int[] {3, 5, 3, 4}, 5, 4);
		this.assertEquals(new int[] {1}, 2, 1);
		this.assertEquals(new int[] {2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10}, 50, 11);
	}
}