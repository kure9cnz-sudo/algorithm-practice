// Practice version generated from class065/Code03_BellmanFord.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class065;

import java.util.Arrays;

// Bellman-Ford算法应用（不是模版）
// k站中转内最便宜的航班
// 有 n 个城市通过一些航班连接。给你一个数组 flights
// 其中 flights[i] = [fromi, toi, pricei]
// 表示该航班都从城市 fromi 开始，以价格 pricei 抵达 toi。
// 现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到出一条最多经过 k 站中转的路线
// 使得从 src 到 dst 的 价格最便宜 ，并返回该价格。 如果不存在这样的路线，则输出 -1。
// 测试链接 : https://leetcode.cn/problems/cheapest-flights-within-k-stops/
public class Code03_BellmanFord {

	// Bellman-Ford算法
	// 针对此题改写了松弛逻辑，课上讲了细节
	public static int findCheapestPrice(int n, int[][] flights, int start, int target, int k) {
		throw new UnsupportedOperationException("TODO: implement findCheapestPrice in practice module");
	}

}
