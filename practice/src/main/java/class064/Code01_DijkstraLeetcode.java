// Practice version generated from class064/Code01_DijkstraLeetcode.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class064;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// Dijkstra算法模版（Leetcode）
// 网络延迟时间
// 有 n 个网络节点，标记为 1 到 n
// 给你一个列表 times，表示信号经过 有向 边的传递时间
// times[i] = (ui, vi, wi)，表示从ui到vi传递信号的时间是wi
// 现在，从某个节点 s 发出一个信号
// 需要多久才能使所有节点都收到信号
// 如果不能使所有节点收到信号，返回 -1
// 测试链接 : https://leetcode.cn/problems/network-delay-time
public class Code01_DijkstraLeetcode {

	// 动态建图+普通堆的实现
	public static int networkDelayTime1(int[][] times, int n, int s) {
		throw new UnsupportedOperationException("TODO: implement networkDelayTime1 in practice module");
	}

	// 链式前向星+反向索引堆的实现
	public static int networkDelayTime2(int[][] times, int n, int s) {
		throw new UnsupportedOperationException("TODO: implement networkDelayTime2 in practice module");
	}

	public static int MAXN = 101;

	public static int MAXM = 6001;

	// 链式前向星
	public static int[] head = new int[MAXN];

	public static int[] next = new int[MAXM];

	public static int[] to = new int[MAXM];

	public static int[] weight = new int[MAXM];

	public static int cnt;

	// 反向索引堆
	public static int[] heap = new int[MAXN];

	// where[v] = -1，表示v这个节点，从来没有进入过堆
	// where[v] = -2，表示v这个节点，已经弹出过了
	// where[v] = i(>=0)，表示v这个节点，在堆上的i位置
	public static int[] where = new int[MAXN];

	public static int heapSize;

	public static int[] distance = new int[MAXN];

	public static void build(int n) {
		throw new UnsupportedOperationException("TODO: implement build in practice module");
	}

	// 链式前向星建图
	public static void addEdge(int u, int v, int w) {
		throw new UnsupportedOperationException("TODO: implement addEdge in practice module");
	}

	public static void addOrUpdateOrIgnore(int v, int c) {
		throw new UnsupportedOperationException("TODO: implement addOrUpdateOrIgnore in practice module");
	}

	public static void heapInsert(int i) {
		throw new UnsupportedOperationException("TODO: implement heapInsert in practice module");
	}

	public static int pop() {
		throw new UnsupportedOperationException("TODO: implement pop in practice module");
	}

	public static void heapify(int i) {
		throw new UnsupportedOperationException("TODO: implement heapify in practice module");
	}

	public static boolean isEmpty() {
		throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
	}

	public static void swap(int i, int j) {
		int tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
		where[heap[i]] = i;
		where[heap[j]] = j;
	}

}
