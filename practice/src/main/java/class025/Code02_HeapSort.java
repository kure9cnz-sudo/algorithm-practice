// Practice version generated from class025/Code02_HeapSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class025;

// 堆结构和堆排序，填函数练习风格
// 测试链接 : https://leetcode.cn/problems/sort-an-array/
public class Code02_HeapSort {

	public static int[] sortArray(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement sortArray in practice module");
	}

	// i位置的数，向上调整大根堆
	// arr[i] = x，x是新来的！往上看，直到不比父亲大，或者来到0位置(顶)
	public static void heapInsert(int[] arr, int i) {
		throw new UnsupportedOperationException("TODO: implement heapInsert in practice module");
	}

	// i位置的数，变小了，又想维持大根堆结构
	// 向下调整大根堆
	// 当前堆的大小为size
	public static void heapify(int[] arr, int i, int size) {
		throw new UnsupportedOperationException("TODO: implement heapify in practice module");
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// 从顶到底建立大根堆，O(n * logn)
	// 依次弹出堆内最大值并排好序，O(n * logn)
	// 整体时间复杂度O(n * logn)
	public static void heapSort1(int[] arr) {
		throw new UnsupportedOperationException("TODO: implement heapSort1 in practice module");
	}

	// 从底到顶建立大根堆，O(n)
	// 依次弹出堆内最大值并排好序，O(n * logn)
	// 整体时间复杂度O(n * logn)
	public static void heapSort2(int[] arr) {
		throw new UnsupportedOperationException("TODO: implement heapSort2 in practice module");
	}

}