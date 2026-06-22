// Practice version generated from class059/Code01_CreateGraph.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class059;

import java.util.ArrayList;
import java.util.Arrays;

public class Code01_CreateGraph {

	// 点的最大数量
	public static int MAXN = 11;

	// 边的最大数量
	// 只有链式前向星方式建图需要这个数量
	// 注意如果无向图的最大数量是m条边，数量要准备m*2
	// 因为一条无向边要加两条有向边
	public static int MAXM = 21;

	// 邻接矩阵方式建图
	public static int[][] graph1 = new int[MAXN][MAXN];

	// 邻接表方式建图
	// public static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();
	public static ArrayList<ArrayList<int[]>> graph2 = new ArrayList<>();

	// 链式前向星方式建图
	public static int[] head = new int[MAXN];

	public static int[] next = new int[MAXM];

	public static int[] to = new int[MAXM];

	// 如果边有权重，那么需要这个数组
	public static int[] weight = new int[MAXM];

	public static int cnt;

	public static void build(int n) {
		throw new UnsupportedOperationException("TODO: implement build in practice module");
	}

	// 链式前向星加边
	public static void addEdge(int u, int v, int w) {
		throw new UnsupportedOperationException("TODO: implement addEdge in practice module");
	}

	// 三种方式建立有向图带权图
	public static void directGraph(int[][] edges) {
		throw new UnsupportedOperationException("TODO: implement directGraph in practice module");
	}

	// 三种方式建立无向图带权图
	public static void undirectGraph(int[][] edges) {
		throw new UnsupportedOperationException("TODO: implement undirectGraph in practice module");
	}

	public static void traversal(int n) {
		throw new UnsupportedOperationException("TODO: implement traversal in practice module");
	}

	public static void main(String[] args) {
		// 理解了带权图的建立过程，也就理解了不带权图
		// 点的编号为1...n
		// 例子1自己画一下图，有向带权图，然后打印结果
		int n1 = 4;
		int[][] edges1 = { { 1, 3, 6 }, { 4, 3, 4 }, { 2, 4, 2 }, { 1, 2, 7 }, { 2, 3, 5 }, { 3, 1, 1 } };
		build(n1);
		directGraph(edges1);
		traversal(n1);
		System.out.println("==============================");
		// 例子2自己画一下图，无向带权图，然后打印结果
		int n2 = 5;
		int[][] edges2 = { { 3, 5, 4 }, { 4, 1, 1 }, { 3, 4, 2 }, { 5, 2, 4 }, { 2, 3, 7 }, { 1, 5, 5 }, { 4, 2, 6 } };
		build(n2);
		undirectGraph(edges2);
		traversal(n2);
	}

}
