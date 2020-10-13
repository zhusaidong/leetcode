package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * //
 * // 示例:
 * //
 * // 输入: [0,1,0,3,12]
 * //输出: [1,3,12,0,0]
 * //
 * // 说明:
 * //
 * //
 * // 必须在原数组上操作，不能拷贝额外的数组。
 * // 尽量减少操作次数。
 * //
 * // Related Topics 数组 双指针
 * // 👍 650 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 */
public class MoveZeroes{
	public static void main(String[] args){
		Solution solution = new MoveZeroes()
				.new Solution();
		
		//[1,3,12,0,0]
		int[] numbers = new int[] {1, 1, 0, 3, 12};
		solution.moveZeroes(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public void moveZeroes(int[] nums){
			//碰到0停下
			int zero = 0;
			//碰到非0停下
			int nonzero = 0;
			
			int length = nums.length;
			while(zero < length && nonzero < length){
				if(nums[zero] == 0 && nums[nonzero] != 0){
					//如果0在非0后面不交换
					if(zero > nonzero){
						nonzero++;
						continue;
					}
					nums[zero] = nums[nonzero];
					nums[nonzero] = 0;
				}
				
				if(nums[zero] != 0){
					zero++;
				}
				if(nums[nonzero] == 0){
					nonzero++;
				}
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
