package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * <p>
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rainwatertrap.png"/>
 * <p>
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * <p>
 * 输出: 6
 * <p>
 * <p>
 * Related Topics 栈 数组 双指针
 * <p>
 * 👍 1544 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/trapping-rain-water/">接雨水</a>
 */
public class TrappingRainWater{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int trap(int[] height){
			int length = height.length;
			if(length < 3){
				return 0;
			}
			
			/*
			动态规划：
			一个柱子能放多少，取决于它左右两边最高的柱子中最低的柱子。分别找出每个柱子左边和右边最高高度。
			以左边为例，
				第1个柱子左边最高高度为0，因为它没有左边。
				第2个柱子左边最高高度为第1个柱子高度。
				第3个柱子左边最高高度为Math.max(第2个柱子左边最高高度,第2个柱子本身高度)
				第4个柱子左边最高高度为Math.max(第3个柱子左边最高高度,第3个柱子本身高度)
				...
				以此类推
			*/
			
			int[] leftHighest = new int[length];
			leftHighest[0] = 0;
			for(int i = 1; i < length; i++){
				leftHighest[i] = Math.max(height[i - 1], leftHighest[i - 1]);
			}
			//System.out.println(Arrays.toString(leftHighest));
			
			int[] rightHighest = new int[length];
			rightHighest[length - 1] = 0;
			for(int i = length - 2; i >= 0; i--){
				rightHighest[i] = Math.max(height[i + 1], rightHighest[i + 1]);
			}
			//System.out.println(Arrays.toString(rightHighest));
			
			int sum = 0;
			/*
			找出每个柱子左右两边最高柱子中的最低的那个减去这个柱子本身的高度，就是这个柱子的水量
			*/
			for(int i = 1; i < length - 1; i++){
				int canPut = Math.min(leftHighest[i], rightHighest[i]) - height[i];
				//System.out.println("{i=" + i + ",canPut=" + canPut + "}");
				if(canPut > 0){
					sum += canPut;
				}
			}
			
			return sum;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
