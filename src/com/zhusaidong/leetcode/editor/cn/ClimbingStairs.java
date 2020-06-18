package com.zhusaidong.leetcode.editor.cn;

/**
 * //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * //
 * // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * //
 * // 注意：给定 n 是一个正整数。
 * //
 * // 示例 1：
 * //
 * // 输入： 2
 * //输出： 2
 * //解释： 有两种方法可以爬到楼顶。
 * //1.  1 阶 + 1 阶
 * //2.  2 阶
 * //
 * // 示例 2：
 * //
 * // 输入： 3
 * //输出： 3
 * //解释： 有三种方法可以爬到楼顶。
 * //1.  1 阶 + 1 阶 + 1 阶
 * //2.  1 阶 + 2 阶
 * //3.  2 阶 + 1 阶
 * //
 * // Related Topics 动态规划
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/climbing-stairs/">爬楼梯</a>
 */
public class ClimbingStairs{
	public static void main(String[] args){
		Solution solution = new ClimbingStairs()
				.new Solution();
		System.out.println(solution.climbStairs(10));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int climbStairs(int n){
			/*
			倒推法
				假设n=10
				1.从第9步到第10步只有1种方法：9-10
				2.从第8步往下走有2种方法：8-9,8-10
					8-9之后会经历步骤1（包含1种方法） + 8-10(包含1种方法) = 2种方法
				3.从第7步往下走有2种方法：7-8，7-9
					7-8之后会经历步骤2（包含2种方法） + 7-9之后会经历步骤1（包含1种方法） = 3种方法
				4.从第6步往下走有2种方法：6-7，6-8
					6-7之后会经历步骤3（包含3种方法） + 6-8之后会经历步骤2（包含2种方法） = 5种方法
				5.从第5步往下走有2种方法：5-6，5-7
					5-6之后会经历步骤4（包含5种方法） + 5-7之后会经历步骤3（包含3种方法） = 8种方法
					.
					.
					.
				 以此类推
					.
					.
					.
			
			本质上是倒着的斐波那契数列
			 */
			if(n == 1)
			{
				return 1;
			}
			
			int[] step = new int[n];
			step[n - 1] = 1;
			step[n - 2] = 2;
			
			for(int i = n - 3; i >= 0; i--){
				step[i] = step[i + 1] + step[i + 2];
			}
			
			return step[0];
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
