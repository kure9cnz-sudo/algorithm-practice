// Practice version generated from class051/Code01_KokoEatingBananas.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class051;

// 爱吃香蕉的珂珂
// 珂珂喜欢吃香蕉。这里有 n 堆香蕉，第 i 堆中有 piles[i] 根香蕉
// 警卫已经离开了，将在 h 小时后回来。
// 珂珂可以决定她吃香蕉的速度 k （单位：根/小时)
// 每个小时，她将会选择一堆香蕉，从中吃掉 k 根
// 如果这堆香蕉少于 k 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉
// 珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。
// 返回她可以在 h 小时内吃掉所有香蕉的最小速度 k（k 为整数）
// 测试链接 : https://leetcode.cn/problems/koko-eating-bananas/
public class Code01_KokoEatingBananas {

	// 时间复杂度O(n * log(max))，额外空间复杂度O(1)
	public static int minEatingSpeed(int[] piles, int h) {
		throw new UnsupportedOperationException("TODO: implement minEatingSpeed in practice module");
	}

	// 香蕉重量都在piles
	// 速度就定成speed
	// 返回吃完所有的香蕉，耗费的小时数量
	public static long f(int[] piles, int speed) {
		throw new UnsupportedOperationException("TODO: implement f in practice module");
	}

}
