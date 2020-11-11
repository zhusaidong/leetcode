package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * //
 * // 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //输入：nums = [2,3,2]
 * //输出：3
 * //解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * //
 * //
 * // 示例 2：
 * //
 * //
 * //输入：nums = [1,2,3,1]
 * //输出：4
 * //解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 * //     偷窃到的最高金额 = 1 + 3 = 4 。
 * //
 * // 示例 3：
 * //
 * //
 * //输入：nums = [0]
 * //输出：0
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 1 <= nums.length <= 100
 * // 0 <= nums[i] <= 1000
 * //
 * // Related Topics 动态规划
 * // 👍 408 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/house-robber-ii/">打家劫舍 II</a>
 */
public class HouseRobberIi{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int rob(int[] nums){
			if(nums.length == 0){
				return 0;
			}
			if(nums.length == 1){
				return nums[0];
			}
			
			//System.out.println("nums=" + Arrays.toString(nums));
			int[]     maxes  = new int[nums.length];
			boolean[] firsts = new boolean[nums.length];
			
			maxes[0] = nums[0];
			firsts[0] = true;
			
			maxes[1] = Math.max(maxes[0], nums[1]);
			firsts[1] = nums[0] > nums[1];
			
			for(int i = 2; i < nums.length; i++){
				maxes[i] = Math.max(maxes[i - 1], maxes[i - 2] + nums[i]);
				firsts[i] = maxes[i - 1] > maxes[i - 2] + nums[i] ? firsts[i - 1] : firsts[i - 2];
			}
			int max1 = !firsts[firsts.length - 1] ? maxes[maxes.length - 1] : maxes[maxes.length - 2];
			//System.out.println("maxes=" + Arrays.toString(maxes));
			//System.out.println("firsts=" + Arrays.toString(firsts));
			//System.out.println("max1=" + max1);
			
			maxes[0] = 0;
			maxes[1] = Math.max(maxes[0], nums[1]);
			
			for(int i = 2; i < nums.length; i++){
				maxes[i] = Math.max(maxes[i - 1], maxes[i - 2] + nums[i]);
			}
			int max2 = maxes[maxes.length - 1];
			//System.out.println("maxes=" + Arrays.toString(maxes));
			//System.out.println("firsts=" + Arrays.toString(firsts));
			//System.out.println("max2=" + max2);
			
			return Math.max(max1, max2);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}