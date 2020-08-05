package com.zhusaidong.leetcode.editor.cn;

/**
 * //实现 strStr() 函数。
 * //
 * // 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
 * //果不存在，则返回 -1。
 * //
 * // 示例 1:
 * //
 * // 输入: haystack = "hello", needle = "ll"
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: haystack = "aaaaa", needle = "bba"
 * //输出: -1
 * //
 * //
 * // 说明:
 * //
 * // 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * //
 * // 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * // Related Topics 双指针 字符串
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/implement-strstr/">实现 strStr()</a>
 */
public class ImplementStrstr{
	public static void main(String[] args){
		Solution solution = new ImplementStrstr()
				.new Solution();
		/*
		System.out.println(solution.strStr("hello", "ll"));//2
		System.out.println(solution.strStr("hello", "h"));//0
		System.out.println(solution.strStr("hello", "o"));//4
		System.out.println(solution.strStr("aaaaa", "bba"));//-1
		System.out.println(solution.strStr("abcbcdefg", "bcd"));//3
		System.out.println(solution.strStr("a", ""));//0
		System.out.println(solution.strStr("a", "aa"));//-1
		*/
		System.out.println(solution.strStr("mississippi", "issipi"));//-1
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int strStr(String haystack, String needle){
			int needleLength = needle.length();
			if(needleLength == 0){
				return 0;
			}
			int haystackLength = haystack.length();
			if(haystackLength < needleLength){
				return -1;
			}
			int firstPointer  = 0;
			int secondPointer = 0;
			
			for(int i = 0; i < haystackLength - needleLength + 1; i++){
				while(firstPointer + i < haystackLength && secondPointer < needleLength && haystack.charAt(firstPointer + i) == needle
						.charAt(secondPointer)){
					firstPointer++;
					secondPointer++;
				}
				
				if(secondPointer == needleLength){
					return i;
				}else{
					firstPointer = 0;
					secondPointer = 0;
				}
			}
			
			return -1;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
