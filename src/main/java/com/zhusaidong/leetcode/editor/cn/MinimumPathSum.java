package com.zhusaidong.leetcode.editor.cn;

/**
 * //给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * //
 * // 说明：每次只能向下或者向右移动一步。
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * //输出：7
 * //解释：因为路径 1→3→1→1→1 的总和最小。
 * //
 * //
 * // 示例 2：
 * //
 * //
 * //输入：grid = [[1,2,3],[4,5,6]]
 * //输出：12
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // m == grid.length
 * // n == grid[i].length
 * // 1 <= m, n <= 200
 * // 0 <= grid[i][j] <= 100
 * //
 * // Related Topics 数组 动态规划
 * // 👍 713 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/minimum-path-sum/">最小路径和</a>
 */
public class MinimumPathSum{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int minPathSum(int[][] grid){
			if(grid.length == 0){
				return 0;
			}
			int x = grid.length;
			if(grid[0].length == 0){
				return 0;
			}
			int y = grid[0].length;
			
			int[][] paths = new int[x][y];
			paths[0][0] = grid[0][0];
			
			for(int i = 1; i < x; i++){
				paths[i][0] = grid[i][0] + paths[i - 1][0] ;
			}
			for(int i = 1; i < y; i++){
				paths[0][i] = grid[0][i] + paths[0][i - 1];
			}
			
			//System.out.println(Arrays.deepToString(paths));
			
			for(int i = 1; i < x; i++){
				for(int j = 1; j < y; j++){
					paths[i][j] = Math.min(paths[i][j - 1], paths[i - 1][j]) + grid[i][j];
				}
			}
			//System.out.println(Arrays.deepToString(paths));
			
			return paths[x - 1][y - 1];
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
