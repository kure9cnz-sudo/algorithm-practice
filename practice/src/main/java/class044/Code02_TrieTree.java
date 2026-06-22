// Practice version generated from class044/Code02_TrieTree.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class044;

// 用固定数组实现前缀树，空间使用是静态的。推荐！
// 测试链接 : https://www.nowcoder.com/practice/7f8a8553ddbf4eaab749ec988726702b
// 请同学们务必参考如下代码中关于输入、输出的处理
// 这是输入输出处理效率很高的写法
// 提交以下的code，提交时请把类名改成"Main"，可以直接通过

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class Code02_TrieTree {

	// 如果将来增加了数据量，就改大这个值
	public static int MAXN = 150001;

	public static int[][] tree = new int[MAXN][26];

	public static int[] end = new int[MAXN];

	public static int[] pass = new int[MAXN];

	public static int cnt;

	public static void build() {
		throw new UnsupportedOperationException("TODO: implement build in practice module");
	}

	public static void insert(String word) {
		throw new UnsupportedOperationException("TODO: implement insert in practice module");
	}

	public static int search(String word) {
		throw new UnsupportedOperationException("TODO: implement search in practice module");
	}

	public static int prefixNumber(String pre) {
		throw new UnsupportedOperationException("TODO: implement prefixNumber in practice module");
	}

	public static void delete(String word) {
		throw new UnsupportedOperationException("TODO: implement delete in practice module");
	}

	public static void clear() {
		throw new UnsupportedOperationException("TODO: implement clear in practice module");
	}

	public static int m, op;

	public static String[] splits;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String line = null;
		while ((line = in.readLine()) != null) {
			build();
			m = Integer.valueOf(line);
			for (int i = 1; i <= m; i++) {
				splits = in.readLine().split(" ");
				op = Integer.valueOf(splits[0]);
				if (op == 1) {
					insert(splits[1]);
				} else if (op == 2) {
					delete(splits[1]);
				} else if (op == 3) {
					out.println(search(splits[1]) > 0 ? "YES" : "NO");
				} else if (op == 4) {
					out.println(prefixNumber(splits[1]));
				}
			}
			clear();
		}
		out.flush();
		in.close();
		out.close();
	}

}