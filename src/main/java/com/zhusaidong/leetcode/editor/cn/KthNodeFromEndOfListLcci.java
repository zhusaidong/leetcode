package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * //
 * // 注意：本题相对原题稍作改动
 * //
 * // 示例：
 * //
 * // 输入： 1->2->3->4->5 和 k = 2
 * //输出： 4
 * //
 * // 说明：
 * //
 * // 给定的 k 保证是有效的。
 * // Related Topics 链表 双指针
 * // 👍 66 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/">返回倒数第 k 个节点</a>
 */
public class KthNodeFromEndOfListLcci{
    static
            //leetcode submit region begin(Prohibit modification and deletion)
            /**
             * Definition for singly-linked list.
             * public class ListNode {
             *     int val;
             *     ListNode next;
             *     ListNode(int x) { val = x; }
             * }
             */
    class Solution{
        public int kthToLast(ListNode head, int k){
            if(k <= 0){
                return 0;
            }
            
            int      i    = 1;
            ListNode tail = head;
            while(tail.next != null){
                i++;
                tail = tail.next;
                if(i > k){
                    head = head.next;
                }
            }
            
            return head.val;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
