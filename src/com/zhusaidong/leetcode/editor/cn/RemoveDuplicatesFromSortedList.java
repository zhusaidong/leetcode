package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * //
 * // 示例 1:
 * //
 * // 输入: 1->1->2
 * //输出: 1->2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: 1->1->2->3->3
 * //输出: 1->2->3
 * // Related Topics 链表
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/">删除排序链表中的重复元素</a>
 */
public class RemoveDuplicatesFromSortedList{
	public static void main(String[] args){
		Solution solution = new RemoveDuplicatesFromSortedList()
				.new Solution();
		ListNode head = ListNodeUtil.create(1, 1, 2, 3, 4, 4, 4);
		ListNodeUtil.print(head);
		ListNodeUtil.print(solution.deleteDuplicates(head));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) { val = x; }
	 * }
	 */
	class Solution{
		public ListNode deleteDuplicates(ListNode head){
			ListNode list = head;
			while(head != null){
				while(head.next != null && head.next.val == head.val){
					head.next = head.next.next;
				}
				
				head = head.next;
			}
			return list;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
