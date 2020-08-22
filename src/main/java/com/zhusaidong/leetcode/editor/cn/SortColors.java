package com.zhusaidong.leetcode.editor.cn;

/**
 * //给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * //
 * // 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * //
 * // 注意:
 * //不能使用代码库中的排序函数来解决这道题。
 * //
 * // 示例:
 * //
 * // 输入: [2,0,2,1,1,0]
 * //输出: [0,0,1,1,2,2]
 * //
 * // 进阶：
 * //
 * //
 * // 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * // 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * // 你能想出一个仅使用常数空间的一趟扫描算法吗？
 * //
 * // Related Topics 排序 数组 双指针
 * // 👍 549 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/sort-colors/">颜色分类</a>
 */
public class SortColors{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		private void swap(int[] nums, int i, int j){
			if(i == j){
				return;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		
		public void sortColors(int[] nums){
			if(nums.length == 1){
				return;
			}
			
			int start = 0;
			int last  = nums.length - 1;
			int i     = start;
			
			while(i <= last){
				if(nums[start] == 0){
					start++;
					i = start;
				}
				if(nums[last] == 2){
					last--;
				}
				if(i > last){
					break;
				}
				
				if(nums[i] == 0){
					swap(nums, i, start);
					start++;
					i = start;
				}else if(nums[i] == 2){
					swap(nums, i, last);
					last--;
				}else{
					i++;
				}
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
