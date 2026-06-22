// Practice version generated from class023/Code02_QuickSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class023;

// 随机快速排序，填函数练习风格
// 测试链接 : https://leetcode.cn/problems/sort-an-array/

public class Code02_QuickSort {

	public static int[] sortArray(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement sortArray in practice module");
	}

	// 随机快速排序经典版(不推荐)
	public static void quickSort1(int[] arr, int l, int r) {
		throw new UnsupportedOperationException("TODO: implement quickSort1 in practice module");
	}

	// 已知arr[l....r]范围上一定有x这个值
	// 划分数组 <=x放左边，>x放右边，并且确保划分完成后<=x区域的最后一个数字是x
	public static int partition1(int[] arr, int l, int r, int x) {
		throw new UnsupportedOperationException("TODO: implement partition1 in practice module");
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// 随机快速排序改进版(推荐)
	public static void quickSort2(int[] arr, int l, int r) {
		throw new UnsupportedOperationException("TODO: implement quickSort2 in practice module");
	}

	// 荷兰国旗问题
	public static int first, last;

	// 已知arr[l....r]范围上一定有x这个值
	// 划分数组 <x放左边，==x放中间，>x放右边
	// 把全局变量first, last，更新成==x区域的左右边界
	public static void partition2(int[] arr, int l, int r, int x) {
		throw new UnsupportedOperationException("TODO: implement partition2 in practice module");
	}

}