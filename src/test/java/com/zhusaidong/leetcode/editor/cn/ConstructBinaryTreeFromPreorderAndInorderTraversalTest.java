package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.TreeNodeUtil;
import org.junit.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest{
	@Test
	public void testSolution(){
		ConstructBinaryTreeFromPreorderAndInorderTraversal.Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal.Solution();
		
		//Assert
		/*
		 * // 例如，给出
		 * // 前序遍历 preorder = [3,9,20,15,7]
		 * // 中序遍历 inorder = [9,3,15,20,7]
		 * // 返回如下的二叉树：
		 * //    3
		 * //   / \
		 * //  9  20
		 * //    /  \
		 * //   15   7
		 */
		Assert.assertEquals(TreeNodeUtil.create(3, 9, TreeNodeUtil.create(20, 15, 7)).toString(),
				solution.buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7}).toString());
	}
}