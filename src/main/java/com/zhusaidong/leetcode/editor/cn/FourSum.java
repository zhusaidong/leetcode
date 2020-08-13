package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * <p>
 * <p>
 * Related Topics 数组 哈希表 双指针
 * <p>
 * 👍 538 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/4sum/">四数之和</a>
 */
public class FourSum{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public List<List<Integer>> fourSum(int[] nums, int target){
			Set<List<Integer>> lists = new HashSet<>();
			
			int length = nums.length;
			if(length < 4){
				return new ArrayList<>(lists);
			}
			
			Arrays.sort(nums);
			for(int i = 0; i < length; i++){
				for(int j = 0; j < length; j++){
					if(i == j){
						continue;
					}
					int k = 0;
					int l = length - 1;
					while(k < l){
						if(k == j || k == i){
							k++;
							continue;
						}
						if(l == j || l == i){
							l--;
							continue;
						}
						
						//System.out.println("{i=" + nums[i] + ",j=" + nums[j] + ",k=" + nums[k] + ",l=" + nums[l] + "}");
						int sum = nums[i] + nums[j] + nums[k] + nums[l];
						if(sum == target){
							List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
							list.sort((listI, listJ) -> listI.equals(listJ) ? 0 : (listI > listJ ? 1 : -1));
							lists.add(list);
						}
						if(sum < target){
							k++;
						}else{
							l--;
						}
					}
				}
			}
			
			return new ArrayList<>(lists);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
