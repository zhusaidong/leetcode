package com.zhusaidong.leetcode.editor.cn;

import java.util.List;

/**
 * //给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * //
 * // 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * //
 * //
 * //
 * // 例如，给定三角形：
 * //
 * // [
 * //     [2],
 * //    [3,4],
 * //   [6,5,7],
 * //  [4,1,8,3]
 * //]
 * //
 * //
 * // 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * //
 * //
 * //
 * // 说明：
 * //
 * // 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * // Related Topics 数组 动态规划
 * // 👍 645 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/triangle/">三角形最小路径和</a>
 */
public class Triangle{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		//todo 从低向上倒着算
		public int minimumTotal(List<List<Integer>> triangle){
			if(triangle.size() == 0){
				return 0;
			}
			/*
			 *      [2],
			 *     [3,4],
			 *    [6,5,7],
			 *   [4,1,8,3]
			 */
			for(int i = 1; i < triangle.size(); i++){
				List<Integer> before   = triangle.get(i - 1);
				List<Integer> integers = triangle.get(i);
				for(int j = 0; j < integers.size(); j++){
					Integer upLeft  = j - 1 < 0 ? Integer.MAX_VALUE : before.get(j - 1);
					Integer upRight = j > before.size() - 1 ? Integer.MAX_VALUE : before.get(j);
					
					integers.set(j, Math.min(upLeft, upRight) + integers.get(j));
				}
			}
			System.out.println(triangle);
			
			return triangle.get(triangle.size() - 1).stream().min(Integer::compareTo).orElse(0);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
