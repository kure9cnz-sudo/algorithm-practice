// Practice version generated from class027/Code02_MaxCover.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class027;

// 最多线段重合问题
// 测试链接 : https://www.nowcoder.com/practice/1ae8d0b6bb4e4bcdbf64ec491f63fc37
// 测试链接 : https://leetcode.cn/problems/meeting-rooms-ii/
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
import java.util.PriorityQueue;

public class Code02_MaxCover {

	public static int MAXN = 10001;

	public static int[][] line = new int[MAXN][2];

	public static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			for (int i = 0; i < n; i++) {
				in.nextToken();
				line[i][0] = (int) in.nval;
				in.nextToken();
				line[i][1] = (int) in.nval;
			}
			out.println(compute());
		}
		out.flush();
		out.close();
		br.close();
	}

	public static int compute() {
		throw new UnsupportedOperationException("TODO: implement compute in practice module");
	}

	// 小根堆，堆顶0位置
	public static int[] heap = new int[MAXN];

	// 堆的大小
	public static int size;

	public static void add(int x) {
		throw new UnsupportedOperationException("TODO: implement add in practice module");
	}

	public static void pop() {
		throw new UnsupportedOperationException("TODO: implement pop in practice module");
	}

	public static void swap(int i, int j) {
		int tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	// 也找到了leetcode测试链接
	// 测试链接 : https://leetcode.cn/problems/meeting-rooms-ii/
	// 提交如下代码可以直接通过
	public static int minMeetingRooms(int[][] meeting) {
		throw new UnsupportedOperationException("TODO: implement minMeetingRooms in practice module");
	}

	// 上面的leetcode题目是会员题，需要付费
	// 如果不想开通leetcode会员，还有一个类似的题，但是注意题意，和课上讲的有细微差别
	// 课上讲的题目，认为[1,4]、[4、5]可以严丝合缝接在一起，不算有重合
	// 但是如下链接的题目，认为[1,4]、[4、5]有重合部分，也就是4
	// 除此之外再无差别
	// 测试链接 : https://leetcode.cn/problems/divide-intervals-into-minimum-number-of-groups/
	// 提交如下代码可以直接通过
	public static int minGroups(int[][] meeting) {
		throw new UnsupportedOperationException("TODO: implement minGroups in practice module");
	}

}
