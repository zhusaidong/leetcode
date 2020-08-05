package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * //
 * // 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * //
 * // 说明:
 * //
 * //
 * // 返回的下标值（index1 和 index2）不是从零开始的。
 * // 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * //
 * //
 * // 示例:
 * //
 * // 输入: numbers = [2, 7, 11, 15], target = 9
 * //输出: [1,2]
 * //解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * // Related Topics 数组 双指针 二分查找
 * // 👍 329 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/">两数之和 II - 输入有序数组</a>
 */
public class TwoSumIiInputArrayIsSorted{
	public static void main(String[] args){
		Solution solution = new TwoSumIiInputArrayIsSorted()
				.new Solution();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {2, 7, 11, 15}, 9)));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int[] twoSum(int[] numbers, int target){
			int firstPointer = 0;
			int lastPointer  = numbers.length - 1;
			
			while(firstPointer < lastPointer){
				int sum = numbers[firstPointer] + numbers[lastPointer];
				if(sum > target){
					lastPointer--;
				}else if(sum < target){
					firstPointer++;
				}else{
					return new int[] {firstPointer + 1, lastPointer + 1};
				}
			}
			
			return null;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
