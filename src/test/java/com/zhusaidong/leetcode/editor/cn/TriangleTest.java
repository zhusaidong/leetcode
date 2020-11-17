package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TriangleTest{
	@Test
	public void testSolution(){
		Triangle.Solution solution = new Triangle.Solution();
		
		//Assert
		List<List<Integer>> triangle = new ArrayList<>();
		triangle.add(Collections.singletonList(2));
		triangle.add(Arrays.asList(3, 4));
		triangle.add(Arrays.asList(6, 5, 7));
		triangle.add(Arrays.asList(4, 1, 8, 3));
		
		Assert.assertEquals(11, solution.minimumTotal(triangle));
	}
}
	