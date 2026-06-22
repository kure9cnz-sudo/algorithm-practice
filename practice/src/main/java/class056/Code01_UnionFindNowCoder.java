// Practice version generated from class056/Code01_UnionFindNowCoder.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class056;

// 并查集模版(牛客)
// 路径压缩 + 小挂大
// 测试链接 : https://www.nowcoder.com/practice/e7ed657974934a30b2010046536a5372
// 请同学们务必参考如下代码中关于输入、输出的处理
// 这是输入输出处理效率很高的写法
// 提交以下的code，提交时请把类名改成"Main"，可以直接通过

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code01_UnionFindNowCoder {

	public static int MAXN = 1000001;

	public static int[] father = new int[MAXN];

	public static int[] size = new int[MAXN];

	public static int[] stack = new int[MAXN];

	public static int n;

	public static void build() {
		throw new UnsupportedOperationException("TODO: implement build in practice module");
	}

	// i号节点，往上一直找，找到代表节点返回！
	public static int find(int i) {
		throw new UnsupportedOperationException("TODO: implement find in practice module");
	}

	public static boolean isSameSet(int x, int y) {
		throw new UnsupportedOperationException("TODO: implement isSameSet in practice module");
	}

	public static void union(int x, int y) {
		throw new UnsupportedOperationException("TODO: implement union in practice module");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			build();
			in.nextToken();
			int m = (int) in.nval;
			for (int i = 0; i < m; i++) {
				in.nextToken();
				int op = (int) in.nval;
				in.nextToken();
				int x = (int) in.nval;
				in.nextToken();
				int y = (int) in.nval;
				if (op == 1) {
					out.println(isSameSet(x, y) ? "Yes" : "No");
				} else {
					union(x, y);
				}
			}
		}
		out.flush();
		out.close();
		br.close();
	}

}
