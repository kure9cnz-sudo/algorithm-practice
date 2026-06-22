// Practice version generated from class021/Code01_MergeSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class021;

// 归并排序，acm练习风格
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

public class Code01_MergeSort {

	public static int MAXN = 100001;

	public static int[] arr = new int[MAXN];

	public static int[] help = new int[MAXN];

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
		// mergeSort1(0, n - 1);
		mergeSort2();
		for (int i = 0; i < n - 1; i++) {
			out.print(arr[i] + " ");
		}
		out.println(arr[n - 1]);
		out.flush();
		out.close();
		br.close();
	}

	// 归并排序递归版
	// 假设l...r一共n个数
	// T(n) = 2 * T(n/2) + O(n)
	// a = 2, b = 2, c = 1
	// 根据master公式，时间复杂度O(n * logn)
	// 空间复杂度O(n)
	public static void mergeSort1(int l, int r) {
		throw new UnsupportedOperationException("TODO: implement mergeSort1 in practice module");
	}

	// 归并排序非递归版
	// 时间复杂度O(n * logn)
	// 空间复杂度O(n)
	public static void mergeSort2() {
		throw new UnsupportedOperationException("TODO: implement mergeSort2 in practice module");
	}

	// l....r 一共有n个数
	// O(n)
	public static void merge(int l, int m, int r) {
		throw new UnsupportedOperationException("TODO: implement merge in practice module");
	}

}