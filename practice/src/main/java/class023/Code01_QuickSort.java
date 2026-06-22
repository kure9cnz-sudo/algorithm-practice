// Practice version generated from class023/Code01_QuickSort.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class023;

// 随机快速排序，acm练习风格
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

public class Code01_QuickSort {

	public static int MAXN = 100001;

	public static int[] arr = new int[MAXN];

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
		quickSort2(0, n - 1);
		for (int i = 0; i < n - 1; i++) {
			out.print(arr[i] + " ");
		}
		out.println(arr[n - 1]);
		out.flush();
		out.close();
		br.close();
	}

	// 随机快速排序经典版(不推荐)
	// 甚至在洛谷上测试因为递归开太多层会爆栈导致出错
	public static void quickSort1(int l, int r) {
		throw new UnsupportedOperationException("TODO: implement quickSort1 in practice module");
	}

	// 已知arr[l....r]范围上一定有x这个值
	// 划分数组 <=x放左边，>x放右边
	// 并且确保划分完成后<=x区域的最后一个数字是x
	public static int partition1(int l, int r, int x) {
		throw new UnsupportedOperationException("TODO: implement partition1 in practice module");
	}

	public static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// 随机快速排序改进版(推荐)
	// 可以通过所有测试用例
	public static void quickSort2(int l, int r) {
		throw new UnsupportedOperationException("TODO: implement quickSort2 in practice module");
	}

	// 荷兰国旗问题
	public static int first, last;

	// 已知arr[l....r]范围上一定有x这个值
	// 划分数组 <x放左边，==x放中间，>x放右边
	// 把全局变量first, last，更新成==x区域的左右边界
	public static void partition2(int l, int r, int x) {
		throw new UnsupportedOperationException("TODO: implement partition2 in practice module");
	}

}