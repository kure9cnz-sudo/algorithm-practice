// Practice version generated from class036/Code09_CountCompleteTreeNodes.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class036;

// 求完全二叉树的节点个数
// 测试链接 : https://leetcode.cn/problems/count-complete-tree-nodes/
public class Code09_CountCompleteTreeNodes {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	// 提交如下的方法
	public static int countNodes(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement countNodes in practice module");
	}

	// cur : 当前来到的节点
	// level :  当前来到的节点在第几层
	// h : 整棵树的高度，不是cur这棵子树的高度
	// 求 : cur这棵子树上有多少节点
	public static int f(TreeNode cur, int level, int h) {
		throw new UnsupportedOperationException("TODO: implement f in practice module");
	}

	// 当前节点是cur，并且它在level层
	// 返回从cur开始不停往左，能扎到几层
	public static int mostLeft(TreeNode cur, int level) {
		throw new UnsupportedOperationException("TODO: implement mostLeft in practice module");
	}

}
