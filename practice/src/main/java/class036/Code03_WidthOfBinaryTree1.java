// Practice version generated from class036/Code03_WidthOfBinaryTree1.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class036;

// 二叉树的最大特殊宽度，java版
// 测试链接 : https://leetcode.cn/problems/maximum-width-of-binary-tree/
public class Code03_WidthOfBinaryTree1 {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	// 提交以下的方法
	// 用每次处理一层的优化bfs就非常容易实现
	// 如果测试数据量变大了就修改这个值
	public static int MAXN = 3001;

	public static TreeNode[] nq = new TreeNode[MAXN];

	public static long[] iq = new long[MAXN];

	public static int l, r;

	public static int widthOfBinaryTree(TreeNode root) {
		throw new UnsupportedOperationException("TODO: implement widthOfBinaryTree in practice module");
	}

}
