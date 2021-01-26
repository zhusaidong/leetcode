package com.zhusaidong.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 * <p>
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 * <p>
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 * <p>
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i,j) 的数量。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * <p>
 * 输出：1
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= dominoes.length <= 40000
 * <p>
 * 1 <= dominoes[i][j] <= 9
 * <p>
 * <p>
 * Related Topics 数组
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/">等价多米诺骨牌对的数量</a>
 */
public class NumberOfEquivalentDominoPairs{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int numEquivDominoPairs(int[][] dominoes){
			int number = 0;
			if(dominoes.length == 1){
				return number;
			}
			
			//把小的放前面，并组合成1维数组
			int[] plus = new int[dominoes.length];
			for(int i = 0; i < dominoes.length; i++){
				putLittleToBefore(dominoes, i);
				plus[i] = dominoes[i][0] * 10 + dominoes[i][1];
			}
			
			for(int i = 0; i < plus.length; i++){
				for(int j = i + 1; j < plus.length; j++){
					if(plus[i] == plus[j]){
						number++;
					}
				}
			}
			//96
			return number;
		}
		
		/**
		 * 小的放前面
		 */
		private void putLittleToBefore(int[][] dominoes, int i){
			if(dominoes[i][0] > dominoes[i][1]){
				int temp = dominoes[i][0];
				dominoes[i][0] = dominoes[i][1];
				dominoes[i][1] = temp;
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
