package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * //
 * // 示例:
 * //
 * // 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * //输出: 6
 * //解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * //
 * //
 * // 进阶:
 * //
 * // 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * // Related Topics 数组 分治算法 动态规划
 * // 👍 2118 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/maximum-subarray/">最大子序和</a>
 */
public class MaximumSubarray{
	public static void main(String[] args){
		Solution solution = new MaximumSubarray()
				.new Solution();
		
		//6
		System.out.println(solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		//1
		System.out.println(solution.maxSubArray(new int[] {1}));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int maxSubArray(int[] nums){
			int   length = nums.length;
			int[] dp     = new int[length];
			int   max    = dp[0] = nums[0];
			for(int i = 1; i < length; i++){
				dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
				max = Math.max(max, dp[i]);
			}
			
			return max;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
