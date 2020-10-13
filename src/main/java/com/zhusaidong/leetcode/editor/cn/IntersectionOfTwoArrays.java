package com.zhusaidong.leetcode.editor.cn;

import java.util.*;
import java.util.stream.*;

/**
 * //给定两个数组，编写一个函数来计算它们的交集。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * //输出：[2]
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * //输出：[9,4]
 * //
 * //
 * //
 * // 说明：
 * //
 * //
 * // 输出结果中的每个元素一定是唯一的。
 * // 我们可以不考虑输出结果的顺序。
 * //
 * // Related Topics 排序 哈希表 双指针 二分查找
 * // 👍 206 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">两个数组的交集</a>
 */
public class IntersectionOfTwoArrays{
	public static void main(String[] args){
		Solution solution = new IntersectionOfTwoArrays()
				.new Solution();
		
		int[] nums1 = new int[] {1, 2, 2, 1};
		int[] nums2 = new int[] {2, 2};
		System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
		
		int[] nums3 = new int[] {4, 9, 5};
		int[] nums4 = new int[] {9, 4, 9, 8, 4};
		System.out.println(Arrays.toString(solution.intersection(nums3, nums4)));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		private int[] inter(int[] nums1, int[] nums2){
			List<Integer> numbers = new ArrayList<>();
			for(int item : nums1){
				for(int value : nums2){
					if(item == value){
						if(!numbers.contains(item)){
							numbers.add(item);
						}
						break;
					}
				}
			}
			int[] n = new int[numbers.size()];
			for(int i = 0; i < n.length; i++){
				n[i] = numbers.get(i);
			}
			
			return n;
		}
		
		public int[] intersection(int[] nums1, int[] nums2){
			if(nums1.length > nums2.length){
				return this.inter(nums2, nums1);
			}
			return this.inter(nums1, nums2);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
