package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * //
 * //
 * //
 * // 说明:
 * //
 * //
 * // 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * // 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * //
 * //
 * //
 * //
 * // 示例:
 * //
 * // 输入:
 * //nums1 = [1,2,3,0,0,0], m = 3
 * //nums2 = [2,5,6],       n = 3
 * //
 * //输出: [1,2,2,3,5,6]
 * // Related Topics 数组 双指针
 * // 👍 550 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/merge-sorted-array/">合并两个有序数组</a>
 */
public class MergeSortedArray{
	public static void main(String[] args){
		Solution solution = new MergeSortedArray()
				.new Solution();
		
		int[] nums1 = new int[] {-1, 0, 0, 3, 3, 3, 0, 0, 0};
		int[] nums2 = new int[] {1, 2, 2};
		solution.merge(nums1, 6, nums2, 3);
		//[-1,0,0,1,2,2,3,3,3]
		System.out.println(Arrays.toString(nums1));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public void merge(int[] nums1, int m, int[] nums2, int n){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m + i + 1; j++){
					//交换：nums2<nums1或者nums1=0
					if(nums2[i] < nums1[j] || j == m + i){
						int tmp = nums2[i];
						nums2[i] = nums1[j];
						nums1[j] = tmp;
					}
				}
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
