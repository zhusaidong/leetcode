package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;
import org.junit.*;

public class LianBiaoZhongDaoShuDiKgeJieDianLcofTest{
	@Test
	public void testSolution(){
		LianBiaoZhongDaoShuDiKgeJieDianLcof.Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof.Solution();
		
		//Assert
		// 给定一个链表: 1->2->3->4->5, 和 k = 2.返回链表 4->5.
		Assert.assertEquals("1->2->3->4->5, 和 k = 2", ListNodeUtil.create(4, 5),
				solution.getKthFromEnd(ListNodeUtil.create(1, 2, 3, 4, 5), 2));
	}
}