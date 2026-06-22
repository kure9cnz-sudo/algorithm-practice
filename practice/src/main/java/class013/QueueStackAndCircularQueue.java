// Practice version generated from class013/QueueStackAndCircularQueue.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class013;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueStackAndCircularQueue {

	// 直接用java内部的实现
	// 其实内部就是双向链表，常数操作慢
	public static class Queue1 {

		// java中的双向链表LinkedList
		// 单向链表就足够了
		public Queue<Integer> queue = new LinkedList<>();

		// 调用任何方法之前，先调用这个方法来判断队列内是否有东西
		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		// 向队列中加入num，加到尾巴
		public void offer(int num) {
			throw new UnsupportedOperationException("TODO: implement offer in practice module");
		}

		// 从队列拿，从头拿
		public int poll() {
			throw new UnsupportedOperationException("TODO: implement poll in practice module");
		}

		// 返回队列头的元素但是不弹出
		public int peek() {
			throw new UnsupportedOperationException("TODO: implement peek in practice module");
		}

		// 返回目前队列里有几个数
		public int size() {
			throw new UnsupportedOperationException("TODO: implement size in practice module");
		}

	}

	// 实际刷题时更常见的写法，常数时间好
	// 如果可以确定加入操作的总次数不超过n，那么可以用
	// 一般笔试、面试都会有一个明确数据量，所以这是最常用的方式
	public static class Queue2 {

		public int[] queue;
		public int l;
		public int r;

		// 加入操作的总次数上限是多少，一定要明确
		public Queue2(int n) {
			queue = new int[n];
			l = 0;
			r = 0;
		}

		// 调用任何方法之前，先调用这个方法来判断队列内是否有东西
		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public void offer(int num) {
			throw new UnsupportedOperationException("TODO: implement offer in practice module");
		}

		public int poll() {
			throw new UnsupportedOperationException("TODO: implement poll in practice module");
		}
		// ?
		// l...r-1 r
		// [l..r)
		public int head() {
			throw new UnsupportedOperationException("TODO: implement head in practice module");
		}

		public int tail() {
			throw new UnsupportedOperationException("TODO: implement tail in practice module");
		}

		public int size() {
			throw new UnsupportedOperationException("TODO: implement size in practice module");
		}

	}

	// 直接用java内部的实现
	// 其实就是动态数组，不过常数时间并不好
	public static class Stack1 {

		public Stack<Integer> stack = new Stack<>();

		// 调用任何方法之前，先调用这个方法来判断栈内是否有东西
		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public void push(int num) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public int pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int peek() {
			throw new UnsupportedOperationException("TODO: implement peek in practice module");
		}

		public int size() {
			throw new UnsupportedOperationException("TODO: implement size in practice module");
		}

	}

	// 实际刷题时更常见的写法，常数时间好
	// 如果可以保证同时在栈里的元素个数不会超过n，那么可以用
	// 也就是发生弹出操作之后，空间可以复用
	// 一般笔试、面试都会有一个明确数据量，所以这是最常用的方式
	public static class Stack2 {

		public int[] stack;
		public int size;

		// 同时在栈里的元素个数不会超过n
		public Stack2(int n) {
			stack = new int[n];
			size = 0;
		}

		// 调用任何方法之前，先调用这个方法来判断栈内是否有东西
		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public void push(int num) {
			throw new UnsupportedOperationException("TODO: implement push in practice module");
		}

		public int pop() {
			throw new UnsupportedOperationException("TODO: implement pop in practice module");
		}

		public int peek() {
			throw new UnsupportedOperationException("TODO: implement peek in practice module");
		}

		public int size() {
			throw new UnsupportedOperationException("TODO: implement size in practice module");
		}

	}

	// 设计循环队列
	// 测试链接 : https://leetcode.cn/problems/design-circular-queue/
	class MyCircularQueue {

		public int[] queue;

		public int l, r, size, limit;

		// 同时在队列里的数字个数，不要超过k
		public MyCircularQueue(int k) {
			queue = new int[k];
			l = r = size = 0;
			limit = k;
		}

		// 如果队列满了，什么也不做，返回false
		// 如果队列没满，加入value，返回true
		public boolean enQueue(int value) {
			throw new UnsupportedOperationException("TODO: implement enQueue in practice module");
		}

		// 如果队列空了，什么也不做，返回false
		// 如果队列没空，弹出头部的数字，返回true
		public boolean deQueue() {
			throw new UnsupportedOperationException("TODO: implement deQueue in practice module");
		}

		// 返回队列头部的数字（不弹出），如果没有数返回-1
		public int Front() {
			throw new UnsupportedOperationException("TODO: implement Front in practice module");
		}

		public int Rear() {
			throw new UnsupportedOperationException("TODO: implement Rear in practice module");
		}

		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public boolean isFull() {
			throw new UnsupportedOperationException("TODO: implement isFull in practice module");
		}

	}

}
