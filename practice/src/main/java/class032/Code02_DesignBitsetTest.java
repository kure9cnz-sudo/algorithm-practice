// Practice version generated from class032/Code02_DesignBitsetTest.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class032;

// 位图的实现
// Bitset是一种能以紧凑形式存储位的数据结构
// Bitset(int n) : 初始化n个位，所有位都是0
// void fix(int i) : 将下标i的位上的值更新为1
// void unfix(int i) : 将下标i的位上的值更新为0
// void flip() : 翻转所有位的值
// boolean all() : 是否所有位都是1
// boolean one() : 是否至少有一位是1
// int count() : 返回所有位中1的数量
// String toString() : 返回所有位的状态
public class Code02_DesignBitsetTest {

	// 测试链接 : https://leetcode-cn.com/problems/design-bitset/
	class Bitset {
		private int[] set;
		private final int size;
		private int zeros;
		private int ones;
		private boolean reverse;

		public Bitset(int n) {
			set = new int[(n + 31) / 32];
			size = n;
			zeros = n;
			ones = 0;
			reverse = false;
		}

		// 把i这个数字加入到位图
		public void fix(int i) {
			throw new UnsupportedOperationException("TODO: implement fix in practice module");
		}

		// 把i这个数字从位图中移除
		public void unfix(int i) {
			throw new UnsupportedOperationException("TODO: implement unfix in practice module");
		}

		public void flip() {
			throw new UnsupportedOperationException("TODO: implement flip in practice module");
		}

		public boolean all() {
			throw new UnsupportedOperationException("TODO: implement all in practice module");
		}

		public boolean one() {
			throw new UnsupportedOperationException("TODO: implement one in practice module");
		}

		public int count() {
			throw new UnsupportedOperationException("TODO: implement count in practice module");
		}

		public String toString() {
			throw new UnsupportedOperationException("TODO: implement toString in practice module");
		}

	}

}
