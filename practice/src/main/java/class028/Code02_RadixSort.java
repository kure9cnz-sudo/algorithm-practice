// Practice version generated from class028/Code02_RadixSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class028;

import java.util.Arrays;

// 基数排序
// 测试链接 : https://leetcode.cn/problems/sort-an-array/
public class Code02_RadixSort {

	// 可以设置进制，不一定10进制，随你设置
	public static int BASE = 10;

	public static int MAXN = 50001;

	public static int[] help = new int[MAXN];

	public static int[] cnts = new int[BASE];

	public static int[] sortArray(int[] arr) {
		throw new UnsupportedOperationException("TODO: implement sortArray in practice module");
	}

	// 返回number在BASE进制下有几位
	public static int bits(int number) {
		throw new UnsupportedOperationException("TODO: implement bits in practice module");
	}

	// 基数排序核心代码
	// arr内要保证没有负数
	// n是arr的长度
	// bits是arr中最大值在BASE进制下有几位
	public static void radixSort(int[] arr, int n, int bits) {
		throw new UnsupportedOperationException("TODO: implement radixSort in practice module");
	}

}
