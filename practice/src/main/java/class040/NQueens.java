// Practice version generated from class040/NQueens.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class040;

// N皇后问题
// 测试链接 : https://leetcode.cn/problems/n-queens-ii/
public class NQueens {

	// 用数组表示路径实现的N皇后问题，不推荐
	public static int totalNQueens1(int n) {
		throw new UnsupportedOperationException("TODO: implement totalNQueens1 in practice module");
	}

	// i : 当前来到的行
	// path : 0...i-1行的皇后，都摆在了哪些列
	// n : 是几皇后问题
	// 返回 : 0...i-1行已经摆完了，i....n-1行可以去尝试的情况下还能找到几种有效的方法
	public static int f1(int i, int[] path, int n) {
		throw new UnsupportedOperationException("TODO: implement f1 in practice module");
	}

	// 当前在i行、j列的位置，摆了一个皇后
	// 0...i-1行的皇后状况，path[0...i-1]
	// 返回会不会冲突，不会冲突，有效！true
	// 会冲突，无效，返回false
	public static boolean check(int[] path, int i, int j) {
		throw new UnsupportedOperationException("TODO: implement check in practice module");
	}

	// 用位信息表示路径实现的N皇后问题，推荐
	public static int totalNQueens2(int n) {
		throw new UnsupportedOperationException("TODO: implement totalNQueens2 in practice module");
	}

	// limit : 当前是几皇后问题
	// 之前皇后的列影响：col
	// 之前皇后的右上 -> 左下对角线影响：left
	// 之前皇后的左上 -> 右下对角线影响：right
	public static int f2(int limit, int col, int left, int right) {
		throw new UnsupportedOperationException("TODO: implement f2 in practice module");
	}

	public static void main(String[] args) {
		int n = 14;
		long start, end;
		System.out.println("测试开始");
		System.out.println("解决" + n + "皇后问题");
		start = System.currentTimeMillis();
		System.out.println("方法1答案 : " + totalNQueens1(n));
		end = System.currentTimeMillis();
		System.out.println("方法1运行时间 : " + (end - start) + " 毫秒");

		start = System.currentTimeMillis();
		System.out.println("方法2答案 : " + totalNQueens2(n));
		end = System.currentTimeMillis();
		System.out.println("方法2运行时间 : " + (end - start) + " 毫秒");
		System.out.println("测试结束");

		System.out.println("=======");
		System.out.println("只有位运算的版本，才能10秒内跑完16皇后问题的求解过程");
		start = System.currentTimeMillis();
		int ans = totalNQueens2(16);
		end = System.currentTimeMillis();
		System.out.println("16皇后问题的答案 : " + ans);
		System.out.println("运行时间 : " + (end - start) + " 毫秒");
	}

}
