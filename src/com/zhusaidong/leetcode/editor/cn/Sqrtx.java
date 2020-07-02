package com.zhusaidong.leetcode.editor.cn;

/**
 * //实现 int sqrt(int x) 函数。
 * //
 * // 计算并返回 x 的平方根，其中 x 是非负整数。
 * //
 * // 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * //
 * // 示例 1:
 * //
 * // 输入: 4
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: 8
 * //输出: 2
 * //说明: 8 的平方根是 2.82842...,
 * //     由于返回类型是整数，小数部分将被舍去。
 * //
 * // Related Topics 数学 二分查找
 * // 👍 434 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/sqrtx/">x 的平方根</a>
 */
public class Sqrtx{
	public static void main(String[] args){
		Solution solution = new Sqrtx()
				.new Solution();
		System.out.println(solution.mySqrt(4));//2
		System.out.println(solution.mySqrt(8));//2
		System.out.println(solution.mySqrt(1));//1
		System.out.println(solution.mySqrt(9));//3
		System.out.println(solution.mySqrt(25));//5
		System.out.println(solution.mySqrt(24));//4
		System.out.println(solution.mySqrt(2));//1
		System.out.println(solution.mySqrt(2147395599));//46339
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int mySqrt(int x){
			/*
			TODO 更牛逼的算法：
				牛顿迭代法快速寻找a的平方根:
					首先随便猜一个近似值x，然后不断令x等于x和a/x的平均数，迭代个六七次后x的值就已经相当精确了。
			*/
			if(x == 1){
				return 1;
			}
			long startPointer = 0;
			long endPointer   = x;
			while(endPointer - startPointer > 1){
				long middle = (endPointer + startPointer) / 2;
				//@Noble Monster:用x/m<m而不是m*m>x防止溢出
				if(middle > x / middle){
					endPointer = middle;
				}else{
					startPointer = middle;
				}
			}
			return (int)startPointer;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
