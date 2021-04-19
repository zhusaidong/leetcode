package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

import java.util.Arrays;

public class IntersectionOfTwoArraysIiTest{
    @Test
    public void testSolution(){
        IntersectionOfTwoArraysIi.Solution solution = new IntersectionOfTwoArraysIi.Solution();
    
        //Assert
        Assert.assertEquals(Arrays.toString(new int[] {2, 2}), Arrays.toString(solution.intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2})));
        Assert.assertEquals(Arrays.toString(new int[] {9, 4}), Arrays.toString(solution.intersect(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4})));
    }
}
