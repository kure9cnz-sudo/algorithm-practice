// Practice version generated from class032/Code01_Bitset.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class032;

import java.util.HashSet;

// 位图的实现
// Bitset(int size)
// void add(int num)
// void remove(int num)
// void reverse(int num)
// boolean contains(int num)
public class Code01_Bitset {

	// 位图的实现
	// 使用时num不要超过初始化的大小
	public static class Bitset {
		public int[] set;

		// n个数字 : 0~n-1
		public Bitset(int n) {
			// a/b如果结果想向上取整，可以写成 : (a+b-1)/b
			// 前提是a和b都是非负数
			set = new int[(n + 31) / 32];
		}

		public void add(int num) {
			throw new UnsupportedOperationException("TODO: implement add in practice module");
		}

		public void remove(int num) {
			throw new UnsupportedOperationException("TODO: implement remove in practice module");
		}

		public void reverse(int num) {
			throw new UnsupportedOperationException("TODO: implement reverse in practice module");
		}

		public boolean contains(int num) {
			throw new UnsupportedOperationException("TODO: implement contains in practice module");
		}

	}

	// 对数器测试
	public static void main(String[] args) {
		int n = 1000;
		int testTimes = 10000;
		System.out.println("测试开始");
		// 实现的位图结构
		Bitset bitSet = new Bitset(n);
		// 直接用HashSet做对比测试
		HashSet<Integer> hashSet = new HashSet<>();
		System.out.println("调用阶段开始");
		for (int i = 0; i < testTimes; i++) {
			double decide = Math.random();
			// number -> 0 ~ n-1，等概率得到
			int number = (int) (Math.random() * n);
			if (decide < 0.333) {
				bitSet.add(number);
				hashSet.add(number);
			} else if (decide < 0.666) {
				bitSet.remove(number);
				hashSet.remove(number);
			} else {
				bitSet.reverse(number);
				if (hashSet.contains(number)) {
					hashSet.remove(number);
				} else {
					hashSet.add(number);
				}
			}
		}
		System.out.println("调用阶段结束");
		System.out.println("验证阶段开始");
		for (int i = 0; i < n; i++) {
			if (bitSet.contains(i) != hashSet.contains(i)) {
				System.out.println("出错了!");
			}
		}
		System.out.println("验证阶段结束");
		System.out.println("测试结束");
	}

}
