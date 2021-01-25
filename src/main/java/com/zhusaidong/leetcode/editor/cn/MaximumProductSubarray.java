package com.zhusaidong.leetcode.editor.cn;

import java.util.Arrays;

/**
 * //给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // 输入: [2,3,-2,4]
 * //输出: 6
 * //解释: 子数组 [2,3] 有最大乘积 6。
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: [-2,0,-1]
 * //输出: 0
 * //解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * // Related Topics 数组 动态规划
 * // 👍 917 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/maximum-product-subarray/">乘积最大子数组</a>
 */
public class MaximumProductSubarray{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int maxProduct(int[] nums){
			if(nums.length == 1){
				return nums[0];
			}
			
			//System.out.println("========================");
			//System.out.println(Arrays.toString(nums));
			int[] maxMulti = new int[nums.length];
			int[] minMulti = new int[nums.length];
			maxMulti[0] = nums[0];
			minMulti[0] = nums[0];
			for(int i = 1; i < nums.length; i++){
				if(nums[i] < 0){
					maxMulti[i] = Math.max(minMulti[i - 1] * nums[i], nums[i]);
					minMulti[i] = Math.min(maxMulti[i - 1] * nums[i], nums[i]);
				}else{
					maxMulti[i] = Math.max(maxMulti[i - 1] * nums[i], nums[i]);
					minMulti[i] = Math.min(minMulti[i - 1] * nums[i], nums[i]);
				}
			}
			//System.out.println(Arrays.toString(maxMulti));
			//System.out.println(Arrays.toString(minMulti));
			
			return Arrays.stream(maxMulti).max().getAsInt();
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
