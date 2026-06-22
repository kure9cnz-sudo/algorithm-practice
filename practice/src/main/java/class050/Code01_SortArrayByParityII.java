// Practice version generated from class050/Code01_SortArrayByParityII.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class050;

// 按奇偶排序数组II
// 给定一个非负整数数组 nums。nums 中一半整数是奇数 ，一半整数是偶数
// 对数组进行排序，以便当 nums[i] 为奇数时，i也是奇数
// 当 nums[i] 为偶数时， i 也是 偶数
// 你可以返回 任何满足上述条件的数组作为答案
// 测试链接 : https://leetcode.cn/problems/sort-array-by-parity-ii/
public class Code01_SortArrayByParityII {

	// 时间复杂度O(n)，额外空间复杂度O(1)
	public static int[] sortArrayByParityII(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement sortArrayByParityII in practice module");
	}

	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

}
