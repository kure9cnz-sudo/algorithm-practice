// Practice version generated from class072/Code01_LongestIncreasingSubsequence.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class072;

// 最长递增子序列和最长不下降子序列
// 给定一个整数数组nums
// 找到其中最长严格递增子序列长度、最长不下降子序列长度
// 测试链接 : https://leetcode.cn/problems/longest-increasing-subsequence/
public class Code01_LongestIncreasingSubsequence {

	// 普通解法的动态规划
	// 时间复杂度O(n^2)，数组稍大就会超时
	public static int lengthOfLIS1(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement lengthOfLIS1 in practice module");
	}

	// 最优解
	// 时间复杂度O(n * logn)
	public static int lengthOfLIS2(int[] nums) {
		throw new UnsupportedOperationException("TODO: implement lengthOfLIS2 in practice module");
	}

	// "最长递增子序列"使用如下二分搜索 :
	// ends[0...len-1]是严格升序的，找到>=num的最左位置
	// 如果不存在返回-1
	public static int bs1(int[] ends, int len, int num) {
		throw new UnsupportedOperationException("TODO: implement bs1 in practice module");
	}

	// 如果求最长不下降子序列，那么使用如下的二分搜索 :
	// ends[0...len-1]是不降序的
	// 在其中找到>num的最左位置，如果不存在返回-1
	// 如果求最长不下降子序列，就在lengthOfLIS中把bs1方法换成bs2方法
	// 已经用对数器验证了，是正确的
	public static int bs2(int[] ends, int len, int num) {
		throw new UnsupportedOperationException("TODO: implement bs2 in practice module");
	}

}
