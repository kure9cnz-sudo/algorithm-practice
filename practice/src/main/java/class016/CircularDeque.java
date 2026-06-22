// Practice version generated from class016/CircularDeque.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class016;

import java.util.Deque;
import java.util.LinkedList;

// 设计循环双端队列
// 测试链接 : https://leetcode.cn/problems/design-circular-deque/
public class CircularDeque {

	// 提交时把类名、构造方法改成 : MyCircularDeque
	// 其实内部就是双向链表
	// 常数操作慢，但是leetcode数据量太小了，所以看不出劣势
	class MyCircularDeque1 {

		public Deque<Integer> deque = new LinkedList<>();
		public int size;
		public int limit;

		public MyCircularDeque1(int k) {
			size = 0;
			limit = k;
		}

		public boolean insertFront(int value) {
			throw new UnsupportedOperationException("TODO: implement insertFront in practice module");
		}

		public boolean insertLast(int value) {
			throw new UnsupportedOperationException("TODO: implement insertLast in practice module");
		}

		public boolean deleteFront() {
			throw new UnsupportedOperationException("TODO: implement deleteFront in practice module");
		}

		public boolean deleteLast() {
			throw new UnsupportedOperationException("TODO: implement deleteLast in practice module");
		}

		public int getFront() {
			throw new UnsupportedOperationException("TODO: implement getFront in practice module");
		}

		public int getRear() {
			throw new UnsupportedOperationException("TODO: implement getRear in practice module");
		}

		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public boolean isFull() {
			throw new UnsupportedOperationException("TODO: implement isFull in practice module");
		}

	}

	// 提交时把类名、构造方法改成 : MyCircularDeque
	// 自己用数组实现，常数操作快，但是leetcode数据量太小了，看不出优势
	class MyCircularDeque2 {

		public int[] deque;
		public int l, r, size, limit;

		public MyCircularDeque2(int k) {
			deque = new int[k];
			l = r = size = 0;
			limit = k;
		}

		public boolean insertFront(int value) {
			throw new UnsupportedOperationException("TODO: implement insertFront in practice module");
		}

		public boolean insertLast(int value) {
			throw new UnsupportedOperationException("TODO: implement insertLast in practice module");
		}

		public boolean deleteFront() {
			throw new UnsupportedOperationException("TODO: implement deleteFront in practice module");
		}

		public boolean deleteLast() {
			throw new UnsupportedOperationException("TODO: implement deleteLast in practice module");
		}

		public int getFront() {
			throw new UnsupportedOperationException("TODO: implement getFront in practice module");
		}

		public int getRear() {
			throw new UnsupportedOperationException("TODO: implement getRear in practice module");
		}

		public boolean isEmpty() {
			throw new UnsupportedOperationException("TODO: implement isEmpty in practice module");
		}

		public boolean isFull() {
			throw new UnsupportedOperationException("TODO: implement isFull in practice module");
		}

	}

}
