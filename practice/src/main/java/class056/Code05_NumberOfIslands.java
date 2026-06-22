// Practice version generated from class056/Code05_NumberOfIslands.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class056;

// 岛屿数量
// 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成
// 此外，你可以假设该网格的四条边均被水包围
// 测试链接 : https://leetcode.cn/problems/number-of-islands/
public class Code05_NumberOfIslands {

	// 并查集的做法
	public static int numIslands(char[][] board) {
		throw new UnsupportedOperationException("TODO: implement numIslands in practice module");
	}

	public static int MAXSIZE = 100001;

	public static int[] father = new int[MAXSIZE];

	public static int cols;

	public static int sets;

	public static void build(int n, int m, char[][] board) {
		throw new UnsupportedOperationException("TODO: implement build in practice module");
	}

	public static int index(int a, int b) {
		throw new UnsupportedOperationException("TODO: implement index in practice module");
	}

	public static int find(int i) {
		throw new UnsupportedOperationException("TODO: implement find in practice module");
	}

	public static void union(int a, int b, int c, int d) {
		throw new UnsupportedOperationException("TODO: implement union in practice module");
	}

}
