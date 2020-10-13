package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j
 * // 都是数组中的数字，且两数之差的绝对值是 k.
 * //
 * // 示例 1:
 * //
 * //
 * //输入: [3, 1, 4, 1, 5], k = 2
 * //输出: 2
 * //解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 * //尽管数组中有两个1，但我们只应返回不同的数对的数量。
 * //
 * //
 * // 示例 2:
 * //
 * //
 * //输入:[1, 2, 3, 4, 5], k = 1
 * //输出: 4
 * //解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。
 * //
 * //
 * // 示例 3:
 * //
 * //
 * //输入: [1, 3, 1, 5, 4], k = 0
 * //输出: 1
 * //解释: 数组中只有一个 0-diff 数对，(1, 1)。
 * //
 * //
 * // 注意:
 * //
 * //
 * // 数对 (i, j) 和数对 (j, i) 被算作同一数对。
 * // 数组的长度不超过10,000。
 * // 所有输入的整数的范围在 [-1e7, 1e7]。
 * //
 * // Related Topics 数组 双指针
 * // 👍 88 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/">数组中的K-diff数对</a>
 */
public class KDiffPairsInAnArray{
	public static void main(String[] args){
		Solution solution = new KDiffPairsInAnArray()
				.new Solution();
		
		/*
		 * //输出: 2
		 * //解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
		 * //尽管数组中有两个1，但我们只应返回不同的数对的数量。
		 */
		System.out.println(solution.findPairs(new int[] {3, 1, 4, 1, 5}, 2));
		/*
		 * //输出: 4
		 * //解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。
		 */
		System.out.println(solution.findPairs(new int[] {1, 2, 3, 4, 5}, 1));
		/*
		 * //输出: 1
		 * //解释: 数组中只有一个 0-diff 数对，(1, 1)。
		 */
		System.out.println(solution.findPairs(new int[] {1, 3, 1, 5, 4}, 0));
		System.out.println(solution.findPairs(new int[] {1, 1, 1, 2, 2}, 0));
		System.out.println(solution.findPairs(new int[] {6, 2, 9, 3, 9, 6, 7, 7, 6, 4}, 3));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int findPairs(int[] nums, int k){
			if(nums.length < 2){
				return 0;
			}
			
			Arrays.sort(nums);
			
			Set<List<Integer>> pair  = new HashSet<>();
			int                len   = nums.length - 1;
			int                first = 0;
			int                last  = len;
			while(first < len){
				if(first >= last){
					first++;
					last = len;
					continue;
				}
				int abs = Math.abs(nums[first] - nums[last]);
				if(abs > k){
					last--;
				}else{
					if(abs == k){
						pair.add(Arrays.asList(nums[first], nums[last]));
					}
					first++;
					last = len;
				}
			}
			
			System.out.println(Arrays.toString(nums));
			System.out.println(pair);
			
			return pair.size();
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
