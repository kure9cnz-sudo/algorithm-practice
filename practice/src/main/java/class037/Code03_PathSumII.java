// Practice version generated from class037/Code03_PathSumII.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class037;

import java.util.ArrayList;
import java.util.List;

// 收集累加和等于aim的所有路径
// 测试链接 : https://leetcode.cn/problems/path-sum-ii/
public class Code03_PathSumII {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	// 提交如下的方法
	public static List<List<Integer>> pathSum(TreeNode root, int aim) {
		throw new UnsupportedOperationException("TODO: implement pathSum in practice module");
	}

	public static void f(TreeNode cur, int aim, int sum, List<Integer> path, List<List<Integer>> ans) {
		throw new UnsupportedOperationException("TODO: implement f in practice module");
	}

	public static void copy(List<Integer> path, List<List<Integer>> ans) {
		List<Integer> copy = new ArrayList<>();
		for (Integer num : path) {
			copy.add(num);
		}
		ans.add(copy);
	}

}
