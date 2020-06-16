package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //给你两个二进制字符串，返回它们的和（用二进制表示）。
 * //
 * // 输入为 非空 字符串且只包含数字 1 和 0。
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // 输入: a = "11", b = "1"
 * //输出: "100"
 * //
 * // 示例 2:
 * //
 * // 输入: a = "1010", b = "1011"
 * //输出: "10101"
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 每个字符串仅由字符 '0' 或 '1' 组成。
 * // 1 <= a.length, b.length <= 10^4
 * // 字符串如果不是 "0" ，就都不含前导零。
 * //
 * // Related Topics 数学 字符串
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/add-binary/">二进制求和</a>
 */
public class AddBinary{
	public static void main(String[] args){
		Solution solution = new AddBinary()
				.new Solution();
		System.out.println(solution.addBinary("1010", "1011"));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public String addBinary(String a, String b){
			StringBuilder stringBuilder = new StringBuilder();
			
			int aLen  = a.length();
			int bLen  = b.length();
			int index = 0, before = 0, num1, num2, sum, lastNum;
			while(true){
				num1 = (index < aLen && a.charAt(aLen - 1 - index) == '1') ? 1 : 0;
				num2 = (index < bLen && b.charAt(bLen - 1 - index) == '1') ? 1 : 0;
				
				if(index >= aLen && index >= bLen){
					break;
				}
				
				//和的余数
				lastNum = (num1 + num2) % 2;
				sum = (before != lastNum) ? 1 : 0;
				before = (lastNum == 0) ? ((num1 + num2) >> 1) : before;
				
				stringBuilder.append(sum);
				index++;
			}
			
			if(before != 0){
				stringBuilder.append(before);
			}
			String binStr = stringBuilder.toString();
			
			StringBuilder newStringBuilder = new StringBuilder();
			for(int j = binStr.length() - 1; j >= 0; j--){
				newStringBuilder.append(binStr.charAt(j));
			}
			
			return newStringBuilder.toString();
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
