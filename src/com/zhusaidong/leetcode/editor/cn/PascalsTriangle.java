package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * //
 * //
 * //
 * // 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * //
 * // 示例:
 * //
 * // 输入: 5
 * //输出:
 * //[
 * //     [1],
 * //    [1,1],
 * //   [1,2,1],
 * //  [1,3,3,1],
 * // [1,4,6,4,1]
 * //]
 * // Related Topics 数组
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/pascals-triangle/">杨辉三角</a>
 */
public class PascalsTriangle{
	public static void main(String[] args){
		Solution solution = new PascalsTriangle()
				.new Solution();
		System.out.println(solution.generate(10));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public List<List<Integer>> generate(int numRows){
			List<List<Integer>> lists    = new ArrayList<>();
			List<Integer>       lastList = null;
			for(int i = 0; i < numRows; i++){
				List<Integer> list = new ArrayList<>();
				list.add(1);
				if(lastList != null){
					for(int j = 0; j < lastList.size() - 1; j++){
						list.add(lastList.get(j) + lastList.get(j + 1));
					}
					list.add(1);
				}
				lastList = list;
				
				//System.out.println(list);
				lists.add(list);
			}
			
			return lists;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
