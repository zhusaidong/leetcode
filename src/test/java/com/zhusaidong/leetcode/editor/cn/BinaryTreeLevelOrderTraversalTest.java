package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalTest{
	@Test
	public void testSolution(){
		BinaryTreeLevelOrderTraversal.Solution solution = new BinaryTreeLevelOrderTraversal.Solution();
		
		//Assert
		List<List<Integer>> list = new ArrayList<>();
		list.add(Collections.singletonList(3));
		list.add(Arrays.asList(9, 20));
		list.add(Arrays.asList(15, 7));
		
		Assert.assertEquals(list,
				solution.levelOrder(TreeNodeUtil.create(3, TreeNodeUtil.create(9), TreeNodeUtil.create(20, 15, 7))));
	}
}