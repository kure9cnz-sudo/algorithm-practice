// Practice version generated from class046/Code01_PrefixSumArray.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class046;

// 利用前缀和快速得到区域累加和
// 测试链接 : https://leetcode.cn/problems/range-sum-query-immutable/
public class Code01_PrefixSumArray {

	class NumArray {

		public int[] sum;

		public NumArray(int[] nums) {
			sum = new int[nums.length + 1];
			for (int i = 1; i <= nums.length; i++) {
				sum[i] = sum[i - 1] + nums[i - 1];
			}
		}

		public int sumRange(int left, int right) {
			throw new UnsupportedOperationException("TODO: implement sumRange in practice module");
		}
	}

}
