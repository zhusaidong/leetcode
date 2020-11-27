package com.zhusaidong.leetcode.editor.cn;

import com.zhusaidong.leetcode.libs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * //给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * //
 * // struct Node {
 * //  int val;
 * //  Node *left;
 * //  Node *right;
 * //  Node *next;
 * //}
 * //
 * // 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * // 初始状态下，所有 next 指针都被设置为 NULL。
 * //
 * // 示例：
 * <p>
 * 输入：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":{"$id":"6","left":null,"next":null,"right":null,"val":6},"next":null,"right":{"$id":"7","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}
 * <p>
 * 输出：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":{"$id":"6","left":null,"next":null,"right":null,"val":7},"right":null,"val":6},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"7","left":{"$ref":"5"},"next":null,"right":{"$ref":"6"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"7"},"val":1}
 * //
 * //解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
 * //
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/15/116_sample.png"/>
 * // 提示：
 * //
 * // 你只能使用常量级额外空间。
 * // 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 * //
 * // Related Topics 树 深度优先搜索 广度优先搜索
 * // 👍 346 👎 0
 *
 * @author zhusaidong
 * @see <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">填充每个节点的下一个右侧节点指针</a>
 */
public class PopulatingNextRightPointersInEachNode{
	static
			//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
	
	class Solution{
		public Node connect(Node root){
			HashMap<Integer, List<Node>> map = new HashMap<>(16);
			connect(root, 0, map);
			map.forEach((level, list) -> {
				for(int i = 0; i < list.size() - 1; i++){
					list.get(i).next = list.get(i + 1);
				}
			});
			map.clear();
			
			return root;
		}
		
		public void connect(Node root, Integer level, Map<Integer, List<Node>> map){
			if(root == null){
				return;
			}
			if(level > 0){
				List<Node> nodes = map.get(level);
				if(nodes == null){
					nodes = new ArrayList<>();
				}
				nodes.add(root);
				map.put(level, nodes);
			}
			connect(root.left, level + 1, map);
			connect(root.right, level + 1, map);
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)
}
