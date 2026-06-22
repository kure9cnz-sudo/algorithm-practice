// Practice version generated from class066/Code03_DecodeWays.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class066;

import java.util.Arrays;

// 解码方法
// 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
// 'A' -> "1"
// 'B' -> "2"
// ...
// 'Z' -> "26"
// 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）
// 例如，"11106" 可以映射为："AAJF"、"KJF"
// 注意，消息不能分组为(1 11 06)，因为 "06" 不能映射为 "F"
// 这是由于 "6" 和 "06" 在映射中并不等价
// 给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数
// 题目数据保证答案肯定是一个 32位 的整数
// 测试链接 : https://leetcode.cn/problems/decode-ways/
public class Code03_DecodeWays {

	// 暴力尝试
	public static int numDecodings1(String s) {
		throw new UnsupportedOperationException("TODO: implement numDecodings1 in practice module");
	}

	// s : 数字字符串 
	// s[i....]有多少种有效的转化方案
	public static int f1(char[] s, int i) {
		throw new UnsupportedOperationException("TODO: implement f1 in practice module");
	}

	// 暴力尝试改记忆化搜索
	public static int numDecodings2(String s) {
		throw new UnsupportedOperationException("TODO: implement numDecodings2 in practice module");
	}

	public static int f2(char[] s, int i, int[] dp) {
		throw new UnsupportedOperationException("TODO: implement f2 in practice module");
	}

	// 严格位置依赖的动态规划
	public static int numDecodings3(String str) {
		throw new UnsupportedOperationException("TODO: implement numDecodings3 in practice module");
	}

	// 严格位置依赖的动态规划 + 空间压缩
	public static int numDecodings4(String s) {
		throw new UnsupportedOperationException("TODO: implement numDecodings4 in practice module");
	}

}
