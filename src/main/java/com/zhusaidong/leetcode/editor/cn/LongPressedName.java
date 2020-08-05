package com.zhusaidong.leetcode.editor.cn;

/**
 * //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * //
 * // 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：name = "alex", typed = "aaleex"
 * //输出：true
 * //解释：'alex' 中的 'a' 和 'e' 被长按。
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：name = "saeed", typed = "ssaaedd"
 * //输出：false
 * //解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
 * //
 * //
 * // 示例 3：
 * //
 * // 输入：name = "leelee", typed = "lleeelee"
 * //输出：true
 * //
 * //
 * // 示例 4：
 * //
 * // 输入：name = "laiden", typed = "laiden"
 * //输出：true
 * //解释：长按名字中的字符并不是必要的。
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // name.length <= 1000
 * // typed.length <= 1000
 * // name 和 typed 的字符都是小写字母。
 * //
 * //
 * //
 * //
 * //
 * // Related Topics 双指针 字符串
 * // 👍 76 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/long-pressed-name/">长按键入</a>
 */
public class LongPressedName{
	public static void main(String[] args){
		Solution solution = new LongPressedName()
				.new Solution();
		
		///输出：true
		System.out.println(solution.isLongPressedName("alex", "aaleex"));
		//输出：false
		System.out.println(solution.isLongPressedName("saeed", "ssaaedd"));
		//输出：true
		System.out.println(solution.isLongPressedName("leelee", "lleeelee"));
		//输出：true
		System.out.println(solution.isLongPressedName("laiden", "laiden"));
		//输出：false
		System.out.println(solution.isLongPressedName("pyplrz", "ppyypllr"));
		//false
		System.out.println(solution.isLongPressedName("alex", "alexxr"));
	}
	
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public boolean isLongPressedName(String name, String typed){
			if(name.length() > typed.length()){
				return false;
			}
			
			int nPointer = 0;
			int tPointer = 0;
			
			while(nPointer < name.length()){
				char n    = name.charAt(nPointer);
				int  nNum = 1;
				while(nPointer + nNum < name.length() && n == name.charAt(nPointer + nNum)){
					nNum++;
				}
				nPointer += nNum - 1;
				
				char t    = typed.charAt(tPointer);
				int  tNum = 1;
				while(tPointer + tNum < typed.length() && t == typed.charAt(tPointer + tNum)){
					tNum++;
				}
				if(nNum > tNum){
					return false;
				}
				tPointer += tNum - 1;
				
				n = name.charAt(nPointer);
				t = typed.charAt(tPointer);
				//System.out.println("n=" + n + ",t=" + t);
				
				if(n != t){
					return false;
				}
				nPointer++;
				tPointer++;
				if(tPointer >= typed.length()){
					return nPointer >= name.length();
				}
				while(typed.charAt(tPointer) == typed.charAt(tPointer - 1)){
					tPointer++;
				}
			}
			
			return tPointer == typed.length();
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
