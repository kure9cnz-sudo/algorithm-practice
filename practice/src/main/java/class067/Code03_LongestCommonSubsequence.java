// Practice version generated from class067/Code03_LongestCommonSubsequence.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class067;

// 最长公共子序列
// 给定两个字符串text1和text2
// 返回这两个字符串的最长 公共子序列 的长度
// 如果不存在公共子序列，返回0
// 两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列
// 测试链接 : https://leetcode.cn/problems/longest-common-subsequence/
public class Code03_LongestCommonSubsequence {

	public static int longestCommonSubsequence1(String str1, String str2) {
		throw new UnsupportedOperationException("TODO: implement longestCommonSubsequence1 in practice module");
	}

	// s1[0....i1]与s2[0....i2]最长公共子序列长度
	public static int f1(char[] s1, char[] s2, int i1, int i2) {
		throw new UnsupportedOperationException("TODO: implement f1 in practice module");
	}

	// 为了避免很多边界讨论
	// 很多时候往往不用下标来定义尝试，而是用长度来定义尝试
	// 因为长度最短是0，而下标越界的话讨论起来就比较麻烦
	public static int longestCommonSubsequence2(String str1, String str2) {
		throw new UnsupportedOperationException("TODO: implement longestCommonSubsequence2 in practice module");
	}

	// s1[前缀长度为len1]对应s2[前缀长度为len2]
	// 最长公共子序列长度
	public static int f2(char[] s1, char[] s2, int len1, int len2) {
		throw new UnsupportedOperationException("TODO: implement f2 in practice module");
	}

	// 记忆化搜索
	public static int longestCommonSubsequence3(String str1, String str2) {
		throw new UnsupportedOperationException("TODO: implement longestCommonSubsequence3 in practice module");
	}

	public static int f3(char[] s1, char[] s2, int len1, int len2, int[][] dp) {
		throw new UnsupportedOperationException("TODO: implement f3 in practice module");
	}

	// 严格位置依赖的动态规划
	public static int longestCommonSubsequence4(String str1, String str2) {
		throw new UnsupportedOperationException("TODO: implement longestCommonSubsequence4 in practice module");
	}

	// 严格位置依赖的动态规划 + 空间压缩
	public static int longestCommonSubsequence5(String str1, String str2) {
		throw new UnsupportedOperationException("TODO: implement longestCommonSubsequence5 in practice module");
	}

}
