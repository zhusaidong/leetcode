package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.ListNode;
import org.junit.*;

public class KthNodeFromEndOfListLcciTest{
    @Test
    public void testSolution(){
        KthNodeFromEndOfListLcci.Solution solution = new KthNodeFromEndOfListLcci.Solution();
        
        //Assert
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Assert.assertEquals(5, solution.kthToLast(listNode, 1));
        Assert.assertEquals(4, solution.kthToLast(listNode, 2));
        Assert.assertEquals(3, solution.kthToLast(listNode, 3));
        Assert.assertEquals(2, solution.kthToLast(listNode, 4));
        Assert.assertEquals(1, solution.kthToLast(listNode, 5));
    }
}
    