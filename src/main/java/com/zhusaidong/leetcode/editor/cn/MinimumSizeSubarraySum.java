package com.zhusaidong.leetcode.editor.cn;

/**
 * //给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回
 * // 0。
 * //
 * //
 * //
 * // 示例：
 * //
 * // 输入：s = 7, nums = [2,3,1,2,4,3]
 * //输出：2
 * //解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * //
 * //
 * //
 * //
 * // 进阶：
 * //
 * //
 * // 如果你已经完成了 O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 * //
 * // Related Topics 数组 双指针 二分查找
 * // 👍 430 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/minimum-size-subarray-sum/">长度最小的子数组</a>
 */
public class MinimumSizeSubarraySum{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int minSubArrayLen(int s, int[] nums){
			int minLen      = 1;
			int baseLoopSum = 0;
			int i;
			int sum;
			while(minLen <= nums.length){
				System.out.println("====第" + minLen + "轮====");
				i = 0;
				baseLoopSum += nums[minLen - 1];
				sum = baseLoopSum;
				while(i < nums.length - minLen + 1){
					System.out.println("i=" + i);
					System.out.println("sum=" + sum);
					if(sum >= s){
						System.out.println("found=" + i);
						return minLen;
					}else{
						if(minLen + i >= nums.length){
							break;
						}
						//滑动窗口法(可以省略第2个数到第n-1个数之间的重复求和)
						sum += nums[minLen + i] - nums[i];
						i++;
					}
				}
				
				minLen++;
			}
			return 0;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
