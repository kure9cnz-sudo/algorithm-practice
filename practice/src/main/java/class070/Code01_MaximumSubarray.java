// Practice version generated from class070/Code01_MaximumSubarray.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class070;

// 子数组最大累加和
// 给你一个整数数组 nums
// 返回非空子数组的最大累加和
// 测试链接 : https://leetcode.cn/problems/maximum-subarray/
public class Code01_MaximumSubarray {

	// 动态规划
	public static int maxSubArray1(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement maxSubArray1 in practice module");
	}

	// 空间压缩
	public static int maxSubArray2(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement maxSubArray2 in practice module");
	}

	// 如下代码为附加问题的实现
	// 子数组中找到拥有最大累加和的子数组
	// 并返回如下三个信息:
	// 1) 最大累加和子数组的开头left
	// 2) 最大累加和子数组的结尾right
	// 3) 最大累加和子数组的累加和sum
	// 如果不止一个子数组拥有最大累加和，那么找到哪一个都可以
	public static int left;

	public static int right;

	public static int sum;

	// 找到拥有最大累加和的子数组
	// 更新好全局变量left、right、sum
	// 上游调用函数可以直接使用这三个变量
	// 相当于返回了三个值
	public static void extra(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement extra in practice module");
	}

}
