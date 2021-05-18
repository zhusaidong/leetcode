package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.CycleLinkedList;
import com.zhusaidong.leetcode.libs.ListNode;
import com.zhusaidong.leetcode.libs.ListNodeUtil;
import org.junit.*;

public class LinkedListCycleIiTest{
    @Test
    public void testSolution(){
        LinkedListCycleIi.Solution solution = new LinkedListCycleIi.Solution();
    
        //Assert
        ListNode listNode1 = CycleLinkedList.create(ListNodeUtil.create(1, 2, 3, 4, 5), 2);
        System.out.println(solution.detectCycle(listNode1));
        ListNode listNode2 = CycleLinkedList.create(ListNodeUtil.create(1, 2, 3, 4, 5), -1);
        System.out.println(solution.detectCycle(listNode2));
        
    }
}