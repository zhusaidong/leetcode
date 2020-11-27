package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.Node;
import com.zhusaidong.leetcode.libs.NodeUtil;
import org.junit.*;

public class PopulatingNextRightPointersInEachNodeTest{
	@Test
	public void testSolution(){
		PopulatingNextRightPointersInEachNode.Solution solution = new PopulatingNextRightPointersInEachNode.Solution();
		
		//Assert
		Node node = NodeUtil.create(1, NodeUtil.create(2, 4, 5), NodeUtil.create(3, 6, 7));
		node.left.next = node.right;
		node.left.left.next = node.left.right;
		node.left.right.next = node.right.left;
		node.right.left.next = node.right.right;
		
		Assert.assertEquals(node, solution.connect(node));
	}
}
