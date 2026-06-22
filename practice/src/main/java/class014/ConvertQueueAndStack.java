// Practice version generated from class014/ConvertQueueAndStack.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class014;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 用栈实现队列
// 用队列实现栈
public class ConvertQueueAndStack {

	// 测试链接 : https://leetcode.cn/problems/implement-queue-using-stacks/
	class MyQueue {

		public Stack<Integer> in;

		public Stack<Integer> out;

		public MyQueue() {
			in = new Stack<Integer>();
			out = new Stack<Integer>();
		}

		// 倒数据
		// 从in栈，把数据倒入out栈
		// 1) out空了，才能倒数据
		// 2) 如果倒数据，in必须倒完
		private void inToOut() {
			throw new UnsupportedOperationException("TODO: implement inToOut in practice module");
		}

		public void push(int x) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public int pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int peek() {
			throw new UnsupportedOperationException("TODO: implement peek in practice module");
		}

		public boolean empty() {
			throw new UnsupportedOperationException("TODO: implement empty in practice module");
		}

	}

	// 测试链接 : https://leetcode.cn/problems/implement-stack-using-queues/
	class MyStack {

		Queue<Integer> queue;

		public MyStack() {
			queue = new LinkedList<Integer>();
		}

		// O(n)
		public void push(int x) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public int pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int top() {
			throw new UnsupportedOperationException("TODO: implement top in practice module");
		}

		public boolean empty() {
			throw new UnsupportedOperationException("TODO: implement empty in practice module");
		}

	}

}
