package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：[-4,-1,0,3,10]
 * //输出：[0,1,9,16,100]
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：[-7,-3,2,3,11]
 * //输出：[4,9,9,49,121]
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 1 <= A.length <= 10000
 * // -10000 <= A[i] <= 10000
 * // A 已按非递减顺序排序。
 * //
 * // Related Topics 数组 双指针
 * // 👍 105 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">有序数组的平方</a>
 */
public class SquaresOfASortedArray{
	public static void main(String[] args){
		Solution solution = new SquaresOfASortedArray()
				.new Solution();
		
		//[0,1,9,16,100]
		System.out.println(Arrays.toString(solution.sortedSquares(new int[] {-4, -1, 0, 3, 10})));
		//[4,9,9,49,121]
		System.out.println(Arrays.toString(solution.sortedSquares(new int[] {-7, -3, 2, 3, 11})));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int[] sortedSquares(int[] A){
			int first = 0;
			int last  = A.length - 1;
			
			int   newArrLen = last;
			int[] newA      = new int[newArrLen + 1];
			
			//平方后，头尾大，中间小。使用头尾双指针。大的放新数组尾部。
			while(first <= last){
				double powF = Math.pow(A[first], 2);
				double powL = Math.pow(A[last], 2);
				
				if(powF > powL){
					newA[newArrLen] = (int)powF;
					first++;
				}else{
					newA[newArrLen] = (int)powL;
					last--;
				}
				newArrLen--;
			}
			
			return newA;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
