// Practice version generated from class024/RandomizedSelect.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class024;

// 无序数组中第K大的元素
// 测试链接 : https://leetcode.cn/problems/kth-largest-element-in-an-array/
public class RandomizedSelect {

	// 随机选择算法，时间复杂度O(n)
	public static int findKthLargest(int[] nums, int k) {
		throw new UnsupportedOperationException("TODO: implement findKthLargest in practice module");
	}

	// 如果arr排序的话，在i位置的数字是什么
	public static int randomizedSelect(int[] arr, int i) {
		int ans = 0;
		for (int l = 0, r = arr.length - 1; l <= r;) {
			// 随机这一下，常数时间比较大
			// 但只有这一下随机，才能在概率上把时间复杂度收敛到O(n)
			partition(arr, l, r, arr[l + (int) (Math.random() * (r - l + 1))]);
			// 因为左右两侧只需要走一侧
			// 所以不需要临时变量记录全局的first、last
			// 直接用即可
			if (i < first) {
				r = first - 1;
			} else if (i > last) {
				l = last + 1;
			} else {
				ans = arr[i];
				break;
			}
		}
		return ans;
	}

	// 荷兰国旗问题
	public static int first, last;

	public static void partition(int[] arr, int l, int r, int x) {
		throw new UnsupportedOperationException("TODO: implement partition in practice module");
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
