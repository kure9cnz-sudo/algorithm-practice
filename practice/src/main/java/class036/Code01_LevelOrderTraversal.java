// Practice version generated from class036/Code01_LevelOrderTraversal.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class036;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 二叉树的层序遍历
// 测试链接 : https://leetcode.cn/problems/binary-tree-level-order-traversal/
public class Code01_LevelOrderTraversal {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	// 提交时把方法名改为levelOrder，此方法为普通bfs，此题不推荐
	public static List<List<Integer>> levelOrder1(TreeNode root) {
		throw new UnsupportedOperationException("TODO: implement levelOrder1 in practice module");
	}

	// 如果测试数据量变大了就修改这个值
	public static int MAXN = 2001;

	public static TreeNode[] queue = new TreeNode[MAXN];

	public static int l, r;

	// 提交时把方法名改为levelOrder，此方法为每次处理一层的优化bfs，此题推荐
	public static List<List<Integer>> levelOrder2(TreeNode root) {
		throw new UnsupportedOperationException("TODO: implement levelOrder2 in practice module");
	}

}
