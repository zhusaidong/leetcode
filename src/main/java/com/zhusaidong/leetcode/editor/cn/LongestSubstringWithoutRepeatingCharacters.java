package com.zhusaidong.leetcode.editor.cn;

import java.util.*;

/**
 * //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * //
 * // 示例 1:
 * //
 * // 输入: "abcabcbb"
 * //输出: 3
 * //解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: "bbbbb"
 * //输出: 1
 * //解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: "pwwkew"
 * //输出: 3
 * //解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * //     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * //
 * // Related Topics 哈希表 双指针 字符串 Sliding Window
 * // 👍 4098 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">无重复字符的最长子串</a>
 */
public class LongestSubstringWithoutRepeatingCharacters{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int lengthOfLongestSubstring(String s){
			if(s.length() < 2){
				return s.length();
			}
			
			/*
			 * 用双指针实现移动窗口法。
			 *      字符串S(i,j)表示当前子串，如果j+1重复了，则当前长度为j-i+1。
			 *      j+1必定与i到j中的某个字符重复了，只需要移动i，使得j+1不重复，就得到了新的一个子串，
			 *    重复上面的步骤直到j到达字符串的尾部，得到一系列不重复子串的长度，取最大长度
			 */
			int             maxLen = 0;
			int             i      = 0;
			int             j      = 0;
			List<Character> bucket = new ArrayList<>(26);
			while(j < s.length()){
				char jStr = s.charAt(j);
				if(!bucket.contains(jStr)){
					maxLen = Math.max(maxLen, j - i + 1);
					
					bucket.add(s.charAt(j));
					j++;
				}else{
					bucket.remove((Object)s.charAt(i));
					i++;
				}
			}
			
			return maxLen;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
