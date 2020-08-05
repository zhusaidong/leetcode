package com.zhusaidong.leetcode.editor.cn;

/**
 * //编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * //
 * // 示例 1:
 * //
 * // 输入: "hello"
 * //输出: "holle"
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: "leetcode"
 * //输出: "leotcede"
 * //
 * // 说明:
 * //元音字母不包含字母"y"。
 * // Related Topics 双指针 字符串
 * // 👍 101 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/reverse-vowels-of-a-string/">反转字符串中的元音字母</a>
 */
public class ReverseVowelsOfAString{
	public static void main(String[] args){
		Solution solution = new ReverseVowelsOfAString()
				.new Solution();
		System.out.println(solution.reverseVowels("hello"));//holle
		System.out.println(solution.reverseVowels("leetcode"));//leotcede
		System.out.println(solution.reverseVowels("ai"));//ia
		System.out.println(solution.reverseVowels("aq"));//aq
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		private final char[] yuanYin = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		private boolean isYuanYin(char c){
			for(char value : this.yuanYin){
				if(value == c){
					return true;
				}
			}
			return false;
		}
		
		public String reverseVowels(String s){
			if(s == null){
				return null;
			}
			if(s.length() == 1){
				return s;
			}
			
			int first = 0;
			int last  = s.length() - 1;
			while(last - first > 0){
				if(this.isYuanYin(s.charAt(first)) && this.isYuanYin(s.charAt(last))){
					s = s.substring(0, first) + s.charAt(last) + s.substring(first + 1,
							last) + s.charAt(first) + s.substring(last + 1);
					first++;
					last--;
				}
				if(!this.isYuanYin(s.charAt(first))){
					first++;
				}
				if(!this.isYuanYin(s.charAt(last))){
					last--;
				}
			}
			
			return s;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
