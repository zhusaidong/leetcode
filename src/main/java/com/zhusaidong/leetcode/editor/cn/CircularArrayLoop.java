package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个含有正整数和负整数的环形数组 nums。 如果某个索引中的数 k 为正数，则向前移动 k 个索引。相反，如果是负数 (-k)，则向后移动 k 个索引
 * //。因为数组是环形的，所以可以假设最后一个元素的下一个元素是第一个元素，而第一个元素的前一个元素是最后一个元素。
 * //
 * // 确定 nums 中是否存在循环（或周期）。循环必须在相同的索引处开始和结束并且循环长度 > 1。此外，一个循环中的所有运动都必须沿着同一方向进行。换句话说
 * //，一个循环中不能同时包括向前的运动和向后的运动。
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：[2,-1,1,2,2]
 * //输出：true
 * //解释：存在循环，按索引 0 -> 2 -> 3 -> 0 。循环长度为 3 。
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：[-1,2]
 * //输出：false
 * //解释：按索引 1 -> 1 -> 1 ... 的运动无法构成循环，因为循环的长度为 1 。根据定义，循环的长度必须大于 1 。
 * //
 * //
 * // 示例 3:
 * //
 * // 输入：[-2,1,-1,-2,-2]
 * //输出：false
 * //解释：按索引 1 -> 2 -> 1 -> ... 的运动无法构成循环，因为按索引 1 -> 2 的运动是向前的运动，而按索引 2 -> 1 的运动是向后的
 * //运动。一个循环中的所有运动都必须沿着同一方向进行。
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // -1000 ≤ nums[i] ≤ 1000
 * // nums[i] ≠ 0
 * // 0 ≤ nums.length ≤ 5000
 * //
 * //
 * //
 * //
 * // 进阶：
 * //
 * // 你能写出时间时间复杂度为 O(n) 和额外空间复杂度为 O(1) 的算法吗？
 * // Related Topics 数组 双指针
 * // 👍 51 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/circular-array-loop/">环形数组循环</a>
 */
public class CircularArrayLoop{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public boolean circularArrayLoop(int[] nums){
			int length = nums.length;
			if(length < 2){
				return false;
			}
			
			//每个下标的移动位置
			int[] movedIndexes = new int[length];
			for(int i = 0; i < length; i++){
				int index = i + nums[i];
				while(index >= length){
					index -= length;
				}
				while(index < 0){
					index += length;
				}
				
				movedIndexes[i] = index;
			}
			System.out.println(Arrays.toString(nums));
			System.out.println(Arrays.toString(movedIndexes));
			
			for(int i = 0; i < movedIndexes.length; i++){
				
				System.out.println("===========================");
				System.out.println("i=" + i);
				boolean moveRight = nums[i] > 0;
				System.out.println("moveRight=" + moveRight);
				
				//快慢指针来判断是不是环形
				int fast = i;
				int slow = i;
				
				boolean slowMove = false;
				int     moveNum  = 0;
				while(true){
					//同向
					if((nums[fast] > 0) != moveRight){
						break;
					}
					fast = movedIndexes[fast];
					moveNum++;
					
					if(slowMove){
						//同向
						if((nums[slow] > 0) != moveRight){
							break;
						}
						slow = movedIndexes[slow];
					}
					
					System.out.println("moveNum=" + moveNum);
					System.out.println("fast=" + fast);
					System.out.println("slow=" + slow);
					
					if(moveNum % 2 == 0 && fast == slow){
						if(fast == i && moveNum / 2 > 1){
							return true;
						}else{
							break;
						}
					}
					
					slowMove = !slowMove;
				}
			}
			
			return false;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
