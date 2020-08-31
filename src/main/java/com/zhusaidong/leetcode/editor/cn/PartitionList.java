package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * //
 * // 你应当保留两个分区中每个节点的初始相对位置。
 * //
 * // 示例:
 * //
 * // 输入: head = 1->4->3->2->5->2, x = 3
 * //输出: 1->2->2->4->3->5
 * //
 * // Related Topics 链表 双指针
 * // 👍 248 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/partition-list/">分隔链表</a>
 */
public class PartitionList{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		/**
		 * “小于x的”排在“大于x的”前面
		 *
		 * @param head the head
		 * @param x    the x
		 *
		 * @return the list node
		 */
		public ListNode partition(ListNode head, int x){
			if(head == null || head.next == null){
				return head;
			}
			
			//虚拟一个头结点，使得头结点的处理逻辑不用单独写。
			ListNode dummyNode = new ListNode();
			dummyNode.next = head;
			
			ListNode little = dummyNode;
			
			while(true){
				while(little.next != null && little.next.val < x){
					little = little.next;
				}
				//System.out.println("little=" + little);
				
				ListNode big = little;
				while(big.next != null && big.next.val >= x){
					big = big.next;
				}
				//System.out.println("big=" + big);
				
				//移动节点
				ListNode next = big.next;
				if(next == null){
					break;
				}else{
					big.next = next.next;
					next.next = little.next;
					little.next = next;
				}
			}
			
			return dummyNode.next;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
