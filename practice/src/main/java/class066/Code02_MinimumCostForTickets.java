// Practice version generated from class066/Code02_MinimumCostForTickets.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class066;

import java.util.Arrays;

// 最低票价
// 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行
// 在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出
// 每一项是一个从 1 到 365 的整数
// 火车票有 三种不同的销售方式
// 一张 为期1天 的通行证售价为 costs[0] 美元
// 一张 为期7天 的通行证售价为 costs[1] 美元
// 一张 为期30天 的通行证售价为 costs[2] 美元
// 通行证允许数天无限制的旅行
// 例如，如果我们在第 2 天获得一张 为期 7 天 的通行证
// 那么我们可以连着旅行 7 天(第2~8天)
// 返回 你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费
// 测试链接 : https://leetcode.cn/problems/minimum-cost-for-tickets/
public class Code02_MinimumCostForTickets {

	// 无论提交什么方法都带着这个数组      0  1  2
	public static int[] durations = { 1, 7, 30 };

	// 暴力尝试
	public static int mincostTickets1(int[] days, int[] costs) {
		throw new UnsupportedOperationException("TODO: implement mincostTickets1 in practice module");
	}

	// days[i..... 最少花费是多少 
	public static int f1(int[] days, int[] costs, int i) {
		throw new UnsupportedOperationException("TODO: implement f1 in practice module");
	}

	// 暴力尝试改记忆化搜索
	// 从顶到底的动态规划
	public static int mincostTickets2(int[] days, int[] costs) {
		throw new UnsupportedOperationException("TODO: implement mincostTickets2 in practice module");
	}

	public static int f2(int[] days, int[] costs, int i, int[] dp) {
		throw new UnsupportedOperationException("TODO: implement f2 in practice module");
	}

	// 严格位置依赖的动态规划
	// 从底到顶的动态规划
	public static int MAXN = 366;

	public static int[] dp = new int[MAXN];

	public static int mincostTickets3(int[] days, int[] costs) {
		throw new UnsupportedOperationException("TODO: implement mincostTickets3 in practice module");
	}

}
