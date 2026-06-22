// Practice version generated from class038/Code01_Subsequences.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class038;

import java.util.HashSet;

// 字符串的全部子序列
// 子序列本身是可以有重复的，只是这个题目要求去重
// 测试链接 : https://www.nowcoder.com/practice/92e6247998294f2c933906fdedbc6e6a
public class Code01_Subsequences {

	public static String[] generatePermutation1(String str) {
		char[] s = str.toCharArray();
		HashSet<String> set = new HashSet<>();
		f1(s, 0, new StringBuilder(), set);
		int m = set.size();
		String[] ans = new String[m];
		int i = 0;
		for (String cur : set) {
			ans[i++] = cur;
		}
		return ans;
	}

	// s[i...]，之前决定的路径path，set收集结果时去重
	public static void f1(char[] s, int i, StringBuilder path, HashSet<String> set) {
		throw new UnsupportedOperationException("TODO: implement f1 in practice module");
	}

	public static String[] generatePermutation2(String str) {
		char[] s = str.toCharArray();
		HashSet<String> set = new HashSet<>();
		f2(s, 0, new char[s.length], 0, set);
		int m = set.size();
		String[] ans = new String[m];
		int i = 0;
		for (String cur : set) {
			ans[i++] = cur;
		}
		return ans;
	}

	public static void f2(char[] s, int i, char[] path, int size, HashSet<String> set) {
		throw new UnsupportedOperationException("TODO: implement f2 in practice module");
	}

}
