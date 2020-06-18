package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

/**
 * //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * //
 * // 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * //
 * // 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：["h","e","l","l","o"]
 * //输出：["o","l","l","e","h"]
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：["H","a","n","n","a","h"]
 * //输出：["h","a","n","n","a","H"]
 * // Related Topics 双指针 字符串
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/reverse-string/">反转字符串</a>
 */
public class ReverseString{
	public static void main(String[] args){
		Solution solution = new ReverseString()
				.new Solution();
		char[] chars = "hello".toCharArray();
		solution.reverseString(chars);
		System.out.println(chars);
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public void reverseString1(char[] s){
			int length = s.length;
			for(int i = 0; i < length / 2; i++){
				char temp = s[i];
				s[i] = s[length - 1 - i];
				s[length - 1 - i] = temp;
			}
		}
		
		public void reverseString(char[] s){
			int firstPointer = 0;
			int lastPointer  = s.length - 1;
			while(lastPointer - firstPointer >= 1){
				if(s[firstPointer] != s[lastPointer]){
					char temp = s[firstPointer];
					s[firstPointer] = s[lastPointer];
					s[lastPointer] = temp;
				}
				
				firstPointer++;
				lastPointer--;
			}
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
