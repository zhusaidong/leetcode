package com.zhusaidong.leetcode.editor.cn;

/**
 * //数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 * // 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 * // 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 * //
 * // 示例 1:
 * // 输入: cost = [10, 15, 20]
 * //输出: 15
 * //解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 * //
 * //
 * // 示例 2:
 * // 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * //输出: 6
 * //解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 * //
 * // 注意：
 * // cost 的长度将会在 [2, 1000]。
 * // 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
 * //
 * // Related Topics 数组 动态规划
 * // 👍 402 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/min-cost-climbing-stairs/">使用最小花费爬楼梯</a>
 */
public class MinCostClimbingStairs{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int minCostClimbingStairs(int[] cost){
			if(cost.length == 0){
				return 0;
			}
			if(cost.length == 1){
				return cost[0];
			}
			if(cost.length == 2){
				return Math.min(cost[0], cost[1]);
			}
			if(cost.length == 3){
				return Math.min(cost[0] + cost[2], cost[1]);
			}
			
			//System.out.println(Arrays.toString(cost));
			
			int[] mines = new int[cost.length];
			mines[0] = cost[0];
			mines[1] = cost[1];
			for(int i = 2; i < cost.length; i++){
				mines[i] = Math.min(mines[i - 1], mines[i - 2]) + cost[i];
			}
			//System.out.println(Arrays.toString(mines));
			
			return Math.min(mines[mines.length - 1], mines[mines.length - 2]);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
