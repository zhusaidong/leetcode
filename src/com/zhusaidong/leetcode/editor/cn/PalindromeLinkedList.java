package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //请判断一个链表是否为回文链表。
 * //
 * // 示例 1:
 * //
 * // 输入: 1->2
 * //输出: false
 * //
 * // 示例 2:
 * //
 * // 输入: 1->2->2->1
 * //输出: true
 * //
 * //
 * // 进阶：
 * //你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * // Related Topics 链表 双指针
 * // 👍 559 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/palindrome-linked-list/">回文链表</a>
 */
public class PalindromeLinkedList{
	public static void main(String[] args){
		Solution solution = new PalindromeLinkedList()
				.new Solution();
		
		ListNode listNode1 = ListNodeUtil.create(1, 2);
		System.out.println(solution.isPalindrome(listNode1));
		ListNode listNode2 = ListNodeUtil.create(1, 2, 2, 1);
		System.out.println(solution.isPalindrome(listNode2));
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
		/**
		 * 翻转链表
		 *
		 * @param head the listNode
		 *
		 * @return the list node
		 *
		 * @see <a href="https://blog.csdn.net/xu491361421xiao/article/details/81385435">翻转链表</a>
		 */
		private ListNode flipListNode(ListNode head){
			ListNode listNode = head;
			//创建翻转链表，初始化空节点
			ListNode flipListNode = null;
			while(listNode != null){
				//先保存下一个节点，因为当前节点需要断开，如果不保存，就会找不到下一个节点了
				ListNode temp = listNode.next;
				//将当前节点指向尾部节点，即当前节点放在尾部前面。即把尾部挂到当前节点后面
				listNode.next = flipListNode;
				//将翻转链表的当前节点指向到这个节点，组成新的翻转链表
				flipListNode = listNode;
				//将下一个节点变成当前节点，以便继续下一次循环
				listNode = temp;
			}
			return flipListNode;
		}
		
		public boolean isPalindrome(ListNode head){
			if(head == null || head.next == null){
				return true;
			}
			
			ListNode faster       = head;
			ListNode slower       = head;
			boolean  isSlowerMove = false;
			while(faster != null){
				if(isSlowerMove){
					slower = slower.next;
				}
				isSlowerMove = !isSlowerMove;
				faster = faster.next;
			}
			
			ListNode flipSlower = this.flipListNode(slower);
			while(flipSlower != null){
				if(flipSlower.val != head.val){
					return false;
				}
				flipSlower = flipSlower.next;
				head = head.next;
			}
			
			return true;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
