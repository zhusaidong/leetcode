package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
 * //
 * // 每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
 * //
 * // 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：people = [1,2], limit = 3
 * //输出：1
 * //解释：1 艘船载 (1, 2)
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：people = [3,2,2,1], limit = 3
 * //输出：3
 * //解释：3 艘船分别载 (1, 2), (2) 和 (3)
 * //
 * //
 * // 示例 3：
 * //
 * // 输入：people = [3,5,3,4], limit = 5
 * //输出：4
 * //解释：4 艘船分别载 (3), (3), (4), (5)
 * //
 * // 提示：
 * //
 * //
 * // 1 <= people.length <= 50000
 * // 1 <= people[i] <= limit <= 30000
 * //
 * // Related Topics 贪心算法 双指针
 * // 👍 64 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/boats-to-save-people/">救生艇</a>
 */
public class BoatsToSavePeople{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int numRescueBoats(int[] people, int limit){
			Arrays.sort(people);
			
			int min = 0;
			int max = people.length - 1;
			
			int count = 0;
			
			//调试用
			//List<List<Integer>> group = new ArrayList<>();
			//每艘船最多可同时载两人
			while(min <= max){
				int sum = people[max];
				count++;
				max--;
				
				//ArrayList<Integer> e = new ArrayList<>();
				//e.add(sum);
				if(sum + people[min] <= limit){
					//2个人
					/*
					if(min != max){
						e.add(people[min]);
					}
					*/
					min++;
				}
				//group.add(e);
			}
			
			//System.out.println(group);
			return count;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
