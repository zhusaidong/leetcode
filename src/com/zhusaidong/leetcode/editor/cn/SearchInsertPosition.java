package com.zhusaidong.leetcode.editor.cn;

/**
 * //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * //
 * // 你可以假设数组中无重复元素。
 * //
 * // 示例 1:
 * //
 * // 输入: [1,3,5,6], 5
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: [1,3,5,6], 2
 * //输出: 1
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: [1,3,5,6], 7
 * //输出: 4
 * //
 * //
 * // 示例 4:
 * //
 * // 输入: [1,3,5,6], 0
 * //输出: 0
 * //
 * // Related Topics 数组 二分查找
 * // 👍 544 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/search-insert-position/">搜索插入位置</a>
 */
public class SearchInsertPosition{
	public static void main(String[] args){
		Solution solution = new SearchInsertPosition()
				.new Solution();
		System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 5));//2
		System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 2));//1
		System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 7));//4
		System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 0));//0
		System.out.println(solution.searchInsert(new int[] {1}, 1));//0
		System.out.println(solution.searchInsert(new int[] {1, 2, 4, 6, 8, 9, 10}, 10));//6
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int searchInsert(int[] nums, int target){
			if(target <= nums[0]){
				return 0;
			}
			
			int startPointer = 0;
			int endPointer   = nums.length - 1;
			
			if(target > nums[endPointer]){
				return endPointer + 1;
			}
			
			int middle;
			while(endPointer - startPointer > 1){
				middle = (endPointer + startPointer + 1) / 2;
				if(nums[middle] < target){
					startPointer = middle;
				}else{
					endPointer = middle;
				}
			}
			
			return startPointer + 1;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
