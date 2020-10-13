package com.zhusaidong.leetcode.editor.cn;

/**
 * //我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
 * //
 * //
 * // B.length >= 3
 * // 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B
 * //[B.length - 1]
 * //
 * //
 * // （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
 * //
 * // 给出一个整数数组 A，返回最长 “山脉” 的长度。
 * //
 * // 如果不含有 “山脉” 则返回 0。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：[2,1,4,7,3,2,5]
 * //输出：5
 * //解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：[2,2,2]
 * //输出：0
 * //解释：不含 “山脉”。
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 0 <= A.length <= 10000
 * // 0 <= A[i] <= 10000
 * //
 * // Related Topics 双指针
 * // 👍 74 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/longest-mountain-in-array/">数组中的最长山脉</a>
 */
public class LongestMountainInArray{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int longestMountain(int[] a){
			if(a.length < 3){
				return 0;
			}
			
			int i   = 0;
			int j   = 0;
			int max = 0;
			while(j < a.length - 1){
				while(j < a.length - 1){
					//System.out.println("j=" + j);
					//System.out.println("j-1,j,j+1=" + (j > 0 ? a[j - 1] : "-") + "," + a[j] + "," + a[j + 1]);
					if(j > 0 && a[j] < a[j - 1] && a[j] < a[j + 1]){
						break;
					}
					if(j > 0 && (a[j] == a[j - 1] || a[j] == a[j + 1])){
						if(j - i > 1 && a[j] < a[j - 1] && a[i] < a[i + 1]){
							max = Math.max(max, j - i + 1);
						}
						i = j;
						break;
					}
					j++;
				}
				
				//System.out.println("currentMountain=" + i + "-" + j);
				if(j - i > 1 && a[j] < a[j - 1] && a[i] < a[i + 1]){
					max = Math.max(max, j - i + 1);
				}
				
				i = j;
				j++;
			}
			
			return max;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
