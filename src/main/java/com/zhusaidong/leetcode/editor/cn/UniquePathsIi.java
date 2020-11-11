package com.zhusaidong.leetcode.editor.cn;

import java.util.Arrays;

/**
 * //一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * //
 * // 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * //
 * // 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * //
 * // <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/robot_maze.png"/>
 * //
 * // 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * //
 * //
 * //
 * // 示例 1：
 * // <img src="https://assets.leetcode.com/uploads/2020/11/04/robot1.jpg"/>
 * //
 * //输入：obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * //输出：2
 * //解释：
 * //3x3 网格的正中间有一个障碍物。
 * //从左上角到右下角一共有 2 条不同的路径：
 * //1. 向右 -> 向右 -> 向下 -> 向下
 * //2. 向下 -> 向下 -> 向右 -> 向右
 * //
 * //
 * // 示例 2：
 * // <img src="https://assets.leetcode.com/uploads/2020/11/04/robot2.jpg"/>
 * //
 * //输入：obstacleGrid = [[0,1],[0,0]]
 * //输出：1
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // m == obstacleGrid.length
 * // n == obstacleGrid[i].length
 * // 1 <= m, n <= 100
 * // obstacleGrid[i][j] 为 0 或 1
 * //
 * // Related Topics 数组 动态规划
 * // 👍 441 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/unique-paths-ii/">不同路径 II</a>
 */
public class UniquePathsIi{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
	class Solution{
		public int uniquePathsWithObstacles(int[][] obstacleGrid){
			int m = obstacleGrid.length;
			if(m == 0){
				return 0;
			}
			int n = obstacleGrid[0].length;
			
			//傻逼写的用例。题目明明写了机器人位于(0,0)位置，怎么可能再放障碍物
			if(obstacleGrid[0][0] == 1){
				return 0;
			}
			
			int[][] area = new int[m][n];
			for(int i = 0; i < m; i++){
				if(obstacleGrid[i][0] == 1){
					area[i][0] = 0;
					break;
				}else{
					area[i][0] = 1;
				}
			}
			//System.out.println(Arrays.deepToString(area));
			
			for(int i = 0; i < n; i++){
				if(obstacleGrid[0][i] == 1){
					area[0][i] = 0;
					break;
				}else{
					area[0][i] = 1;
				}
			}
			//System.out.println(Arrays.deepToString(area));
			
			for(int i = 1; i < m; i++){
				for(int j = 1; j < n; j++){
					area[i][j] = obstacleGrid[i][j] == 1 ? 0 : (area[i - 1][j] + area[i][j - 1]);
				}
			}
			//System.out.println(Arrays.deepToString(area));
			
			return area[m - 1][n - 1];
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
