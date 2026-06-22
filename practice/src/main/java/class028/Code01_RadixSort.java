// Practice version generated from class028/Code01_RadixSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class028;

// 基数排序，acm练习风格
// 测试链接 : https://www.luogu.com.cn/problem/P1177
// 请同学们务必参考如下代码中关于输入、输出的处理
// 这是输入输出处理效率很高的写法
// 提交以下的code，提交时请把类名改成"Main"，可以直接通过

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Code01_RadixSort {

	// 可以设置进制，不一定10进制，随你设置
	public static int BASE = 10;

	public static int MAXN = 100001;

	public static int[] arr = new int[MAXN];

	public static int[] help = new int[MAXN];

	public static int[] cnts = new int[BASE];

	public static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		n = (int) in.nval;
		for (int i = 0; i < n; i++) {
			in.nextToken();
			arr[i] = (int) in.nval;
		}
		sort();
		for (int i = 0; i < n - 1; i++) {
			out.print(arr[i] + " ");
		}
		out.println(arr[n - 1]);
		out.flush();
		out.close();
		br.close();
	}

	public static void sort() {
		throw new UnsupportedOperationException("TODO: implement sort in practice module");
	}

	// 返回number在BASE进制下有几位
	public static int bits(int number) {
		throw new UnsupportedOperationException("TODO: implement bits in practice module");
	}

	// 基数排序核心代码
	// arr内要保证没有负数
	// m是arr中最大值在BASE进制下有几位
	public static void radixSort(int bits) {
		throw new UnsupportedOperationException("TODO: implement radixSort in practice module");
	}

}