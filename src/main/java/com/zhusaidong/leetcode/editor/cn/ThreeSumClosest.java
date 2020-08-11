package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
 * //。假定每组输入只存在唯一答案。
 * //
 * //
 * //
 * // 示例：
 * //
 * // 输入：nums = [-1,2,1,-4], target = 1
 * //输出：2
 * //解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 3 <= nums.length <= 10^3
 * // -10^3 <= nums[i] <= 10^3
 * // -10^4 <= target <= 10^4
 * //
 * // Related Topics 数组 双指针
 * // 👍 530 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/3sum-closest/">最接近的三数之和</a>
 */
public class ThreeSumClosest{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int threeSumClosest(int[] nums, int target){
			Arrays.sort(nums);
			//System.out.println(Arrays.toString(nums));
			
			int nearSum = Integer.MAX_VALUE - Math.abs(target);
			for(int i = 0; i < nums.length; i++){
				int j = 0;
				int k = nums.length - 1;
				while(j < k){
					//System.out.println("{" + "i=" + nums[i] + ",j=" + nums[j] + ",k=" + nums[k] + "}");
					if(i == j){
						j++;
						continue;
					}
					if(i == k){
						k--;
						continue;
					}
					int sum = nums[i] + nums[j] + nums[k];
					//System.out.println("{sum=" + sum + "}");
					//System.out.println("{sum-target=" + Math.abs(sum - target) + "}");
					//System.out.println("{nearSum-target=" + Math.abs(nearSum - target) + "}");
					if(Math.abs(sum - target) < Math.abs(nearSum - target)){
						nearSum = sum;
						//System.out.println("{nearSum=" + nearSum + "}");
					}
					if(sum < target){
						j++;
						while(j <= nums.length - 1 && nums[j] == nums[j - 1]){
							j++;
						}
					}else if(sum > target){
						k--;
						while(k >= 0 && nums[k] == nums[k + 1]){
							k--;
						}
					}else{
						return sum;
					}
				}
			}
			
			return nearSum;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
