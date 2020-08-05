package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定一个链表，判断链表中是否有环。
 * //
 * // 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：head = [3,2,0,-4], pos = 1
 * //输出：true
 * //解释：链表中有一个环，其尾部连接到第二个节点。
 * //
 * //
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：head = [1,2], pos = 0
 * //输出：true
 * //解释：链表中有一个环，其尾部连接到第一个节点。
 * //
 * //
 * //
 * //
 * // 示例 3：
 * //
 * // 输入：head = [1], pos = -1
 * //输出：false
 * //解释：链表中没有环。
 * //
 * //
 * //
 * //
 * //
 * //
 * // 进阶：
 * //
 * // 你能用 O(1)（即，常量）内存解决此问题吗？
 * // Related Topics 链表 双指针
 * // 👍 671 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle/">环形链表</a>
 */
public class LinkedListCycle{
	public static void main(String[] args){
		Solution solution = new LinkedListCycle()
				.new Solution();
		
		ListNode listNode1 = CycleLinkedList.create(ListNodeUtil.create(1, 2, 3, 4, 5), 2);
		System.out.println(solution.hasCycle(listNode1));
		ListNode listNode2 = CycleLinkedList.create(ListNodeUtil.create(1, 2, 3, 4, 5), -1);
		System.out.println(solution.hasCycle(listNode2));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) {
	 * val = x;
	 * next = null;
	 * }
	 * }
	 */
	public class Solution{
		public boolean hasCycle(ListNode head){
			ListNode fastPointer = head;
			ListNode slowPointer = head;
			
			//快指针走2步，慢指针走一步
			boolean isSlowMove = false;
			while(true){
				if(fastPointer == null){
					return false;
				}
				
				fastPointer = fastPointer.next;
				if(isSlowMove){
					slowPointer = slowPointer.next;
				}
				isSlowMove = !isSlowMove;
				
				if(fastPointer == slowPointer){
					return true;
				}
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
