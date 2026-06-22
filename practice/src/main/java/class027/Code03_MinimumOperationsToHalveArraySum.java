// Practice version generated from class027/Code03_MinimumOperationsToHalveArraySum.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class027;

import java.util.PriorityQueue;

// 将数组和减半的最少操作次数
// 测试链接 : https://leetcode.cn/problems/minimum-operations-to-halve-array-sum/
public class Code03_MinimumOperationsToHalveArraySum {

	// 提交时把halveArray1改名为halveArray
	public static int halveArray1(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement halveArray1 in practice module");
	}

	public static int MAXN = 100001;

	public static long[] heap = new long[MAXN];

	public static int size;

	// 提交时把halveArray2改名为halveArray
	public static int halveArray2(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement halveArray2 in practice module");
	}

	public static void heapify(int i) {
		throw new UnsupportedOperationException("TODO: implement heapify in practice module");
	}

	public static void swap(int i, int j) {
		long tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

}
