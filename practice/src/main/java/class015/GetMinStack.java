// Practice version generated from class015/GetMinStack.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class015;

import java.util.Stack;

// 最小栈
// 测试链接 : https://leetcode.cn/problems/min-stack/
public class GetMinStack {

	// 提交时把类名、构造方法改成MinStack
	class MinStack1 {
		public Stack<Integer> data;
		public Stack<Integer> min;

		public MinStack1() {
			data = new Stack<Integer>();
			min = new Stack<Integer>();
		}

		public void push(int val) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public void pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int top() {
			throw new UnsupportedOperationException("TODO: implement top in practice module");
		}

		public int getMin() {
			throw new UnsupportedOperationException("TODO: implement getMin in practice module");
		}
	}

	// 提交时把类名、构造方法改成MinStack
	class MinStack2 {
		// leetcode的数据在测试时，同时在栈里的数据不超过这个值
		// 这是几次提交实验出来的，哈哈
		// 如果leetcode补测试数据了，超过这个量导致出错，就调大
		public final int MAXN = 8001;

		public int[] data;
		public int[] min;
		int size;

		public MinStack2() {
			data = new int[MAXN];
			min = new int[MAXN];
			size = 0;
		}

		public void push(int val) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public void pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int top() {
			throw new UnsupportedOperationException("TODO: implement top in practice module");
		}

		public int getMin() {
			throw new UnsupportedOperationException("TODO: implement getMin in practice module");
		}
	}

}
