package com.zhusaidong.leetcode.editor.cn;

/**
 * //给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
 * //ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * //
 * // 说明：你不能倾斜容器，且 n 的值至少为 2。
 * //
 * // https://aliyun-lc-upload.oss-cn-hangzhou.aliyuncs.com/aliyun-lc-upload/uploads/2018/07/25/question_11.jpg
 * //
 * // 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * //
 * // 示例：
 * //
 * // 输入：[1,8,6,2,5,4,8,3,7]
 * //输出：49
 * // Related Topics 数组 双指针
 * // 👍 1698 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/container-with-most-water/">盛最多水的容器</a>
 */
public class ContainerWithMostWater{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int maxArea(int[] height){
			int i       = 0;
			int j       = height.length - 1;
			int maxArea = 0;
			/*
			 * 先指向2边，短的一边往中间靠，试图寻找面积比之前大的
			 *      虽然往中间靠使得宽变小了，但是如果两侧短板的高度比之前的高，面积有可能反而比之前大。
			 */
			while(i < j){
				int area = (j - i) * Math.min(height[i], height[j]);
				//System.out.println("i=" + i + ",j=" + j + ",area=" + area);
				maxArea = Math.max(maxArea, area);
				if(height[i] < height[j]){
					i++;
					//如果移动后的高度比之前的小，面积必定比之前小，无需比较，继续移动
					while(i < height.length - 1 && height[i] <= height[i - 1]){
						i++;
					}
				}else{
					j--;
					while(j > 0 && height[j] <= height[j + 1]){
						j--;
					}
				}
			}
			return maxArea;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
