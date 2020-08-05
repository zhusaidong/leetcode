package com.zhusaidong.leetcode.editor.cn;

/**
 * //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * //
 * // 说明：本题中，我们将空字符串定义为有效的回文串。
 * //
 * // 示例 1:
 * //
 * // 输入: "A man, a plan, a canal: Panama"
 * //输出: true
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: "race a car"
 * //输出: false
 * //
 * // Related Topics 双指针 字符串
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/valid-palindrome/">验证回文串</a>
 */
public class ValidPalindrome{
	public static void main(String[] args){
		Solution solution = new ValidPalindrome()
				.new Solution();
		System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		private boolean notInArea(char c){
			return (c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c > 57);
		}
		
		public boolean isPalindrome(String s){
			int firstPointer = 0;
			int lastPointer  = s.length() - 1;
			while(firstPointer < lastPointer){
				while(firstPointer < lastPointer && this.notInArea(s.charAt(firstPointer))){
					firstPointer++;
				}
				while(firstPointer < lastPointer && this.notInArea(s.charAt(lastPointer))){
					lastPointer--;
				}
				
				//System.out.println(s.charAt(firstPointer));
				//System.out.println(s.charAt(lastPointer));
				//System.out.println("-----------------------------");
				if(String.valueOf(s.charAt(firstPointer)).equalsIgnoreCase(String.valueOf(s.charAt(lastPointer)))){
					firstPointer++;
					lastPointer--;
				}else{
					return false;
				}
			}
			return true;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
