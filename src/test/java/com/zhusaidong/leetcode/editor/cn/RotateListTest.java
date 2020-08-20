package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;
import org.junit.*;

public class RotateListTest{
	@Test
	public void testSolution(){
		RotateList.Solution solution = new RotateList.Solution();
		
		//Assert
		//Assert.assertEquals("1->2->3->NULL, k = 2000000000", ListNodeUtil.create(2, 1),
		//		solution.rotateRight(ListNodeUtil.create(1, 2, 3), 2000000000));
		
		Assert.assertEquals("1->2->NULL, k = 1", ListNodeUtil.create(2, 1),
				solution.rotateRight(ListNodeUtil.create(1, 2), 1));
		
		Assert.assertEquals("1->NULL, k = 1", ListNodeUtil.create(1), solution.rotateRight(ListNodeUtil.create(1), 1));
		
		Assert.assertEquals("1->2->3->4->5->NULL, k = 2", ListNodeUtil.create(4, 5, 1, 2, 3),
				solution.rotateRight(ListNodeUtil.create(1, 2, 3, 4, 5), 2));
		
		Assert.assertEquals("0->1->2->NULL, k = 4", ListNodeUtil.create(2, 0, 1),
				solution.rotateRight(ListNodeUtil.create(0, 1, 2), 4));
	}
}
