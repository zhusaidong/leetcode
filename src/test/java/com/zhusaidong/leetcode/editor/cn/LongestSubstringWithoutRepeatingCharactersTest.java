package com.zhusaidong.leetcode.editor.cn;

import org.junit.*;

public class LongestSubstringWithoutRepeatingCharactersTest{
	@Test
	public void testSolution(){
		LongestSubstringWithoutRepeatingCharacters.Solution solution = new LongestSubstringWithoutRepeatingCharacters.Solution();
		
		//Assert
		Assert.assertEquals("abcabcbb,不含有重复字符的 最长子串 的长度", 3, solution.lengthOfLongestSubstring("abcabcbb"));
		Assert.assertEquals("bbbbb,不含有重复字符的 最长子串 的长度", 1, solution.lengthOfLongestSubstring("bbbbb"));
		Assert.assertEquals("pwwkew,不含有重复字符的 最长子串 的长度", 3, solution.lengthOfLongestSubstring("pwwkew"));
	}
}
