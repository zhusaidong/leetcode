package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;
import org.junit.*;

public class PartitionListTest{
	@Test
	public void testSolution(){
		PartitionList.Solution solution = new PartitionList.Solution();
		
		//Assert
		Assert.assertEquals("2,1, x = 2", ListNodeUtil.create(1, 2), solution.partition(ListNodeUtil.create(2, 1), 2));
		Assert.assertEquals("1->4->3->2->5->2, x = 3", ListNodeUtil.create(1, 2, 2, 4, 3, 5),
				solution.partition(ListNodeUtil.create(1, 4, 3, 2, 5, 2), 3));
	}
}
	