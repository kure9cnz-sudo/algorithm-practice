// Practice version generated from class068/Code02_EditDistance.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class068;

// 编辑距离
// 给你两个单词 word1 和 word2
// 请返回将 word1 转换成 word2 所使用的最少代价
// 你可以对一个单词进行如下三种操作：
// 插入一个字符，代价a
// 删除一个字符，代价b
// 替换一个字符，代价c
// 测试链接 : https://leetcode.cn/problems/edit-distance/
public class Code02_EditDistance {

	// 已经展示太多次从递归到动态规划了
	// 直接写动态规划吧
	public int minDistance(String word1, String word2) {
		throw new UnsupportedOperationException("TODO: implement minDistance in practice module");
	}

	// 原初尝试版
	// a : str1中插入1个字符的代价
	// b : str1中删除1个字符的代价
	// c : str1中改变1个字符的代价
	// 返回从str1转化成str2的最低代价
	public static int editDistance1(String str1, String str2, int a, int b, int c) {
		throw new UnsupportedOperationException("TODO: implement editDistance1 in practice module");
	}

	// 枚举小优化版
	// a : str1中插入1个字符的代价
	// b : str1中删除1个字符的代价
	// c : str1中改变1个字符的代价
	// 返回从str1转化成str2的最低代价
	public static int editDistance2(String str1, String str2, int a, int b, int c) {
		throw new UnsupportedOperationException("TODO: implement editDistance2 in practice module");
	}

	// 空间压缩
	public static int editDistance3(String str1, String str2, int a, int b, int c) {
		throw new UnsupportedOperationException("TODO: implement editDistance3 in practice module");
	}

}
