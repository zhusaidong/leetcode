package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.*;

/**
 * //输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，
 * //它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * //
 * //
 * //
 * // 示例：
 * //
 * // 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * //
 * //返回链表 4->5.
 * // Related Topics 链表 双指针
 * // 👍 98 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">链表中倒数第k个节点</a>
 */
public class LianBiaoZhongDaoShuDiKgeJieDianLcof{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public ListNode getKthFromEnd(ListNode head, int k){
			ListNode fastPoint = head;
			ListNode slowPoint = head;
			
			//快指针先走k步，然后2指针同时走
			while(fastPoint != null){
				fastPoint = fastPoint.next;
				if(k <= 0){
					slowPoint = slowPoint.next;
				}
				k--;
			}
			return slowPoint;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
