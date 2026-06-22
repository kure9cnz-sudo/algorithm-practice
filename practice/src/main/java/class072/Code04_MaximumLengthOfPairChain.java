// Practice version generated from class072/Code04_MaximumLengthOfPairChain.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class072;

import java.util.Arrays;

// 最长数对链
// 给你一个由n个数对组成的数对数组pairs
// 其中 pairs[i] = [lefti, righti] 且 lefti < righti
// 现在，我们定义一种 跟随 关系，当且仅当 b < c 时
// 数对 p2 = [c, d] 才可以跟在 p1 = [a, b] 后面
// 我们用这种形式来构造 数对链
// 找出并返回能够形成的最长数对链的长度
// 测试链接 : https://leetcode.cn/problems/maximum-length-of-pair-chain/
public class Code04_MaximumLengthOfPairChain {

	public static int findLongestChain(int[][] pairs) {
		throw new UnsupportedOperationException("TODO: implement findLongestChain in practice module");
	}

	// >= num最左位置
	public static int bs(int[] ends, int len, int num) {
		throw new UnsupportedOperationException("TODO: implement bs in practice module");
	}

	// 最优解利用贪心
	public static int findLongestChain2(int[][] pairs) {
		throw new UnsupportedOperationException("TODO: implement findLongestChain2 in practice module");
	}

}
