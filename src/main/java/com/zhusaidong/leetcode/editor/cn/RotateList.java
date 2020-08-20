package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * <p>
 * 解释:
 * <p>
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * <p>
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * <p>
 * 解释:
 * <p>
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * <p>
 * Related Topics 链表 双指针
 * <p>
 * 👍 319 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/rotate-list/">旋转链表</a>
 */
public class RotateList{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public ListNode rotateRight(ListNode head, int k){
			if(head == null || k == 0 || head.next == null){
				return head;
			}
			
			//System.out.println("========================================");
			//System.out.println("原始head=" + head);
			
			int      number         = 0;
			ListNode numberListNode = head;
			while(numberListNode != null){
				numberListNode = numberListNode.next;
				number++;
			}
			k %= number;
			
			for(int i = 0; i < k; i++){
				//System.out.println("-----------------");
				ListNode nextLast = head;
				while(nextLast.next.next != null){
					nextLast = nextLast.next;
				}
				ListNode next = nextLast.next;
				nextLast.next = null;
				next.next = head;
				head = next;
				
				//System.out.println("head=" + head);
			}
			
			return head;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
